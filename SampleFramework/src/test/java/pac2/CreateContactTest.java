package pac2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTest {
	@Test(groups = "SmokeTest")
	public void createContact() {
		System.out.println("execute createContact");
	}

	@Test
	public void createContactWithOrg() {
		System.out.println("execute createContactWithOrg");
		Assert.fail();
	}
}
