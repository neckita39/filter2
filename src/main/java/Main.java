import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.Configuration.Config;
import ru.Configuration.Parse;

public class Main {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Parse parse=context.getBean(Parse.class);
        context.close();
    }
}
