/*
Khai báo lớp sinh viên gồm các biến đều là public: mã sinh viên: kiểu String, 
họ và đệm kiểu String, tên kiểu String, tuổi kiểu int, Giới tính kiểu String, điểm trung bình kiểu float

Trong lớp chứa hàm main():

Viết hàm public static nhập 1 danh sách sinh viên từ bàn phím và trả về danh sách đã nhập.

+ kết thúc nhập khi mã sinh viên nhập là "#"

+ hàm trả lại danh sách sinh viên.

+ Gọi hàm trong hàm main() để kiểm tra. Duyệt danh sách sinh viên và hiển thị lên màn hình.

Trong lớp chứa hàm main():

Viết hàm public static Sắp xếp danh sách tăng dần của điểm trung bình và hiển thị.

Viết hàm public static Sắp xếp danh sách giảm dần của điểm trung bình và hiển thị.

Viết hàm public static Đếm số sinh viên có điểm trung bình > 5.0 và hiển thị.

Viết hàm public static Hiển thị sinh viên đầu tiên trong danh sách có điểm > 9.0.

Viết hàm public static Hiển thị  sinh viên có điểm trung bình lớn nhất, nhỏ nhất.

Viết hàm public static Đảo ngược danh sách sinh viên để tạo ra 1 danh sách khác và hiển thị danh sách kết quả.

Viết hàm public static Ghi danh sách sinh viên lên 1 file .txt

Viết hàm public static Ghi danh sách sinh viên lên 1 file .csv

Viết hàm public static Ghi danh sách sinh viên lên 1 file .json.

Viết hàm public static Hiển thị danh sách sinh viên lên 1 grid trong chế độ đồ họa sử dụng Java swing.
 */
package Javatuan2_b;

/*import static exp.ex1.displayStudentsGrid;*/import java.util.*;
import java.io.FileWriter;
import javax.swing.*;
import java.awt.*;

class Student {
    public String ID;
    public String FirstName;
    public String LastName;
    public int age;
    public String sex;
    public float point;
    public Student(String a, String b, String c, int d, String e, float f){
        this.ID=a;
        this.FirstName=b;
        this.LastName=c;
        this.age=d;
        this.sex=e;
        this.point=f;
    }
}
public class bai18 {
    // có thể truy cập từ bất kỳ phương thức nào trong cùng một lớp mà không cần tạo ra một đối tượng của lớp
//    static int n;
    //>.< ban đầu ghi static Student[] z=new z[n] không được vì n chưa có giá trị -> Ta chỉ khai báo mảng z, sau đó dùng trong hàm nào thì cho số lượng mảng sau z=new Student[n];
    static Student[] z;
    
    static int n;
    
    //Viết hàm public static nhập 1 danh sách sinh viên từ bàn phím và trả về danh sách đã nhập.
    public static void inputFaction(){
        Scanner a=new Scanner(System.in);
        //Nhập từ bàn phím số lượng sinh viên 
        System.out.print("Số lượng sinh viên: ");
        n=a.nextInt();
        a.nextLine();
        
        z=new Student[n];
        //Nhập thông tin sinh viên 
        System.out.println("Nhập vào thông tin sinh viên: "); 

        for(int i=0;i<n;i++){
            System.out.println("\tSinh viên "+(i+1));
            
            System.out.print("\t\tID: ");
            String b=a.nextLine();
            
            if(b.equals("#")){
                break;
            }
            
            System.out.print("\t\tFirstName: ");
            String c=a.nextLine();
            
            System.out.print("\t\tLastName: ");
            String d=a.nextLine();
            
            System.out.print("\t\tage: ");
            int e=a.nextInt();
            a.nextLine();
            
            System.out.print("\t\tsex: ");
            String f=a.nextLine();  
            
            System.out.print("\t\tpoint: ");
            float g=a.nextFloat();    
            a.nextLine();
            
            z[i]=new Student(b,c,d,e,f,g);
        }
        //Trả về danh sách đã nhập 
        System.out.println("Trả vè danh sách sinh viên vừa nhập: ");
        //>.< Ban đầu ghi i<n lỗi do n chi gan gia tri trong hàm inputFaction()
        for(int i=0;i<z.length;i++){
            System.out.println("\tSinh viên "+(i+1));
            
            System.out.println("\t\tID: "+z[i].ID);
            
            System.out.println("\t\tFirstName: "+z[i].FirstName);
            
            System.out.println("\t\tLastName: "+z[i].LastName);
            
            System.out.println("\t\tage: "+z[i].age);
            
            System.out.println("\t\tsex: "+z[i].sex);

            System.out.println("\t\tpoint: "+z[i].point);
        } 
    }
    
