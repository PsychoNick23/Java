package company.collection.hashmap;


class num1 extends Thread
{

    @Override
    public void run()
    {

        for (int i=1;i<=20;i++){
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        try
        {
                Thread.sleep(500);
        }catch(Exception e){}
        start();
    }
}

class num2 extends Thread
{

    @Override
    public void run()
    {

        for(int i=1;i<=20;i++){
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
        try
        {
                Thread.sleep(500);
        }catch(Exception e){}
        start();

    }
}
public class syncshownumb {
    public static void main(String[] args) {

        num1 n1=new num1();
        num2 n2=new num2();
        n1.start();
        n2.start();

    }
}
