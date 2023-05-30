package lt.viko.eif.eulozas.soap.musicplatform;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import com.example.songs.Song;
import com.example.songs.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class SongRepository {
    private static final Map<String, Song> songs = new HashMap<>();

    @PostConstruct
    public void initData() {
        Song cool = new Song();
        cool.setName("Cool");
        cool.setArtist("Jonas Brothers");
        cool.setReleaseYear(2019);
        cool.setGenre(Genre.POP);

        songs.put(cool.getName(), cool);

        Song enemies = new Song();
        enemies.setName("Enemies");
        enemies.setArtist("Shinedown");
        enemies.setReleaseYear(2012);
        enemies.setGenre(Genre.METAL);

        songs.put(enemies.getName(), enemies);

        Song handsUp = new Song();
        handsUp.setName("Hands Up");
        handsUp.setArtist("50 Cent");
        handsUp.setReleaseYear(2006);
        handsUp.setGenre(Genre.RAP);

        songs.put(handsUp.getName(), handsUp);
    }

    public Song findSong(String name) {
        Assert.notNull(name, "The Song's name must not be null");
        return songs.get(name);
    }
}