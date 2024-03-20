package javatuan8;

// Tính diện tích các hình tứ giác biết độ dài 4 cạnh và 1 đường chéo
class tamgiac{
    public static double S_tamgiac(double a, double b, double c){
        double p1=(a+b+c)/2;
        double q1=p1*(p1-a)*(p1-b)*(p1-c);
        double s1=Math.sqrt(q1);   
        return s1;
    }
    public double tinh_chu_vi(double a, double b, double c){
        return a+c+b;
    }
    public static void kiem_tra_ba_canh(double a, double b, double c){
        if(a<=0 || b<=0 || c<=0 || a+b<=c || b+c<=a || c+a<=b){
            System.out.println("GIÁ TRỊ NẠP VÀO KHÔNG THỎA MÃN");
        }else{
//            System.out.println("GIÁ TRỊ NẠP VÀO THỎA MÃN");
        }
    }
}
class tugiac {

    // truyen độ dài 4 cạnh và 1 đường chéo

    private double ab;

    private double bc;

    private double cd;

    private double da;

    private double ac;
    
    public void setab(double ab){
        this.ab=ab;
    }
    
    public double getab(){
        return ab;
    }

    public void setbc(double ab){
        this.bc=ab;
    }
    
    public double getbc(){
        return bc;
    }

    public void setcd(double ab){
        this.cd=ab;
    }
    
    public double getcd(){
        return cd;
    }

    public void setda(double ab){
        this.da=ab;
    }
    
    public double getda(){
        return da;
    }

    public void setac(double ab){
        this.ac=ab;
    }
    
    public double getac(){
        return ac;
    }    
    

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
        double s1=tamgiac.S_tamgiac(ab,bc,ac);

        //Tính diện tích tam giác CDA
        double s2=tamgiac.S_tamgiac(cd,da,ac);
       
        return s1+s2;
    }
    
    public double tinh_chu_vi(){
        return ab+bc+cd+da;
    }
    
    public void kiem_tra_gia_tri(){
        tamgiac.kiem_tra_ba_canh(ab,bc,ac);
        tamgiac.kiem_tra_ba_canh(da,ac,ac);
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
        double s1=tamgiac.S_tamgiac(getab(),getbc(),getac());
        return 2*s1;
    }
    @Override
    public double tinh_chu_vi(){
        return 2*(getab()+getbc());
    }
    @Override
    public void kiem_tra_gia_tri(){
        tamgiac.kiem_tra_ba_canh(getab(),getbc(),getac());
    }
}

 

class hinhchunhat extends hinhbinhhanh{

    public hinhchunhat(double ab,double bc){
        super(ab,bc,Math.sqrt(ab*ab+bc*bc));
    }
    @Override
    public double tinh_dien_tich() {
        return getab()*getbc();
    }
    @Override
    public double tinh_chu_vi(){
        return 2*(getab()+getbc());
    }
    @Override
    public void kiem_tra_gia_tri(){
        tamgiac.kiem_tra_ba_canh(getab(),getbc(),getac());
    }
}
 

class hinhvuong extends hinhchunhat{
    public hinhvuong(double ab){
        super(ab,ab);
    }
    
    @Override
    public double tinh_dien_tich() {
        return getab()*getab();
    }
    @Override
    public double tinh_chu_vi(){
        return 4*getab();
    }
    @Override
    public void kiem_tra_gia_tri(){
        tamgiac.kiem_tra_ba_canh(getab(),getbc(),getac());
    }
}

class hinhthoi extends hinhvuong{    
    public hinhthoi(double ab){
        super(ab);
    }
    @Override
    public double tinh_chu_vi(){
        return 4*getab();
    }  
    @Override
    public void kiem_tra_gia_tri(){
        tamgiac.kiem_tra_ba_canh(getab(),getbc(),getac());
    }
}

public class bai27 {

    public static void main(String[] args) {        
        bai27 a=new bai27();
        
        tugiac b=new tugiac(5.0,4.0,6.0,3.0,7.0);
        b.kiem_tra_gia_tri();
        
        hinhbinhhanh c=new hinhbinhhanh(5.0,8.0,7.0);
        b.kiem_tra_gia_tri();
        
        hinhchunhat d=new hinhchunhat(3.0,4.0);//...
        b.kiem_tra_gia_tri();
        
        hinhvuong e=new hinhvuong(6.0);
        b.kiem_tra_gia_tri();
        
        hinhthoi f=new hinhthoi(-6.0);
        b.kiem_tra_gia_tri();
        
        //Gọi các hàm tính diện tích các hình

        System.out.println("Diện tích tứ giác là: " + b.tinh_dien_tich());
        
        System.out.println("Diện tích hình bình hành là: " + c.tinh_dien_tich());
        
        System.out.println("Diện tích hình chữ nhật là: " + d.tinh_dien_tich());
        
        System.out.println("Diện tích hình vuông là: " + e.tinh_dien_tich());
        
        System.out.println("Diện tích hình thoi là: " + f.tinh_dien_tich());
        
        System.out.println("Chu vi tứ giác là: " + b.tinh_chu_vi());
        
        System.out.println("Chu vi hình bình hành là: " + c.tinh_chu_vi());
        
        System.out.println("Chu vi hình chữ nhật là: " + d.tinh_chu_vi());
        
        System.out.println("Chu vi hình vuông là: " + e.tinh_chu_vi());
        
        System.out.println("Chu vi hình thoi là: " + f.tinh_chu_vi());        

    }

}