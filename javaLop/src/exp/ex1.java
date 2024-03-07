package exp;

// public, protected , private 

class Parent {
    protected int pa1;
    protected void x(){
        System.out.println("parent");
    }
}

class Child extends Parent{
    public void y(){
        System.out.println("child");
        x();
    }
}

public class ex1 {
    public static void main(String[] args) {
        Child a=new Child();
        a.y();
        mm bb=new mm();
        mm.k1();
    }
}