
package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
    @Test public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    // repOkOneNodeValid
    @Test public void t1() {
        SLList l = new SLList();
        Node first = new Node();

        l.first = first;
        l.last  = first;

        assertTrue(l.repOk());
    }
    // your code goes here
    // repOkOneNodeInvalid
    @Test public void t2() {
        SLList l = new SLList();
        Node first = new Node();

        l.first = first;
        l.last  = null;

        assertFalse(l.repOk());
    }

    // repOkTwoNodesValid
    @Test public void t3() {
        SLList l = new SLList();
        Node first = new Node();
        Node last  = new Node();

        first.next = last;
        
        l.first = first;
        l.last = last;

        assertTrue(l.repOk());
    }

    // repOkTwoNodesInvalid
    @Test public void t4(){
        SLList l = new SLList();
        Node first = new Node();
        Node last = new Node();

        first.next = first;

        l.first = first;
        l.last = last;

        assertFalse(l.repOk());
    }
}
