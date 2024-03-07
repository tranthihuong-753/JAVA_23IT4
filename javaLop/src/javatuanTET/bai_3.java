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
// ý 1 
package javatuanTET;

public class bai_3 {
    public static void main(String[] args){
        bai_3_Circle  circle=new bai_3_Circle ();
        //Sử dụng các phương thức getter và setter để truy cập và thiết lập giá trị của radius trong lớp bai_3_Circle bằng 1.0
        circle.setRadius(4.0);
        //Tính diện tích từ phuonwg thức calculateArea của lớp bai_3_Circle
        double Area=circle.calculateArea();
        //in ra màn hình diện tích
        System.out.println("Diện tích = "+Area);
    }
}
*/

/*
//ý 2 thuộc tính chu vi , diện tích là public 
package javatuanTET;

public class bai_3 {
    public static void main(String[] args){
        bai_3_Circle  circle=new bai_3_Circle ();
        //Gán giá trị cho radius của lớp bai_3_Circle
        circle.radius=4.5;
        //Tính chu vi bằng thuộc tính peperemeter() của lớp bai_3_Circle
        double C=circle.perimeter();
        //in ra màn hình diện tích
        System.out.println("Chu vi = "+C);        
        //Tính diện tích bằng thuộc tính calculateArea() của lớp bai_3_Circle
        double Area=circle.calculateArea();
        //in ra màn hình diện tích
        System.out.println("Diện tích = "+Area);
    }
}
*/

//ý 2 thuộc tính chu vi , diện tích là private 
