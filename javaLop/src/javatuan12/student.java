/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatuan12;

/**
 *
 * @author dhhuo
 */
public class student{
    public String id;
    public String name;
    public int age;
    public String sex;
    public float point;  
    //Phải dùng hàm tạo 
    public student(String a, String b, int c, String d, float e){
        this.id=a;
        this.name=b;
        this.age=c;
        this.sex=d;
        this.point=e;
    }
}
