package alishev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Cfg.class);
        Ipod ipod1= context.getBean("ipod",Ipod.class);

        ipod1.igrat();




context.close();
    }
}
