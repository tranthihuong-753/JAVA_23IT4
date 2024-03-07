/*
ý 1 
Viết một lớp Circle trong Java để biểu diễn hình tròn.

Lớp này có một thuộc tính private là radius để lưu bán kính của hình tròn.

Sử dụng các phương thức getter và setter để truy cập và thiết lập giá trị của radius.

Bên cạnh đó, lớp Circle cũng có một phương thức public calculateArea() để tính diện tích của hình tròn.

Sau đó, viết một lớp Main để kiểm tra lớp Circle 
bằng cách tạo đối tượng và sử dụng các phương thức và thuộc tính đã định nghĩa.

Dịch và chạy code trên với Java compile online
https://www.onlinegdb.com/online_java_compiler (Links to an external site.)  (Links to an external site.)

Dịch và chạy code trên với Java IDE Netbeans, JDK
Chạy code trên với Javascript.
Mở rộng code của class Circle

ý 2 
Thêm method tính chu vi của lớp Circle. Gọi method hiển thị kết quả trong hàm main()
Thay đổi biến private của lớp Circle thành public và truy cập trực tiếp biến radius mà không cần thông qua hàm set/getRadius 
để gán và hiển thị kết quả các hàm tính diện tích và chu vi của một đối tượng đường tròn.
Thay đổi phạm vi các methods tính diện tích, chu vi của lớp Circle thành private. Điều gì sẽ xảy ra?
 */
/*
//ý 1
package javatuanTET;

public class bai_3_Circle {
    private double radius;
    //Lấy giá trị kiểu double của radius 
    public double getRadius(){
        return radius;
    }
    //Gán giá trị double của radius cho đối tượng hiện tại ( this ) 
    public void setRadius(double radius){
        this.radius=radius;
    }
    //Tạo phuonwg thức calculateArea() để tính và print diện tích của hình tròn
    public double calculateArea(){
        double S=3.14*radius*radius;
        return S;
    }
}
*/

/*
//ý 2 thuộc tính chu vi , diện tích là public 
package javatuanTET;

public class bai_3_Circle {
    public double radius;

    //Tạo phương thức perimeter() để tính và print chu  của hình tròn
    public double perimeter(){
        double C=2*3.14*radius;
        return C;
    }

    //Tạo phương thức calculateArea() để tính và print diện tích của hình tròn
    public double calculateArea(){
        double S=3.14*radius*radius;
        return S;
    }
}
*/

//ý 2 thuộc tính chu vi , diện tích tu public thành private 
//làm cho 2 thuộc tính này không thể thay đổi / sử dụng từ các lớp khác, chỉ có thể thay đổi trong lớp bai_3_Circle
package javatuanTET;

public class bai_3_Circle {
    public double radius;
    //Tạo phương thức calculateArea() để tính và print diện tích của hình tròn
    private double calculateArea(){
        double S=3.14*radius*radius;
        return S;
    }
    double Si=calculateArea();
    public double getCalculateArea(){
        return Si;
    }
    public void setCalculateArea(double Si){
        this.Si=Si;
    }
    //Tạo phương thức perimeter() để tính và print chu vi của hình tròn
    private double perimeter(){
        double C=2*3.14*radius;
        return C;
    }
    double Ci=perimeter();
    public double getPerimeter(){
        return Ci;
    }
    public void setPerimeter(double Ci){
        this.Ci=Ci;
    }
}
