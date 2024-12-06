package Java.P1;

public class Protection {
    int n = 1;
    private int pri_n = 2;
    protected int pro_n = 3;
    public int pub_n = 4;
    public Protection(){
        System.out.println("Protection  Package");
        System.out.println(n);
        System.out.println(pri_n);
        System.out.println(pro_n);
        System.out.println(pub_n);
    }

}
