package za.ac.cput.project2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Ignore;
import  org.junit.rules.*;
import org.junit.runners.model.TestTimedOutException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    char [] arrA = {'a', 'b', 'c'};
    char [] arrB = {'a', 'b', 'c'};

    ItemInfo info1;
    ItemInfo info2;
    App appObj = new App();

    ExpectedException thrown = ExpectedException.none();
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
    public void testAppFloat()
    {
        assertEquals(12.12f, 12.12f);
    }

    public void testAppInt()
    {
        assertEquals(3, 3 );
    }

    public void testAppObjectEqual()
    {
        assertEquals(info1, info2);
    }

    public void testAppObjectId()
    {
        assertEquals(info1, info2);
    }


    public void testAppTruth()
    {
        assertTrue( true );
    }

    public void testAppFalse()
    {
        assertFalse(false);
    }

    public void testAppIsNull()
    {
        assertNull("ItemInfo object is null", info1);
    }

    public void testAppNotNull()
    {
        assertNotNull("ItemInfo object is not null", info2);

    }

    @Ignore
    public void appFail()
    {
        fail("This test has failed");
    }

    public void testAppException2() throws Throwable
    {

        thrown.expect(TestTimedOutException.class);
    }


    public void testAppArrayContent()
    {
        Assert.assertArrayEquals(arrA, arrB);
    }
}
