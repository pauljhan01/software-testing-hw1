package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class SLListAddTester {

    @Test public void testSLListOneNode() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.first != null);
        // your code goes here
        assertTrue(l.first.elem == true);
        assertTrue(l.first.next == null);
        assertTrue(l.first == l.last);
    }

    @Test public void testSLListTwoNodes() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        System.out.println(l.repOk());
        assertTrue(l.repOk());
        l.add(false);
        assertTrue(l.repOk());
        // write a sequence of assertTrue method invocations that
        // perform checks on the values for all the declared fields
        // of list and node objects reachable from l
        assertTrue(l.first != null);
        // your code goes here
        assertTrue(l.first.elem == true);
        assertTrue(l.first.next != null);

        assertTrue(l.last.elem == false);
        assertTrue(l.last.next == null);
    }
}
