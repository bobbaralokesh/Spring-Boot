package my.app.inter;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()

public class ProcessImpl implements Iprocess {

	public void Getprocesscode() {
	 System.out.println("P1");	

	}

}
