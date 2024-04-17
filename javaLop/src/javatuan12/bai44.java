/*
Bài tập 44.
a. Khai báo lớp sinh viên gồm các biến đều là public: 
mã sinh viên: kiểu String, họ và đệm kiểu String, tên kiểu String, tuổi kiểu int , Giới tính kiểu String, điểm trung bình kiểu float
b. Trong lớp chứa hàm main():
Viết hàm public static nhập 1 danh sách sinh viên từ bàn phím và trả về danh sách đã nhập.
+ kết thúc nhập khi mã sinh viên nhập là "#"
+ hàm trả lại danh sách sinh viên.
+ Gọi hàm trong hàm main() để kiểm tra. Duyệt danh sách sinh viên và hiển thị lên màn hình.
Trong lớp chứa hàm main():
Viết hàm public static   Sắp xếp danh sách tăng dần của điểm trung bình và hiển thị.
Viết hàm public static   Sắp xếp danh sách giảm dần của điểm trung bình và hiển thị.
Viết hàm public static   Đếm số sinh viên có điểm trung bình > 5.0 và hiển thị.
Viết hàm public static   Hiển thị sinh viên đầu tiên trong danh sách có điểm > 9.0.
Viết hàm public static   Hiển thị  sinh viên có điểm trung bình lớn nhất, nhỏ nhất.
Viết hàm public static   Đảo ngược danh sách sinh viên để tạo ra 1 danh sách khác và hiển thị danh sách kết quả.
Viết hàm public static   Ghi danh sách sinh viên lên 1 file .txt
Viết hàm public static   Ghi danh sách sinh viên lên 1 file .csv
Viết hàm public static   Ghi danh sách sinh viên lên 1 file .json.
Viết hàm public static   Hiển thị danh sách sinh viên lên 1 grid trong chế độ đồ họa sử dụng Java swing.
 */
package javatuan12;

import java.io.*;
import java.util.*;

public class bai44 {
    //nhập 1 danh sách sinh viên từ bàn phím và trả về danh sách đã nhập
    //kết thúc nhập khi mã sinh viên nhập là "#"
    public static List<student> listStudent(){
        Scanner a=new Scanner(System.in);
        List<student> sts=new ArrayList<>();
        int i=1;
        while(1>0){
            System.out.print("id_s "+i+": ");
            String id_s=a.nextLine();
            if("#".equals(id_s)){
                break;
            }
            System.out.print("name_s "+i+": ");
            String name_s=a.nextLine();
            System.out.print("age_s "+i+": ");
            int age_s=a.nextInt();
            a.nextLine();
            System.out.print("sex_s "+i+": ");
            String sex_s=a.nextLine();
            System.out.print("point_s "+i+": ");
            float point_s=a.nextFloat();
            a.nextLine();
            sts.add(new student(id_s,name_s,age_s,sex_s,point_s)); 
            i++;
            System.out.print("\n");
        }
        return sts;
    }
    