    //Viết hàm public static Sắp xếp danh sách tăng dần của điểm trung bình và hiển thị.
    public static void increasePoint(){        
        float a=z[0].point;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a>z[j].point){
                    Student b=z[j];
                    z[i]=z[j];
                    z[i]=b;
                    break;
                }
            }
        }
        //Trả về danh sách sau khi sắp xếp theo điểm tăng dần  
        System.out.println("Trả về danh sách sinh viên sắp xếp theo điểm tăng dần : ");
        for(int i=0;i<n;i++){
            System.out.println("\tSinh viên "+(i+1));
            
            System.out.println("\t\tID: "+z[i].ID);
            
            System.out.println("\t\tFirstName: "+z[i].FirstName);
            
            System.out.println("\t\tLastName: "+z[i].LastName);
            
            System.out.println("\t\tage: "+z[i].age);
            
            System.out.println("\t\tsex: "+z[i].sex);

            System.out.println("\t\tpoint: "+z[i].point);
        } 
    }
    //Viết hàm public static Sắp xếp danh sách giảm dần của điểm trung bình và hiển thị.
    public static void decreasePoint(){
        float a=z[0].point;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a<z[j].point){
                    Student b=z[j];
                    z[i]=z[j];
                    z[i]=b;
                    break;
                }
            }
        }
        //Trả về danh sách sau khi sắp xếp theo điểm tăng dần  
        System.out.println("Trả về danh sách sinh viên sắp xếp theo điểm giảm dần : ");
        for(int i=0;i<n;i++){
            System.out.println("\tSinh viên "+(i+1));
            
            System.out.println("\t\tID: "+z[i].ID);
            
            System.out.println("\t\tFirstName: "+z[i].FirstName);
            
            System.out.println("\t\tLastName: "+z[i].LastName);
            
            System.out.println("\t\tage: "+z[i].age);
            
            System.out.println("\t\tsex: "+z[i].sex);

            System.out.println("\t\tpoint: "+z[i].point);
        } 
    }
    //Viết hàm public static Đếm số sinh viên có điểm trung bình > 5.0 và hiển thị.
    public static void greaterThanFive(){
        int x=0;
        for(int i=0;i<z.length;i++){
            if(z[i].point>5.0){
                x++;
            }
        }
        System.out.println("số sinh viên có điểm trung bình > 5.0 là: "+x);
    }
    //Viết hàm public static Hiển thị sinh viên đầu tiên trong danh sách có điểm > 9.0.
    public static void studentFirstGreaterThanNine(){
        int x=0;
        int f=0;
        for(int i=0;i<z.length;i++){
            if(z[i].point>9.0){
                x=i;
                f=1;
            }
        }     
        if(f==1){
            System.out.println("Sinh viên "+x);
            
            System.out.println("\tID: "+z[x].ID);
            
            System.out.println("\tFirstName: "+z[x].FirstName);
            
            System.out.println("\tLastName: "+z[x].LastName);
            
            System.out.println("\tage: "+z[x].age);
            
            System.out.println("\tsex: "+z[x].sex);

            System.out.println("\tpoint: "+z[x].point); 
        }else if(f==0){
            System.out.println("Không có ính viên nào có điểm trên 9.0 ");
        }
    }
    //Viết hàm public static Hiển thị  sinh viên có điểm trung bình lớn nhất, nhỏ nhất.
    public static void studentPointMaxMin(){
        int x=0;
        float y=z[0].point;
        //sinh viên có point max
        for(int i=0;i<z.length;i++){
            if(y<z[i].point){
                x=i;
            }
        }
        System.out.println("Sinh viên có điểm trung bình lớn nhất là: ");
            
        System.out.println("\tID: "+z[x].ID);
            
        System.out.println("\tFirstName: "+z[x].FirstName);
            
        System.out.println("\tLastName: "+z[x].LastName);
            
        System.out.println("\tage: "+z[x].age);
            
        System.out.println("\tsex: "+z[x].sex);

        System.out.println("\tpoint: "+z[x].point); 
        
        //sinh viên có point min
        for(int i=0;i<z.length;i++){
            if(y>z[i].point){
                x=i;
            }
        }
        System.out.println("Sinh viên có điểm trung bình nhỏ nhất là: ");
            
        System.out.println("\tID: "+z[x].ID);
            
        System.out.println("\tFirstName: "+z[x].FirstName);
            
        System.out.println("\tLastName: "+z[x].LastName);
            
        System.out.println("\tage: "+z[x].age);
            
        System.out.println("\tsex: "+z[x].sex);

        System.out.println("\tpoint: "+z[x].point); 
        
    }
    //Viết hàm public static Đảo ngược danh sách sinh viên để tạo ra 1 danh sách khác và hiển thị danh sách kết quả.
    public static void reverse(){
        int h=z.length-1;
        Student[] m=new Student[z.length];
        for(int i=0;i<z.length;i++){
            m[i]=z[h];
            h--;
        }
        System.out.println("Trả về danh sách sinh viên sau khi đảo ngược : ");
        for(int i=0;i<n;i++){
            System.out.println("\tSinh viên "+(i+1));
            
            System.out.println("\t\tID: "+m[i].ID);
            
            System.out.println("\t\tFirstName: "+m[i].FirstName);
            
            System.out.println("\t\tLastName: "+m[i].LastName);
            
            System.out.println("\t\tage: "+m[i].age);
            
            System.out.println("\t\tsex: "+m[i].sex);

            System.out.println("\t\tpoint: "+m[i].point);
        } 
    }
    //hàm public static Ghi danh sách sinh viên lên 1 file .txt
    public static void savetxt(){
        try{
            FileWriter a=new FileWriter("C:\\Users\\dhhuo\\OneDrive\\CMC2023\\CSLT2023\\NGON_NGU_JAVA\\javaLop\\src\\Javatuan2_b\\a.txt");
            for(int i=0;i<z.length;i++){
                a.write("\n\tSinh viên "+(i+1));
            
                a.write("\n\t\tID: "+z[i].ID);
            
                a.write("\n\t\tFirstName: "+z[i].FirstName);
            
                a.write("\n\t\tLastName: "+z[i].LastName);
            
                a.write("\n\t\tage: "+z[i].age);
            
                a.write("\n\t\tsex: "+z[i].sex);

                a.write("\n\t\tpoint: "+z[i].point);
            } 
            a.close();
            System.out.println("Đã lưu");
        }catch(Exception e){
            System.out.println("Lỗi: "+e);
        }
    }
    //Viết hàm public static Ghi danh sách sinh viên lên 1 file .csv
    public static void savecsv(){
        try{
            FileWriter a=new FileWriter("C:\\Users\\dhhuo\\OneDrive\\CMC2023\\CSLT2023\\NGON_NGU_JAVA\\javaLop\\src\\Javatuan2_b\\b.csv");
            for(int i=0;i<z.length;i++){
                a.write("\n\tSinh viên "+(i+1));
            
                a.write("\n\t\tID: "+z[i].ID);
            
                a.write("\n\t\tFirstName: "+z[i].FirstName);
            
                a.write("\n\t\tLastName: "+z[i].LastName);
            
                a.write("\n\t\tage: "+z[i].age);
            
                a.write("\n\t\tsex: "+z[i].sex);

                a.write("\n\t\tpoint: "+z[i].point);
            } 
            a.close();
            System.out.println("Đã lưu");
        }catch(Exception e){
            System.out.println("Lỗi: "+e);
        }        
    }
    //Viết hàm public static Ghi danh sách sinh viên lên 1 file .json
    public static void savejson(){
        try{
            FileWriter a=new FileWriter("C:\\Users\\dhhuo\\OneDrive\\CMC2023\\CSLT2023\\NGON_NGU_JAVA\\javaLop\\src\\Javatuan2_b\\c.json");
            for(int i=0;i<z.length;i++){
                a.write("\n\tSinh viên "+(i+1));
            
                a.write("\n\t\tID: "+z[i].ID);
            
                a.write("\n\t\tFirstName: "+z[i].FirstName);
            
                a.write("\n\t\tLastName: "+z[i].LastName);
            
                a.write("\n\t\tage: "+z[i].age);
            
                a.write("\n\t\tsex: "+z[i].sex);

                a.write("\n\t\tpoint: "+z[i].point);
            } 
            a.close();
            System.out.println("Đã lưu");
        }catch(Exception e){
            System.out.println("Lỗi: "+e);
        }          
    }
    //Viết hàm public static Hiển thị danh sách sinh viên lên 1 grid trong chế độ đồ họa sử dụng Java swing.  
    public static void grid(){
        JFrame frame = new JFrame("Danh sách sinh viên");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(z.length, 6)); // Grid có số hàng bằng số sinh viên, và có 6 cột id,age...

        for (Student m : z) {
            // Tạo label hiển thị thông tin sinh viên
            JLabel label = new JLabel(" ID: " + m.ID + " FirstName: " + m.FirstName + " LastName: " + m.LastName + " age: " + m.age+ " sex: " + m.sex+ " point: " + m.point);
            label.setBorder(BorderFactory.createLineBorder(Color.BLUE)); // Đặt đường viền cho label

            // Thêm label vào panel
            panel.add(label);
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        //hàm public static nhập 1 danh sách sinh viên từ bàn phím và trả về danh sách đã nhập.
        inputFaction();
        //hàm public static Sắp xếp danh sách tăng dần của điểm trung bình và hiển thị.
        increasePoint();
        //hàm public static Sắp xếp danh sách giảm dần của điểm trung bình và hiển thị.
        decreasePoint();
        //hàm public static Đếm số sinh viên có điểm trung bình > 5.0 và hiển thị.
        greaterThanFive();
        //hàm public static Hiển thị sinh viên đầu tiên trong danh sách có điểm > 9.0.
        studentFirstGreaterThanNine();
        //hàm public static Hiển thị  sinh viên có điểm trung bình lớn nhất, nhỏ nhất.
        studentPointMaxMin();
        //hàm public static Đảo ngược danh sách sinh viên để tạo ra 1 danh sách khác và hiển thị danh sách kết quả.
        reverse();
        //hàm public static Ghi danh sách sinh viên lên 1 file .txt
        savetxt();    
        //hàm public static Ghi danh sách sinh viên lên 1 file .csv
        savecsv();
        //Viết hàm public static Ghi danh sách sinh viên lên 1 file .json
        savejson();
        //Viết hàm public static Hiển thị danh sách sinh viên lên 1 grid trong chế độ đồ họa sử dụng Java swing.        
        grid();              
    }    
}
