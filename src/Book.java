public class Book extends LibraryMedia {
    final private String author;
    final private int numberOfPages;

    public Book(String title, int publicationYear, String author, int numberOfPages){
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
    @Override
    public void displayInformation(){
     super.displayInformation();
     System.out.println("Author: " + author);
     System.out.println("Number of pages: " + numberOfPages);
    }

    public void checkNumberOfPages(){
        if (numberOfPages > 500){
            System.out.println("\n===== THIS BOOK IS LONG (" + numberOfPages + " pages) =====");

        }else {
            System.out.println("\n===== THIS BOOK IS STANDART (" + numberOfPages + " pages) =====");
        }

    }
}
