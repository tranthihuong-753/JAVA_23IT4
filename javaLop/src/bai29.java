class ADD {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class bai29{
    public static void main(String[] args){
        ADD a=new ADD();
        System.out.println("Output 1: "+a.add(1, 2));
        System.out.println("Output 2: "+a.add(1.2 , 2.3));
        System.out.println("Output 3: "+a.add("VŨ QUANG DŨNG ... ", "CHÁN CHẢ BUỒN NÓI CÔ Ạ ."));
    }
}