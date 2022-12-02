package alishev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Jass implements Music{

    private int i;
    private String name;

    public String getName() {
        System.out.println(name);
        return name;

    }

    public void poi() {
        System.out.println("YA rodilsya");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("TUTUTUTu");
    }
}
