package exp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private ArrayList<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        JOptionPane.showMessageDialog(null, "Sản phẩm đã được thêm vào đơn hàng.");
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(productName)) {
                products.remove(i);
                JOptionPane.showMessageDialog(null, "Sản phẩm đã được xóa khỏi đơn hàng.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm trong đơn hàng.");
    }

    public void searchProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                JOptionPane.showMessageDialog(null, "Tên sản phẩm: " + product.getName() + "\nGiá: " + product.getPrice());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm trong đơn hàng.");
    }

    public void displayOrder() {
        double total = 0.0;
        StringBuilder orderDetails = new StringBuilder("Danh sách sản phẩm trong đơn hàng:\n");
        for (Product product : products) {
            orderDetails.append("Tên sản phẩm: ").append(product.getName()).append(", Giá: ").append(product.getPrice()).append("\n");
            total += product.getPrice();
        }
        orderDetails.append("Tổng giá: ").append(total);
        JOptionPane.showMessageDialog(null, orderDetails.toString());
    }

    public void confirmOrder() {
        JOptionPane.showMessageDialog(null, "Đơn hàng đã được xác nhận và hoàn tất.");
    }
}

public class OrderManagementSystem extends JFrame implements ActionListener {
    private Order order;

    private JButton addProductButton, removeProductButton, searchProductButton, displayOrderButton, confirmOrderButton;
    private JTextField productNameField, productPriceField, searchProductNameField;

    public OrderManagementSystem() {
        setTitle("Order Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("Tên sản phẩm:"));
        productNameField = new JTextField();
        panel.add(productNameField);

        panel.add(new JLabel("Giá sản phẩm:"));
        productPriceField = new JTextField();
        panel.add(productPriceField);

        addProductButton = new JButton("Thêm sản phẩm");
        addProductButton.addActionListener(this);
        panel.add(addProductButton);

        panel.add(new JLabel("Tìm kiếm sản phẩm:"));
        searchProductNameField = new JTextField();
        panel.add(searchProductNameField);

        searchProductButton = new JButton("Tìm kiếm");
        searchProductButton.addActionListener(this);
        panel.add(searchProductButton);

        removeProductButton = new JButton("Xóa sản phẩm");
        removeProductButton.addActionListener(this);
        panel.add(removeProductButton);

        displayOrderButton = new JButton("Hiển thị đơn hàng");
        displayOrderButton.addActionListener(this);
        panel.add(displayOrderButton);

        confirmOrderButton = new JButton("Xác nhận và hoàn tất đơn hàng");
        confirmOrderButton.addActionListener(this);
        panel.add(confirmOrderButton);

        add(panel);
        setVisible(true);

        order = new Order();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addProductButton) {
            String productName = productNameField.getText();
            double productPrice = Double.parseDouble(productPriceField.getText());
            Product newProduct = new Product(productName, productPrice);
            order.addProduct(newProduct);
        } else if (e.getSource() == searchProductButton) {
            String searchProductName = searchProductNameField.getText();
            order.searchProduct(searchProductName);
        } else if (e.getSource() == removeProductButton) {
            String removeProductName = JOptionPane.showInputDialog(null, "Nhập tên sản phẩm cần xóa:");
            order.removeProduct(removeProductName);
        } else if (e.getSource() == displayOrderButton) {
            order.displayOrder();
        } else if (e.getSource() == confirmOrderButton) {
            order.confirmOrder();
        }
    }

    public static void main(String[] args) {
        new OrderManagementSystem();
    }
}

