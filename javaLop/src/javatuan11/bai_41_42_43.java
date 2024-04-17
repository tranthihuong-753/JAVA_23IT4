/*
Luyện tập tổng hợp 4 nguyên lý của OOP+ interface+phạm vi biến: static-private-protected-public, 
bổ sung khai báo loại lớp không cho kế thừa và biến không cho sửa (khai báo final) sau khi khởi đầu.

Công dụng:
Sử dụng lớp final để ngăn chặn việc kế thừa lớp và sử dụng phương thức final để ngăn chặn việc ghi đè phương thức.

Bài tập 40.
Tạo một interface có tên MakeSoundable có một phương thức duy nhất được gọi là makeSound().
Tạo một lớp trừu tượng có tên Vehicle có một thuộc tính name và maxSpeed, 
đặc biệt maxSpeed được khai báo là biến final để cấm sửa sau khi biến được khởi tạo lần đầu, 
và một phương thức move() in ra tốc độ của phương tiện.
Ngoài ra Vehicle cũng có 1 phương thức trùng tên makeSound với biến là kiểu xâu kí tự, 
và Vehicle cũng có 1 phương thức trừu tượng là move().

Tạo hai lớp có tên Car và Bike mở rộng lớp Vehicle và implement MakeSoundable interface. 
Đặc biệt lớp Bike không cho phép kế thừa (tức là class AAA extends Bike là không được phép) 
Lớp Car nên phát ra âm thanh Vroom! khi phương thức makeSound() của nó được gọi và lớp Bike nên phát ra âm thanh Ring-ding-ding! 
khi phương thức makeSound() của nó được gọi.
Trong  main() tạo một đối tượng Car và Bike và gọi các phương thức makeSound() của chúng với các đối số khácnhau

Bài tập 41.
Thiết kế lớp Logger chỉ có duy nhất một đối tượng, 
vì Logger tồn tại trong toàn bộ ứng dụng, và mọi việc ghi log đều được thực hiện trên cùng một đối tượng.

Bài tập 42:
a. Mô tả cách sử dụng lớp final trong Java.
b. Tạo một lớp final có tên là Circle, định nghĩa hai thuộc tính là radius và PI (final).
c. Cài đặt constructor và các hàm get (getter) cho các thuộc tính của lớp Circle.
d. Viết một phương thức tính diện tích hình tròn trong lớp Circle.
e. Tạo một lớp con MyCircle kế thừa từ lớp Circle và thử ghi đè phương thức tính diện tích. 
Xem kết quả và giải thích.

Bài tập 43:
a. Mô tả cách sử dụng lớp final và phương thức final trong Java.
b. Tạo một lớp final có tên là Configuration, có một thuộc tính final là version và một phương thức final showConfig().
c. Tạo một lớp con kế thừa từ lớp Configuration có tên là AppConfig, 
cố gắng ghi đè phương thức final showConfig() bằng cách in ra một thông báo khác. Xem kết quả và giải thích
 */

package javatuan11;

public class bai_41_42_43 {
    
}
