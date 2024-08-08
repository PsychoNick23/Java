package Java;

class Books{
    String title;
    String author;
    int year;

    void info(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
    }


}
