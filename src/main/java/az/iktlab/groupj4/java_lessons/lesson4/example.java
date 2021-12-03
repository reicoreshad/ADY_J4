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
        //Scanner scn=new Scanner(System.in);
        //String val=scn.next();
        //val=val.replace("x","");
        //val=val.replace("x"," ").trim().replace(" ","x");
        //System.out.println( val);

        String val;
        int firsttwo,lasttwo;
        for (int i = 1000; i <=10000 ; i++) {
            val=String.valueOf(i);
            firsttwo=Integer.valueOf(val.charAt(0))+Integer.valueOf(val.charAt(1));
            lasttwo=Integer.valueOf(val.charAt(val.length()-1))+Integer.valueOf(val.charAt(val.length()-2));
            if(firsttwo==lasttwo) System.out.println(i);
        }

    }
}
//public class main{
//   public static void main(String[]args){
//      Scanner sc= new Scanner(System.in);
//        String letter="";
//       int num,pos=0,neg=0,zer=0;
//        while(! letter.equals("exit"))
//        {
//           letter = sc.next();
//
//           if(letter.matches("-[0-9]")){
//               num=Integer.valueOf(letter);
//                if(num>0) pos++; else if(num<0) neg++; else zer++;
//           }
//        }
//        System.out.println("positive number counts is: "+pos);
//        System.out.println("negative number counts is: "+neg);
//        System.out.println("zero number counts is: "+zer);

//    }
//}
