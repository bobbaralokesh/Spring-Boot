package my.app.inter;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ap= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Format ft=ap.getBean("format", Format.class);
		ft.Printformat();

	}

}
