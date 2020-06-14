package javaonline.oop;

import java.util.Arrays;

public class Song {
    private String title;
    private String youtubeUrl;
    private String artist;
    private String album;
    private int released;
    private String[] genres;
    private String lyrics;

    public Song(String title, String youtubeUrl, String artist, String album,
                int released, String[] genres, String lyrics) {
        this.title = title;
        this.youtubeUrl = youtubeUrl;
        this.artist = artist;
        this.album = album;
        this.released = released;
        this.genres = genres;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getReleased() {
        return released;
    }

    public String[] getGenres() {
        return genres;
    }

    public String getLyrics() {
        return lyrics;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ",\nyoutubeUrl='" + youtubeUrl + '\'' +
                ",\nartist='" + artist + '\'' +
                ",\nalbum='" + album + '\'' +
                ",\nreleased=" + released +
                ",\ngenres=" + Arrays.toString(genres) +
                ",\nlyrics='" + lyrics + '\'' +
                '}';
    }
}
