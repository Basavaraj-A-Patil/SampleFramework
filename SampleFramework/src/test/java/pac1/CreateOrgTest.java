package pac1;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups = "SmokeTest")
	public void createOrg() throws InterruptedException {
		System.out.println("execute createOrg");
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));

		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://localhost:8888/"); Thread.sleep(2000); driver.quit();
		 */

	}

	@Test
	public void createOrgWithPhone() {
		System.out.println("execute createOrgWithPhone");
	}

	@Test
	public void deleteOrg() {
		System.out.println("execute deleteOrg");
	}
}
