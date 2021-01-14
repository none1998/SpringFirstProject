package springproject.first.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Integer id;
    @Column(name = "title")
    String title;
    @Column(name = "year")
    int year;
    @Column(name = "description")
    String description;
    @Column(name = "rating")
    String rating;
    @Column(name = "image")
    String image;
    @Column(name = "link")
    String link;

    public Movie(String title, int year, String description, String rating, String image, String link) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.rating = rating;
        this.image = image;
        this.link = link;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                ", image='" + image + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
