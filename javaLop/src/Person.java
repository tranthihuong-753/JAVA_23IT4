import java.util.Scanner;
class Person{
  String name;
  public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    String name1=a.nextLine();
    String name2=a.nextLine();
    Person p1=new Person();
    Person p2=new Person();
    p1.name=name1;
    p2.name=name2;
    System.out.println(p1.name+"\n"+p2.name);
  }
}

