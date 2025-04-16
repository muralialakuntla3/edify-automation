package Factory;

import org.testng.annotations.Factory;

public class datafactory {
	
	@Factory
	public Object[] createInstances() {
		return new Object[] {
				new Lead("admin@yopmail.com","123456","ashwin","ashwin@gmail.com","9908088453"),
				new Lead("admin@yopmail.com","123456","kiran","kiran@gmail.com","8019684875"),
				new Lead("admin@yopmail.com","123456","srinivas","srinivas@gmail.com","9908088543"),
		};
	}

}
