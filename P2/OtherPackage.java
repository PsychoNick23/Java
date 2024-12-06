package Java.P2;

import Java.P1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection ob = new Protection();
        System.out.println("Other Package");
//        System.out.println(ob.n);
//        System.out.println(ob.pri_n);
//        System.out.println(ob.pro_n);
        System.out.println(ob.pub_n);
        }
}
