/*
36a. 
Mô tả cách thực hiện cơ chế Interface của các đối tượng trong lớp SinhVien, GiangVien, GiaoVienNghienCuuSinh: 
Chúng ta sử dụng interface HocVien để định nghĩa một hợp đồng (contract) cho các lớp SinhVien, GiangVien và GiaoVienNghienCuuSinh, 
đảm bảo rằng các lớp này đều thực hiện phương thức hoc().
Lớp GiaoVienNghienCuuSinh có thể hiểu là đa kế thừa của lớp sinh viên và lớp giảng viên ?

36b. 
Khai báo interface HocVien với một phương thức trừu tượng hoc().

36c. 
Khai báo 3 lớp SinhVien, GiangVien và GiaoVienNghienCuuSinh kế thừa và cài đặt cho interface HocVien, 
để đảm bảo chúng thực hiện phương thức hoc().

36d. 
Viết code Java cho việc cài đặt phương thức hoc() trong cáclớp kế thừa, 
đảm bảo rằng mỗi lớp có cách thực hiện riêng cho phương thức hoc().
 */
package javatuan10;

interface HocVien{
    public void hoc();
}

class SinhVien implements HocVien{
    @Override
    public void hoc() {
        System.out.println("học sinhvien");
    }
    
}

class GiangVien implements HocVien{
    @Override
    public void hoc() {
        System.out.println("học giangvien");
    }
    
}

class GiaoVienNghienCuuSinh implements HocVien{
    @Override
    public void hoc() {
        System.out.println("học GiaoVienNghienCuuSinh");
    }
    
}

public class bai36 {
    public static void main(String[] args){
        SinhVien a =new SinhVien();
        a.hoc();
        GiangVien b = new GiangVien();
        b.hoc();
        GiaoVienNghienCuuSinh c = new GiaoVienNghienCuuSinh();
        c.hoc();
    }
}
