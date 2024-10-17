package company.collection.hashmap;

public class Books {
    int id;
    String name;
    int nop;

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

    public int getNop() {
        return nop;
    }

    public void setNop(int nop) {
        this.nop = nop;
    }

    public Books(int id, String name, int nop) {
        this.id = id;
        this.name = name;
        this.nop = nop;
    }
}
