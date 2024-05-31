package ham;

public class Sosanh {
    //So sánh bằng nhau giữa 2 chuỗi 
    //Input 2 chuỗi 
    //Output true/false 
    public static boolean equals_st(Object a, Object b){
        //Dùng equalsIgnoreCase thì sẽ không phân biệt in hoa in thường 
        //x.skill.toLowerCase().contains("javacode")  thì x="JaVaCode va toan" thì trả về KQ true 
        if(a.equals(b)){
            return true;
        }
        return false;
    }
    
    //So sánh vế a có thuộc vế b () không 
    //Phải tự đổi vế b 
    //Input vế a
    //Output true/false 
    public static boolean instanceof_st(Object a){
        if(a instanceof String /* Integer , Double , String , */){
            return true;
        }
        return false;
    }
    //Kiểm tra String có full int không 
    //input String a
    //Output : true/false 
    public static boolean isInteger(String str) {
        return str.matches("\\d+");
    }
}
