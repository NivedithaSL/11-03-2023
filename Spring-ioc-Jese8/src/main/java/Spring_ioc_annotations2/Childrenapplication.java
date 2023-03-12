package Spring_ioc_annotations2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Childrenapplication {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig2.class);
//Children children=applicationContext.getBean(Children.class);
	Children children=(Children)applicationContext.getBean("children");
children.eating();
}
}
