package by.makhon.spring.bean.music;


import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

@Component
public class RockMusic implements Music {

    private List<String> rockMusicList = asList(
            "Queen - Bohemian Rhapsody",
            "Linkin Park - From The Inside",
            "Rammstein - Ohne Dich"
    );

    public List<String> getRockMusicList() {
        return rockMusicList;
    }

    @Override
    public String getSong() {
        return "Queen Bohemian Rhapsody";
    }
}
