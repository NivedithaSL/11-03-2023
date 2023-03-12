package Spring_ioc_annotations2;

import org.springframework.stereotype.Component;

@Component
public class Dairymilk implements Chocolate{
public void Open() {
	System.out.println("Dairymilk chocolate opened");
}
}
