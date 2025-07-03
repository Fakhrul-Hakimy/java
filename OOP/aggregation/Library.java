package OOP.aggregation;

public class Library {

    String name;
    String country;
    Book[] books;

    public Library(String name, String country, Book[] books) {
        this.name = name;
        this.country = country;
        this.books = books;
    }


    public void details(){
        System.out.println("Library : "+name);
        System.out.println("Country of origin : "+country);

        for(Book book:books){
            System.out.println(book.toString());
        }

    }
}
