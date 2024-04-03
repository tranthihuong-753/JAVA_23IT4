/*
Bài tập 35. 
Hãy định nghĩa một interface Drawable có phương thức draw() để biểu diễn việc vẽ đối tượng.
Tiếp theo, định nghĩa một interface Resizable có phương thức resize() để biểu diễn việc thay đổi kích thước đối tượng.
Sau đó, định nghĩa một interface Shape kế thừa từ cả hai interface Drawable và Resizable.
Cuối cùng, hãy tạo một lớp Rectangle 
và một lớp Circle implement interface Shape để biểu diễn việc vẽ và thay đổi kích thước hình chữ nhật và hình tròn.
*/

package javatuan10;

interface Drawable{
    public void draw();
}

interface Resizable{
    public void resize();
}

class Shape implements  Drawable , Resizable{
    @Override
    public void draw(){
        
    }
    
    @Override
    public void resize(){
        
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){

    }
    
    @Override
    public void resize(){
        
    }    
}

class Circle extends Shape{
    @Override
    public void draw(){
        
    }
    
    @Override
    public void resize(){
        
    }    
}

public class bai35 {
    
}
