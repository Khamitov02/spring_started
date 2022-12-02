package alishev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("alishev")
@PropertySource("classpath:dannie.properties")
@EnableAspectJAutoProxy
public class Cfg {

}
