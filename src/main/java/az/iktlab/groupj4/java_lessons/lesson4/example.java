package az.iktlab.groupj4.java_lessons.lesson4;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        int val=scn.nextInt();
//        int s=0;
//        for(int i=val-1;i>=1;i--){
//            if((val%i) ==0) {s++;}
//        }
//        if(s==0){System.out.println(("SAte"));}else{System.out.println(("Murekkeb"));}

//        for (int i = 1; i <=10 ; i++) {
//            for (int j = 1; j <=10; j++) {
//                 //System.out.println(format("%d*%d=%d",i,j,i*j));
//                System.out.println(i+"*"+j+"="+i*j);
                    //System.out.
//            }
//        }
        Scanner scn=new Scanner(System.in);
        String val=scn.next();
        //val=val.replace("x","");
        val=val.replace("x"," ").trim().replace(" ","x");
        System.out.println( val);

    }
}
