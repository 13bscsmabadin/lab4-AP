package crawler;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CrawlerTest {
    
    public CrawlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * AddTree method test of class Crawler.
     */
    @Test
    public void testAddTree() {
        System.out.println("addTree");
        File file = null;
        Collection<File> all = null;
        Crawler.addTree(file, all);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * searchIndex method test of class Crawler.
     */
    @Test
    public void testSearchIndex() throws Exception {
        System.out.println("searchIndex");
        HashMap MyFiles = null;
        Crawler.searchIndex(MyFiles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printIndex method, of class Crawler.
     */
    @Test
    public void testPrintIndex() {
        System.out.println("printIndex");
        HashMap MyFiles = null;
        Crawler.printIndex(MyFiles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * main method test of class Crawler.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Crawler.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
