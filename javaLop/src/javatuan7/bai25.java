/*
Bài 25. Tạo một lớp cha có tên là Shape với một phương thức draw() để vẽ hình. 
Sau đó, tạo một lớp con có tên là Circle kế thừa từ lớp cha Shape và ghi đè phương thức draw() để vẽ một hình tròn. 
Trong hàm main(), tạo một mảng đối tượng thuộc lớp cha Shape và gán cho mỗi phần tử một đối tượng thuộc lớp con Circle. 
Sử dụng vòng lặp và toán tử instanceof để kiểm tra từng phần tử của mảng. 
Nếu phần tử đó là một đối tượng thuộc lớp Circle, hãy gọi phương thức draw() của đối tượng đó để vẽ hình tròn.
 */
package javatuan7;

class Shapee{
    public void draw(){
        System.out.println("Vẽ hình");
    }
}

class Circlee extends Shapee{
    @Override
    public void draw(){
        System.out.println("Vẽ hình tròn");
    }    
}

public class bai25 {
    public static void main(String[] args) {
        Shapee[] a = new Circlee[3];
        for (Shapee b : a) {
            if (b instanceof Circlee) { // Kiểm tra nếu phần tử là một Circlee
                b.draw(); // Gọi phương thức draw() của Circlee
            }
        }
    }
}

