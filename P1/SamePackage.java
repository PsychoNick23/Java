package Java.P1;

public class SamePackage {
    SamePackage(){
        Protection ob=new Protection();
        System.out.println("Same Package");
        System.out.println(ob.n);
//        System.out.println(ob.pri_n);
        System.out.println(ob.pro_n);
        System.out.println(ob.pub_n);
    }
}
