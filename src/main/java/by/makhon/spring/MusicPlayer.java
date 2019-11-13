package by.makhon.spring;

import by.makhon.spring.bean.Genre;
import by.makhon.spring.bean.music.ClassicMusic;
import by.makhon.spring.bean.music.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {

    private String name;
    private int volume;
    @Autowired
    private ClassicMusic classicMusic;
    @Autowired
    private RockMusic rockMusic;

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic(Genre genre) {
        Random randomSong = new Random();
        switch (genre) {
            case ROCK:
                System.out.println(
                        "Playing -> " + rockMusic.getRockMusicList().get(randomSong.nextInt(rockMusic.getRockMusicList().size()))
                );
                break;
            case CLASSICAL:
                System.out.println(
                        "Playing -> " + classicMusic.getClassicSongList().get(randomSong.nextInt(classicMusic.getClassicSongList().size()))
                );
                break;
            default:
                break;
        }
        return null;
    }
}
