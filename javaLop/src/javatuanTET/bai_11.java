package javatuanTET;

// Tính diện tích các hình tứ giác biết độ dài 4 cạnh và 1 đường chéo

class tugiac {

    // truyen độ dài 4 cạnh và 1 đường chéo

    protected double ab;

    protected double bc;

    protected double cd;

    protected double da;

    protected double ac;

    public tugiac(double ab,double bc,double cd,double da,double ac){

        //|ab-bc| < ac < ab+bc, |cd-da| < ac < cd + da

        this.ab=ab;

        this.bc=bc;

        this.cd=cd;

        this.da=da;

        this.ac=ac;

    }

    //Tính diện tích tứ giác ABCD 
    public double tinh_dien_tich(){
        //Tính diện tích tam giác ABC
        double p1=(ab+bc+ac)/2;
        double q1=p1*(p1-ab)*(p1-bc)*(p1-ac);
        double s1=Math.sqrt(q1);

        //Tính diện tích tam giác CDA
        double p2=(cd+da+ac)/2;
        double q2=p2*(p2-cd)*(p2-da)*(p2-ac);
        double s2=Math.sqrt(q1);
       
        return s1+s2;
    }

}
 
class hinhbinhhanh extends tugiac{

    public hinhbinhhanh(double ab,double bc,double ac){

        //|ab-bc| < ac < ab+bc, |cd-da| < ac < cd + da
        
        super(ab,bc,ab,bc,ac);
    }
    @Override
    public double tinh_dien_tich(){
        //Tính diện tích tam giác ABC
        double p1=(ab+bc+ac)/2;
        double q1=p1*(p1-ab)*(p1-bc)*(p1-ac);
        double s1=Math.sqrt(q1);
        return 2*s1;
    }

}

 

class hinhchunhat extends hinhbinhhanh{

    public hinhchunhat(double ab,double bc){
        super(ab,bc,Math.sqrt(ab*ab+bc*bc));
    }
    @Override
    public double tinh_dien_tich() {
        return ab*bc;
    }
}
 

class hinhvuong extends hinhchunhat{
    public hinhvuong(double ab){
        super(ab,ab);
    }
    
    @Override
    public double tinh_dien_tich() {
        return ab*ab;
    }   
}


public class bai_11 {

    public static void main(String[] args) {        
        bai_11 a=new bai_11();
        
        tugiac b=new tugiac(5.0,4.0,6.0,3.0,7.0);
   
        hinhbinhhanh c=new hinhbinhhanh(5.0,8.0,7.0);

        hinhchunhat d=new hinhchunhat(3.0,4.0);//...

        hinhvuong e=new hinhvuong(6.0);

        //Gọi các hàm tính diện tích các hình

        System.out.println("Diện tích tứ giác là: " + b.tinh_dien_tich());
        
        System.out.println("Diện tích hình bình hành là: " + c.tinh_dien_tich());
        
        System.out.println("Diện tích hình chữ nhật là: " + d.tinh_dien_tich());
        
        System.out.println("Diện tích hình vuông là: " + e.tinh_dien_tich());

    }
}