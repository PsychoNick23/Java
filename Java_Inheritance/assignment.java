package Java;




class client{


    String name;
    String city;
    double Creditlimit;


    public client(String name, String city, double Creditlimit) {
        this.name = name;
        this.city = city;
        this.Creditlimit = Creditlimit;
    }

    void clientDetail(){
        System.out.println("Client Name: "+name);
        System.out.println("Client City: "+city);
        System.out.println("Client Creditlimit: "+Creditlimit);
    }


}

class orders extends client{

    String orderid;
    String productid;
    double price;


    public orders(String name, String city, double Creditlimit, String orderid, String productid, double price){
        super(name, city, Creditlimit);
        this.orderid = orderid;
        this.productid = productid;
        this.price = price;
    }

    void clientOrders() {
        System.out.println("Order Id: "+orderid);
        System.out.println("Product Id: "+productid);
        System.out.println("Order Price: "+price);
    }


}
class creditlimit extends orders{
    double amount;
    double gst;


    public creditlimit(String name, String city, double Creditlimit, String orderid, String productid, double price, double amount, double gst){
        super(name, city, Creditlimit,orderid,productid,price);
        this.amount=amount;
        this.gst=gst;

    }

    void creditLimit(){
        System.out.println("Amount: "+amount);
        System.out.println("Gst: "+gst);
    }
}

public class assignment {
    public static void main(String[] args) {
        creditlimit crd=new creditlimit("Nishant","Mumbai",1000000,"A101","A#121",800000,50000,18);
        crd.clientDetail();
        crd.clientOrders();
        crd.creditLimit();

    }
}
