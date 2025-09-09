
package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
    @Test public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    @Test public void testRepOkOneNodeValid() {
        SLList l = new SLList();
        Node first = new Node();

        l.first = first;
        l.last  = first;

        assertTrue(l.repOk());
    }
    // your code goes here
    @Test public void testRepOkOneNodeInvalid() {
        SLList l = new SLList();
        Node first = new Node();

        l.first = first;
        l.last  = null;

        assertFalse(l.repOk());
    }

    @Test public void testRepOkTwoNodesValid() {
        SLList l = new SLList();
        Node first = new Node();
        Node last  = new Node();

        first.next = last;
        
        l.first = first;
        l.last = last;

        assertTrue(l.repOk());
    }

    @Test public void testRepOkTwoNodesInvalid(){
        SLList l = new SLList();
        Node first = new Node();
        Node last = new Node();

        first.next = first;

        l.first = first;
        l.last = last;

        assertFalse(l.repOk());
    }
}
