/*
Bài tập 33.
a. Mô tả cách thực hiện cơ chế Abstraction của các đối tượng trên lớp của thư viện LibraryResource , Book, Magazine.
b. Chọn lớp LibraryResource  là lớp trừu tượng , có các hàm trừu tượng borrow, returnItem  kiểu void không đối.
c. Khai báo các lớp kế thừa Book,  Magazine  của lớp trừu tượng có các hàm tương ứng với các hàm trừu tượng được cài đặt lại
d. Viết code cho các hàm của lớp kế thừa từ lớp trừu tượng.
e. Khai báo các đối tượng tài sản của thư viện và cấp phát đối tượng trong hàm main để kiểm tra.
 */
package javatuan9;
/*
33a
Tạo 2 phương thức trừu tượng borrow() và returnItem() được khai báo ở lớp cha Vehicle.
Tạo 2 lớp con Book và Magazine kế thừa và khởi tạo chúng 
Trong main, Khởi tạo đối tượng của 2 lớp con và gọi phương thức Book() và Magazine() để KT
*/

abstract class LibraryResource{
    abstract void borrow();
    abstract void returnItem();
}

class Book extends LibraryResource{
    @Override
    void borrow() {
        System.out.println("book borrow. ");
    }

    @Override
    void returnItem() {
        System.out.println("book returnItem .");
    }   
}

class Magazine extends LibraryResource{
    @Override
    void borrow() {
        System.out.println("Manazine borrow. . ");
    }

    @Override
    void returnItem() {
        System.out.println("Manazine returnItem. ");
    }
    
}

public class bai33 {
    
}