    //Sắp xếp danh sách tăng dần của điểm trung bình   
    public static List<student> listStudentup(List<student> a) {
        int n=a.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a.get(i).point>a.get(j).point){
                    student b=a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,b);                    
                }
            }
        }
        return a;
    }

    //Sắp xếp danh sách giảm dần của điểm trung bình 
    public static List<student> listStudentdown(List<student> a){
        int n=a.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a.get(i).point<a.get(j).point){
                    student b=a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,b);                    
                }
            }
        }
        return a;
    }
    
    //Đếm số sinh viên có điểm trung bình > 5.0
    public static List<student> listpoint_5(List<student> a){
        List<student> a1=new ArrayList<>();
        int n=a.size();
        for(int i=0;i<n;i++){
            if(a.get(i).point>5.0){
                a1.add(a.get(i));
            }
        }
        return a1;
    }
    
    //Trả về thông tin sinh viên đầu tiên trong danh sách có điểm > 9.0 , néu khong có sinh viên nào point>9 thì trả về null 
    public static student stpoint_9(List<student> a){
        int n=a.size();
        for(int i=0;i<n;i++){
            if(a.get(i).point>9.0){
                return a.get(i);
            }
        }
        return null;
    }
    
    //Trả về thông tin sinh viên có điểm trung bình lớn nhất
    public static student stpointmax(List<student> a){
        int n=a.size();
        float m=a.get(0).point;
        int x=0;
        for(int i=0;i<n;i++){
            if(m<a.get(i).point){
                m=a.get(i).point;
                x=i;
            }
        }
        return a.get(x);
    }
    
    //Trả về thông tin sinh viên có điểm trung bình nhỏ nhất
    public static student stpointmin(List<student> a){
        int n=a.size();
        float m=a.get(0).point;
        int x=0;
        for(int i=0;i<n;i++){
            if(m>a.get(i).point){
                m=a.get(i).point;
                x=i;
            }
        }
        return a.get(x);        
    }    
    
    //Trả về danh sách mới là đảo ngược danh sách sinh viên ban đầu 
    public static List<student> sthuhu(List<student> a){
        int n=a.size();
        for(int i=0;i<n;i++){
            if(n%2==0){
                student ex=a.get(i);
                a.set(i,a.get(n-1-i));
                a.set(n-1-i, ex);
                if(i==(n-2)/2){
                    break;
                }
            }else{
                student ex=a.get(i);
                a.set(i,a.get(n-1-i));
                a.set(n-1-i, ex);                
                if(i==(n-1)/2){
                    break;
                }                
            }
        }
        return a;
    }
    
    //Ghi danh sách sinh viên lên 1 file .txt
    public static void filetxt(List<student> a){
        try {
            // Khởi tạo FileWriter để ghi vào tệp
            FileWriter fileWriter = new FileWriter("File1.txt");

            // Khởi tạo BufferedWriter để cung cấp bộ đệm cho việc ghi
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for(student b:a){
                bufferedWriter.write("id_s : "+ b.id+"\n"+"name_s : "+ b.name+"\n"+"age_s : "+ b.age+"\n"+"sex_s : "+ b.sex+"\n"+"point_s : "+ b.point+"\n\n");               
            }
            // Đóng BufferedWriter để giải phóng tài nguyên
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp " + "File1.txt");
            e.printStackTrace();
        }        
    }
    
    //Ghi danh sách sinh viên lên 1 file .csv
    public static void filecsv(List<student> a){
        try {
            // Khởi tạo FileWriter để ghi vào tệp
            FileWriter fileWriter = new FileWriter("File2.csv");

            // Khởi tạo BufferedWriter để cung cấp bộ đệm cho việc ghi
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for(student b:a){
                bufferedWriter.write("id_s : "+ b.id+"\n"+"name_s : "+ b.name+"\n"+"age_s : "+ b.age+"\n"+"sex_s : "+ b.sex+"\n"+"point_s : "+ b.point+"\n\n");               
            }
            // Đóng BufferedWriter để giải phóng tài nguyên
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi vào tệp " + "File2.csv");
            e.printStackTrace();
        }        
    }    
    
    //Ghi danh sách sinh viên lên 1 file .json
    public static void filejson(List<student> a){

    }        
    
    //Hiển thị danh sách sinh viên lên 1 grid trong chế độ đồ họa sử dụng Java swing - form1 
    public static void sthaha(List<student> a) {
        
    }
    public static void main(String[] args){
//        listStudent b = new listStudent();
//        List<student\\\\> a = new ArrayList<>();   
        List<student> sts=listStudent();
        filejson(sts);
//        List<student>stss=sthuhu(sts);
//        student stsss=stpointmax(sts);
//        for(student stsss:stss){
//            System.out.println("id_s : "+ stsss.id);
//            System.out.println("name_s : "+ stsss.name);
//            System.out.println("age_s : "+ stsss.age);
//            System.out.println("sex_s : "+ stsss.sex);
//            System.out.println("point_s : "+ stsss.point);
//        }              
    }
    
}
