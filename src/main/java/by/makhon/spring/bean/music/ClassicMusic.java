package by.makhon.spring.bean.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ClassicMusic implements Music {

    private List<String> classicSongList = asList(
            "Chopin - Moon Sonata",
            "Bethoven - Polonez #3",
            "Bah - Symphony #9"
    );

    public List<String> getClassicSongList() {
        return classicSongList;
    }

    @Override
    public String getSong() {
        return "Chopin Moon Sonata";
    }
}
