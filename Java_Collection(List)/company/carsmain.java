package company;

import java.util.*;

public class carsmain {
    public static void main(String[] args) {

        HashMap<String,cars> cd=new HashMap<String,cars>();
        cd.put("sedan",(new cars("Honda Civic",25,"18 Lakh")));
        cd.put("hatchback",(new cars("Mercedes-AMG A-Class",20,"30 Lakh")));
        cd.put("muv",(new cars("Lexus LM",11,"2.5 Cr")));

        Scanner sc=new Scanner(System.in);
        String choice;
        System.out.println("What type of car are you looking for? \n - Sedan \n - Hatchback \n - MUV ");
        choice=sc.nextLine();
//
//        System.out.println(cd.get(choice.toLowerCase()));


        for(HashMap.Entry<String,cars> ob: cd.entrySet())
        {
            if(ob.getKey().equals(choice.toLowerCase()))
            {
                System.out.println(ob.getValue());
            }
        }
    }
}

