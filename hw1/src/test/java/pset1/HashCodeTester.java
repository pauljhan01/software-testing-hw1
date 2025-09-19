package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
public class HashCodeTester {
/*
* P5: If two objects are equal according to the equals(Object)
* method, then calling the hashCode method on each of
* the two objects must produce the same integer result.
*/
// your test methods go here
    @Test public void p5_c_obj(){
        C c = new C(0);
        Object o = new Object();

        assertFalse(c.equals(o) && c.hashCode() == o.hashCode());
    }

    @Test public void p5_obj_c(){
        Object o = new Object();
        C c = new C(0);

        assertFalse(o.equals(c) && o.hashCode() == c.hashCode());
    }

    @Test public void p5_d_obj(){
        D d = new D(0,0);
        Object o = new Object();

        assertFalse(d.equals(o) && d.hashCode() == o.hashCode());
    }

    @Test public void p5_obj_d(){
        Object o = new Object();
        D d = new D(0,0);

        assertFalse(o.equals(d) && o.hashCode() == d.hashCode());
    }

    @Test public void p5_c_d(){
        C c = new C(0);
        D d = new D(0,0);

        assertFalse(c.equals(d) && c.hashCode() == d.hashCode());
    }

    @Test public void p5_d_c(){
        D d = new D(0,0);
        C c = new C(0);

        assertFalse(d.equals(c) && d.hashCode() == c.hashCode());
    }

    @Test public void p5_obj_obj_true(){
        Object o1 = new Object();
        Object o2 = o1;

        assertTrue(o1.equals(o2) && o1.hashCode() == o2.hashCode());
    }

    @Test public void p5_obj_obj_false(){
        Object o1 = new Object();
        Object o2 = new Object();

        assertFalse(o1.equals(o2) && o1.hashCode() == o2.hashCode());
    }

    /*
     * These tests assume that the equals(Object) function don't just check the value of int f
     * and instead also check for reference equality (this == c1). hashCode() is also assumed to return the same value given
     * reference equality.
     * 
     * In reality, both equals and hashCode for this assignment are not implemented so these tests fail
     */
    @Test public void p5_c_c_false(){
        C c1 = new C(0);
        C c2 = new C(0);

        assertFalse(c1.equals(c2) && c1.hashCode() == c2.hashCode());
    }

    @Test public void p5_c_c_true(){
        C c1 = new C(0);
        C c2 = c1;

        assertTrue(c1.equals(c2) && c1.hashCode() == c2.hashCode());
    }

    @Test public void p5_d_d_false(){
        D d1 = new D(0,0);
        D d2 = new D(0,0);

        assertFalse(d1.equals(d2) && d1.hashCode() == d2.hashCode());
    }

    @Test public void p5_d_d_true(){
        D d1 = new D(0,0);
        D d2 = d1;

        assertTrue(d1.equals(d2) && d1.hashCode() == d2.hashCode());
    }
}
