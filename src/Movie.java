public class Movie extends LibraryMedia {
    final private String director;
    final private int duration;


    public Movie (String title, int publicationYear, String director, int duration) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
    }


    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);

    }


    public void checkDuration(){
        if (duration > 120){
            System.out.println("==== THIS IS A LONG MOVIE (" + duration +" minutes) ====");
        }else {
            System.out.println("==== THIS IS A STANDART MOVIE (" + duration +" minutes) ====");
        }
    }

}
