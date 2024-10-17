package company.collection.hashmap;

public class Items<T extends Number> {
    T number;

    Items(T number) {
        this.number = number;
    }

    public double square() {
        return Math.pow(number.doubleValue(), 2);
    }

    public T getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Items<Integer> intNumber = new Items<>(5);
        System.out.println("Square of " + intNumber.getNumber() + " is: " + intNumber.square());

        Items<Double> doubleNumber = new Items<>(3.5);
        System.out.println("Square of " + doubleNumber.getNumber() + " is: " + doubleNumber.square());

        Items<Float> longNumber = new Items<>(4.78f);
        System.out.println("Square of " + longNumber.getNumber() + " is: " + longNumber.square());
    }
}





//class Items1 <Key,Value>
//{
//    Key k;
//    Value v;
//
//    Items1(Key k,Value v)
//    {
//        this.k=k;
//        this.v=v;
//    }
//    Value getKeyTest(Key k)
//    {
//        return v;
//    }
//    Key getKey()
//    {
//        return k;
//    }
//    Value getValue()
//    {
//        return v;
//    }
//
//    @Override
//    public String toString() {
//        return "Items1[" +
//                "k=" + k +
//                ", v=" + v +
//                ']';
//    }
//
//}
//
//public class Items{
//    public static void main(String[] args) {
//        Items1<Integer,String> stud1=new Items1<Integer,String>(40,"Nick");
//        System.out.println(stud1.getKey());
//        System.out.println(stud1);
//    }
//}








//class Items1 <T>
//{
//    T value;
//
//    Items1(T value)
//    {
//      this.value=value;
//    }
//    T getItems()
//    {
//        return value;
//    }
//    void setItem(T value)
//    {
//        this.value=value;
//    }
//}
//
//public class Items{
//    public static void main(String[] args) {
//        Items1<Integer> ob1=new Items1<Integer>(50000);
//        System.out.println(ob1.getItems());
//
//        Items1<String> ob2=new Items1<String>("Hello");
//        System.out.println(ob2.getItems());
//
//        Items1<Double> ob3=new Items1<Double>(50000.69);
//        System.out.println(ob3.getItems());
//    }
//}



//Create generic type class which extends form Number
//Find out square of entered number