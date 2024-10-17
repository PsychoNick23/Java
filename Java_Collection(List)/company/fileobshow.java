package company;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class fileobshow {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileOutputStream fout=new FileOutputStream("C:\\Users\\shree\\Desktop\\Java-main\\company\\PsychoNick.txt");

        String str="",data="";
        System.out.println("Enter your Text Here ! ! ! !");

        while(!data.equals("exit"))
        {
            data=sc.nextLine();
            if(!data.equals("exit"))
                str=str+data+"\n";
        }

        fout.write(str.getBytes());
        fout.close();


    }

}



//Using file Inputstream class and outputstream class copy data from one file to another file




//    public static void main(String[] args) throws IOException {
//        FileOutputStream fout=new FileOutputStream("C:\\Users\\shree\\Desktop\\Java-main\\company\\PsychoNick.txt");
//        String str="Have a nice Day ! ! ! ";
//
//        byte b[]=str.getBytes();
//
//        fout.write(b);
//
//        fout.close();
//
//        System.out.println("Data succesfully added");
//
//    }





//Writing text in a file
//    public static void main(String[] args) {
//        String data="This is a line of text inside the file";
//
//        try{
//            FileOutputStream output=new FileOutputStream("PsychoNick.txt");
//
//            byte[] array=data.getBytes();
//
//            output.write(array);
//
//            output.close();
//        }
//        catch(Exception e){
//            e.getStackTrace();
//        }
//    }






//        File file=new File("C:\\Users\\shree\\Desktop\\Java-main\\company");
//        System.out.println(file.exists());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getPath());
//        System.out.println(file.isAbsolute());
//        System.out.println(file.isFile());
//
//
//
//        String files[]=file.list();
//        System.out.println("All Files");
//        for(String name:files)
//        {
//            System.out.println(name);
//        }
//






//        String[] files =file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File file, String str) {
//                if(str.toLowerCase().endsWith(".java"))
//                return true;
//                else
//                   return false;
//            }
//        });






//        System.out.println("All Files");
//        for(String name:files)
//        {
//            System.out.println(name);
//        }






// public static void main(String[] args) throws IOException {
//
//        File file=new File("PsychoNick.txt");
//
//        if(file.createNewFile())
//        {
//            System.out.println("Creating a new File");
//        }
//        else
//        {
//            System.out.println("File already exist");
//        }
//        System.out.println(file.exists());
//        System.out.println(file.getAbsoluteFile());
//    }