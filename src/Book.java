public class Book extends LibraryMedia {
    String Author;
    int pages;


    public Book(String title, int publicationYear, String author, int pages){
        super(title, publicationYear);
        this.Author = author;
        this.title = title;
        this.publicationYear = publicationYear;

        System.out.println("Is available? " + available);
        borrow();





    }

    @Override
    public void displayInformation(){}

}
