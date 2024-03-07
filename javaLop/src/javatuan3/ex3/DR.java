/*
Bài tập 3. 

Sử dụng code ở  bài tập 2, code Encapsulation cho hình chữ nhật với 2 cạnh a,b là các số dương
tính diện tích, chu vi hình chữ nhật. 
Hiển thị kết quả ra màn hình.
Chiều dài: Length
Chiều rộng: Width
Chu vi: Perimeter
Diện tích: Area
*/
package javatuan3.ex3;

public class DR {
    private double length;
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    private double width;
        
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double Perimeter() {
        double m=2*(length+width);
        return m;
    }
    public double Area(){
        double m=length*width;
        return m;
    }
}
