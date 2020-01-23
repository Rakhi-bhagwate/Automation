package Auto.Auto;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//    @Test(priority=2, description="This test case will verify login functionality")
//	public void loginApp() {
//		System.out.println("HIIII");
//	}
//
//	@Test(priority=1, description="This test case will check the selected items list")
//	public void selectItems() {
//		System.out.println("The item is selected");
//	}
//	
//	@Test(priority=3, description="This test case will check the items")
//	public void checkItems() {
//		System.out.println("The item is checked");
//	}
}
