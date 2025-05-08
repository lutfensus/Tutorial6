public class LibraryMedia {
    protected String title;
    protected int publicationYear;
    protected Boolean available;
    public LibraryMedia(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public void borrow(){
        if(available){
            available = false;
            System.out.println("\n===== BORROWED SUCCESSFULLY =====");
        }else {
            System.out.println("\n===== ALREADY BORROWED =====");
        }
    }

    public void returnMedia(){
        if(!available){
            available = true;
            System.out.println("\n===== RETURNED SUCCESSFULLY =====");
        }else {
            System.out.println("\n===== THIS MEDIA WASN'T BORROWED =====");
        }
    }

    public void displayInformation(){
        System.out.println("Title: " + title
        + "\nPublication Year: " + publicationYear
        + "\nAvailability: " + (available ? "Available" : "Borrowed"));
    }

}
