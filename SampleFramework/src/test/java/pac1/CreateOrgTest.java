package pac1;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups = "SmokeTest")
	public void createOrg() {
		System.out.println("execute createOrg");
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}

	@Test
	public void createOrgWithPhone() {
		System.out.println("execute createOrgWithPhone");
	}
}
