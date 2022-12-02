package alishev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Ipod {

    private Music music;

    public Music getMusic() {
        return music;
    }


    public void setMusic(Music music) {
        this.music = music;
    }


    public Ipod(@Qualifier("jass")Music music) {
        this.music = music;
        System.out.println(((Jass) music).getName());
    }
    public void igrat(){
        music.play();
    }

}
