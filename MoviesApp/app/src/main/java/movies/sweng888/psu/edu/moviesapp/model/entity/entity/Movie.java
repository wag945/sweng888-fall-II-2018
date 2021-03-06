package movies.sweng888.psu.edu.moviesapp.model.entity.entity;

public class Movie {

    private long ID;
    private String title;
    private String category;
    private String rating;
    private String year;

    public Movie(){}

    public Movie(String title, String year){
        this.title = title;
        this.year = year;
    }

    public Movie (String title, String category, String rating, String year){
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.year = year;
    }

    public Movie (long ID, String title, String category, String rating, String year){
        this.ID = ID;
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.year = year;
    }

    public Movie(String title, String category, String year) {
        this.title = title;
        this.category = category;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
