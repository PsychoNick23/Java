package company.collection.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class student {

    int rollNo;
    String name;
    int age;

    @Override
    public String toString() {
        return "student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public student(int rollNo, String name, int age) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        HashMap<student,String> tm=new HashMap<student,String>();
        tm.put(new student(1,"Sam",10),"From Nepal");
        tm.put(new student(2,"Raj",15),"From Japan");
        tm.put(new student(3,"Yash",20),"From Kharodi");

        System.out.println(tm.keySet());
        System.out.println(tm.entrySet());
        System.out.println(tm.values());

    }

}
