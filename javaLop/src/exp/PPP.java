package exp;

class A{
    public int x;
    public static int y;
    public void a1(){
        x=10;
        A a=new A();
        a.y=100;
        a2();
    }
    public static void a2(){
        y=10;
        A a=new A();
        a.x=100;
        a.a1();
    }
}

class B{
    public void b1(){
        A a = new A();
        a.x=1;
        a.y=2;
        a.a1();
        a.a2();
        System.out.println(a.x+a.y);
    }
    
    public static void b2(){
        
    }
}

public class PPP {
    public static void main(String[] args) {
        A a=new A();
//        a.x=10;
//        System.out.println(a.x);
//    y=10;
        B b=new B();
//        B.b1();
        B.b2();
        C c=new C();
        C.c2();
    }
}
