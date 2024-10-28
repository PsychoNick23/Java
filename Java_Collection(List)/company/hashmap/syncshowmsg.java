package company.collection.hashmap;

class msgblock
{
    synchronized void showmsg(String arr[])
    {
        System.out.print("[");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            try {
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
        System.out.println("]");
    }
}

class msgThreadDemo extends Thread
{

    msgblock m;
    String arr[];

    public msgThreadDemo(msgblock m,String arr[])
    {
        this.m=m;
        this.arr=arr;
        start();
    }
    public void run()
    {
        m.showmsg(arr);
    }
}

public class syncshowmsg {
    public static void main(String[] args)
    {

        String arr1[]={" I "," am "," working "," in "," Synchronized "," block."};
        String arr2[]={" Have "," a "," nice "," Day!!!"};

        msgblock msg=new msgblock();

        msgThreadDemo t1=new msgThreadDemo(msg,arr1);
        msgThreadDemo t2=new msgThreadDemo(msg,arr2);

    }
}
