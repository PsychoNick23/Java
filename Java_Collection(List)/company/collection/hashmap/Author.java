package company.collection.hashmap;

public class Author {
    int id;
    String name;
    String city;
    Books bk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Books getBk() {
        return bk;
    }

    public void setBk(Books bk) {
        this.bk = bk;
    }

    public Author(int id, String name, String city, Books bk) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.bk = bk;
    }


}
