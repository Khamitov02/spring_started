package alishev;

import org.springframework.stereotype.Component;

@Component
public class Rock implements Music{
    @Override
    public void play() {
        System.out.println("AROOOOOCK");
    }
}
