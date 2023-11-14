package my.app.inter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Format {
     @Autowired
     @Qualifier("PP")
	private Iprocess pob; 
	public void Printformat() {
		pob.Getprocesscode();
		System.out.println("IN Format");
	}
}
