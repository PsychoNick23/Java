package company;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class DataRead {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\shree\\Desktop\\Java-main\\company\\PsychoNick.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
