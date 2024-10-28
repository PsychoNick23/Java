package company.collection.hashmap;

class thread1 extends Thread
{
    public thread1(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+"---->"+i);
                Thread.sleep(500);
                System.out.println("t1 state-->"+thread_main.t1.getState());
                System.out.println("t2 state-->"+thread_main.t2.getState());

            }
        }catch(Exception e){}
        System.out.println("t1 state-->"+Thread.currentThread().getState());
    }
}

class thread2 extends Thread
{
    public thread2(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName()+"---->"+i);
                Thread.sleep(500);
                System.out.println("t1 state-->"+thread_main.t1.getState());
                System.out.println("t2 state-->"+thread_main.t2.getState());

            }
        }catch(Exception e){}
        System.out.println("t1 state-->"+Thread.currentThread().getState());
    }
}

public class thread_main {
    static thread1 t1=null;
    static thread2 t2=null;

    public static void main(String[] args) throws InterruptedException {

        t1=new thread1("Thread 1");
        t2=new thread2("Thread 2");

        System.out.println("Thread 1 state="+t1.getState());
        System.out.println("Thread 2 state="+t2.getState());
        System.out.println("t1 is alive="+t1.isAlive());

        t1.start();
        System.out.println("t1 is alive="+t1.isAlive());

        t1.join();

        t2.start();
        System.out.println("thread 1 state="+t1.getState());
        System.out.println("thread 1 state="+t2.getState());
    }
}
