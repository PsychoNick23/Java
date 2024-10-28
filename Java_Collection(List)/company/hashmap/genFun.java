package company.collection.hashmap;
import java.util.*;

public class genFun {

    static void test(List<? extends Number>Is){
        for(Number ob:Is){
            System.out.println(ob);
        }
    }
    static<T extends Number> void show(T a,T b){
        System.out.println(a+"+"+b);
        System.out.println("Class of a is "+a.getClass());
        System.out.println("Class of a is "+b.getClass());
    }


    public static void main(String[] args) {
        show(1,2);
        show(9.8,7.8);
//        show("one","two");
    }
}





// Function Overloading

//public class genFun {
//    static void show(int a,int b){
//        System.out.println(a+"+"+b);
//    }
//
//    static void show(double a,double b){
//        System.out.println(a+"+"+b);
//    }
//
//    static void show(String a,String b){
//        System.out.println(a+"+"+b);
//    }
//
//    public static void main(String[] args) {
//        show(1,2);
//        show(9.8,7.8);
//        show("one","two");
//    }
//}
