package javatuan3.ex3;

public class S{
    public static void main(String[] args) {
        DR dr = new DR();
        
        dr.setLength(6.0);
        dr.setWidth(3.0);
        
        double Perimeter=dr.Perimeter();
        double area = dr.Area();
        System.out.println("Chu vi: " + Perimeter);
        System.out.println("Diện tích: " + area);
    }
}