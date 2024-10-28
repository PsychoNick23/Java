//Thread Assignment 1
package company.collection.hashmap;

class th1 extends Thread
{
    public th1(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        try{
            System.out.println(getName());
        }catch (Exception e){}
    }
}

class th2 extends Thread
{
    public th2(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        try{

            System.out.println(getName());
        }catch (Exception e){}
    }
}

class th3 extends Thread
{
    public th3(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println(getName());
        }catch (Exception e){}
    }
}

public class companyThread {
    public static void main(String[] args) throws InterruptedException {
        th1 th=new th1("Infosys");
        th2 th02=new th2("Mumbai");
        th3 th03=new th3("Java");
        th.start();
        th02.start();
        th03.start();
    }
}
