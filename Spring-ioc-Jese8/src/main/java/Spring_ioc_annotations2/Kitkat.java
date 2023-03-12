package Spring_ioc_annotations2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Kitkat implements Chocolate {
	public void Open() {
		System.out.println("Kitkat chocolate opened");
}
}
