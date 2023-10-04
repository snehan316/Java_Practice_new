import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HashSetTest {

    private Set<String> set;
    private boolean res;

    @Before
    public void before() throws Exception {

        set = new HashSet<>();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testAdd() throws Exception {
        res = set.add("Sean");
        assertTrue(res);
        assertTrue(set.size() == 1);
        assertTrue(set.toString().equals("Sean"));
        res = set.add("Sean");
        assertTrue(!res);
        res = set.add("Jason");
        assertTrue(res);
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("Sean, Jason") ||
                set.toString().equals("Jason, Sean"));
        res = set.add("Jason");
        assertTrue(!res);
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("Sean, Jason") ||
                set.toString().equals("Jason, Sean"));

    }

    @Test
    public void testRemove() throws Exception {
        set.add("Josh");
        set.add("Dev");
        set.add("Alexei");
        assertTrue(set.size() == 3);
        res = set.remove("Alexei");
        assertTrue(res);
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("Josh, Dev") ||
                set.toString().equals("Dev, Josh"));
        res = set.remove("Alexei");
        assertTrue(!res);
        assertTrue(set.size() == 2);
        assertTrue(set.toString().equals("Josh, Dev") ||
                set.toString().equals("Dev, Josh"));
        res = set.remove("Dev");
        assertTrue(res);
        assertTrue(set.size() == 1);
        assertTrue(set.toString().equals("Josh"));
    }

    @Test
    public void testContains() throws Exception {
        assertTrue(!set.contains("Alexei"));
        set.add("Josh");
        assertTrue(set.contains("Josh"));
        set.add("Josh");
        assertTrue(set.contains("Josh"));
        assertTrue(!set.contains("Alexei"));
        set.add("Alexei");
        assertTrue(set.contains("Alexei") && set.contains("Josh"));
    }

    @Test
    public void testSize() throws Exception {
        assertTrue(set.size() == 0);
        set.add("Jason");
        set.add("Jason");
        assertTrue(set.size() == 1);
        set.add("Dev");
        set.add("Sean");
        assertTrue(set.size() == 3);
        set.remove("Jason");
        assertTrue(set.size() == 2);

    }


} 
