package az.iktlab.groupj4.java_lessons.lesson3;

public class example {
    public static void main (String[] args) {
       StringBuilder a=new StringBuilder("salam");
       char sy=a.charAt(a.length()-1);
        a.append(sy).reverse().append(sy).reverse();
        System.out.println(a);
    }

}
