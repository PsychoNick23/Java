package Java;




class client{


    String[] name;
    String[] city;
    double[] Creditlimit;


    public client(String[] name, String[] city, double[] Creditlimit) {
        this.name = name;
        this.city = city;
        this.Creditlimit = Creditlimit;
    }


}

class orders extends client{

    String[] orderid;
    String[] productid;
    double[] price;


    public orders(String[] name, String[] city, double[] Creditlimit, String[] orderid, String[] productid, double[] price){
        super(name, city, Creditlimit);
        this.orderid = orderid;
        this.productid = productid;
        this.price = price;
    }


}
class creditlimit extends orders{
    double[] amount;
    double[] gst;


    public creditlimit(String[] name, String[] city, double[] Creditlimit, String[] orderid, String[] productid, double[] price, double[] amount, double[] gst){
        super(name, city, Creditlimit,orderid,productid,price);
        this.amount=amount;
        this.gst=gst;

    }



    void output(){
        for (int i=0;i<10;i++){
            System.out.println(name[i]+" "+city[i]+" "+Creditlimit[1]+" "+orderid[1]+" "+productid[i]+" "+price[i]+" "+amount[i]+" "+gst[i]);
        }
    }
}

public class assignment {
    public static void main(String[] args) {
        String[] name1={"Nishant","Nishant","Nishant","Nishant","Nishant","Nishant","Nishant","Nishant","Nishant","Nishant"};
        String[] city1={"Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai","Mumbai"};
        double[] Creditlimit1={100000,100000,100000,100000,100000,100000,100000,100000,100000,100000};
        String[] orderid1={"A101","A101","A101","A101","A101","A101","A101","A101","A101","A101"};
        String[] productid1={"#101","#101","#101","#101","#101","#101","#101","#101","#101","#101"};
        double[] price1={500000,500000,500000,500000,500000,500000,500000,500000,500000,500000};
        double[] amount1={250000,250000,250000,250000,250000,250000,250000,250000,250000,250000};
        double[] gst1={18,18,18,18,18,18,18,18,18,18};
        creditlimit crd=new creditlimit(name1, city1, Creditlimit1, orderid1, productid1, price1, amount1, gst1);
        crd.output();


    }
}


//For single data

//    void clientDetail(){
//        System.out.println("Client Name: "+name);
//        System.out.println("Client City: "+city);
//        System.out.println("Client Creditlimit: "+Creditlimit);
//    }



//    void clientOrders() {
//        System.out.println("Order Id: "+orderid);
//        System.out.println("Product Id: "+productid);
//        System.out.println("Order Price: "+price);
//    }


//    void creditLimit(){
//        System.out.println("Amount: "+amount);
//        System.out.println("Gst: "+gst);
//    }


//        crd.clientDetail();
//        crd.clientOrders();
//        crd.creditLimit();
