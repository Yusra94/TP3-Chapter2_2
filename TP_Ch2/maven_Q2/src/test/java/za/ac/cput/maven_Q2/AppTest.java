package za.ac.cput.maven_Q2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import pack1.AccountHolder;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    AccountHolder aH = new AccountHolder();
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
    public void testApp()
    {
        assertTrue( true );
    }

    public void testIntegerDeposit()
    {
        assertEquals("Invalid option selected", 1,aH.getActivity() );
    }

    public void testIntegerWithdrawal()
    {
        assertEquals("Invalid option selected", 2,aH.getActivity() );
    }

    public void testFloat()
    {
        assertEquals("Not a valid amount", 300.50f, aH.getAmount());
    }

    public void testString()
    {
        assertEquals("Account number is invalid", "12345", aH.getAccountNumber());
    }
}
