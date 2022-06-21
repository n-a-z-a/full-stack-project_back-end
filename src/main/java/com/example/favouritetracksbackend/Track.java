package com.example.favouritetracksbackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trackId;
    private String title;
    private String artist;
    private String genre;

    private LocalDate dateCreated;
    private String dateCreatedFormatted;

    public Track() {
        dateCreated = LocalDateTime.now().toLocalDate();
        dateCreatedFormatted = dateCreated.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateCreatedFormatted() {
        return dateCreatedFormatted;
    }

    public void setDateCreatedFormatted(String dateCreatedFormatted) {
        this.dateCreatedFormatted = dateCreatedFormatted;
    }
}
