package company.collection.hashmap;

import java.util.ArrayList;
import java.util.List;

public class book_author {
    public static void main(String[] args) {
        List<Author> ob=new ArrayList<Author>();
        ob.add(new Author(1,"aa","bb",new Books(1,"dd",99)));
    }
}
