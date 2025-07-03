package OOP.aggregation;

public class Book {

    private String name;
    private int page;

    public Book() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book : "+name+ " Page : "+ page;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public Book(String name, int page) {
        this.page = page;
        this.name = name;
    }
}
