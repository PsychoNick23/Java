package company.collection.hashmap;

class thexample extends Thread{
    thexample(String name)
    {
        super (name);
    }
    public void run()
    {
        try
        {
            for(int i=1;i<5;i++)
            {
                System.out.println(getName()+"---->"+i);
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}

public class myTh{
    public static void main(String[] args) throws InterruptedException {
        Thread ob=Thread.currentThread();
        System.out.println(ob);
        System.out.println("alive="+ob.isAlive());
        ob.setName("Learning");
        System.out.println("Name="+ob.getName());
        System.out.println("Priority="+ob.getPriority());

        thexample obth=new thexample("Aptech");
        obth.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println(ob.getName()+"---->"+i);
            Thread.sleep(1500);
        }
    }


}
