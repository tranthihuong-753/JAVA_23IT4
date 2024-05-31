package exp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class h{
    public static int f(int n, List<Integer> l){
        int z=l.size()/2;
        if(n<=l.get(z)){
            if(n==l.get(z)){
                return n;
            }else{
                f(z, l);
            }
        }else{
            if(n==l.get(z+1)){
                return n;
            }else{
                f(z, l);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         List<Integer> m= new ArrayList<>();
         m.add(1);
         m.add(3);
         m.add(6);
         m.add(9);
         Scanner a=new Scanner(System.in);
         int c=a.nextInt();
         System.out.println(f(c, m));
    }
}

