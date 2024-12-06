package Java.P2;

import Java.P1.Protection;

public class Derived2 extends Protection {
    Derived2(){
        super();
//        System.out.println(n);
//        System.out.println(pri_n);
        System.out.println(pro_n);
        System.out.println(pub_n);
    }
    public static void main(String[] args) {
        Derived2 ob=new Derived2();
    }
}
