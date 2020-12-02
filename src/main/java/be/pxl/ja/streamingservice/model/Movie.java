package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    private String title;
    private Rating maturityRating;

    private String director;
    private LocalDate releasedate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) { this.director = director; }

    public LocalDate getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(LocalDate releasedate) {
        this.releasedate = releasedate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + this);
    }

    @Override
    public void pause() {
        System.out.println("Paused: " + this);
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Rating getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(Rating maturityRating) {
        this.maturityRating = maturityRating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title;
    }
}
