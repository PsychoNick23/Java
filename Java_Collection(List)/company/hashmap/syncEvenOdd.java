package company.collection.hashmap;


class msgblock1
{
    synchronized void showeven(int arr[])
    {
        System.out.print("[");
        for (int i=1;i<= arr.length;i++)
        {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
            try {
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
        System.out.println("]");
    }

    synchronized void showodd(int arr[])
    {
        System.out.print("[");
        for (int i=1;i<=20;i++)
        {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
            try {
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
        System.out.println("]");
    }
}

class msgThreadDemo1 extends Thread
{

    msgblock1 m;
    int arr[];

    public msgThreadDemo1(msgblock1 m,int arr[])
    {
        this.m=m;
        this.arr=arr;
        start();
    }
    public void run()
    {
        m.showeven(arr);
        m.showodd(arr);
    }
}
public class syncEvenOdd {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    }
}
