package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualsTester {
    /*
    * P1: For any non-null reference value x, x.equals(null) should return false.
    */
    @Test public void p1_obj() {
        assertFalse(new Object().equals(null));
    }

    @Test public void p1_C(){
        assertFalse(new C(0).equals(null));
    }

    @Test public void p1_D(){
        assertFalse(new D(0, 0).equals(null));
    }

    /*
    * P2: It is reflexive: for any non-null reference value x, x.equals(x)
    * should return true.
    */
    @Test public void p2_obj() {
        Object obj = new Object();
        assertTrue(obj.equals(obj));
    }

    @Test public void p2_c(){
        C c = new C(0);
        assertTrue(c.equals(c));
    }

    @Test public void p2_d(){
        D d = new D(0, 0);
        assertTrue(d.equals(d));
    }

    /*
    * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
    * should return true if and only if y.equals(x) returns true.
    */
    @Test public void p3_c_obj() {
        Object o = new Object();
        C c = new C(0);

        // P = x.equals(y)
        // Q = y.equals(x)
        // P <-> Q is P->Q && Q->P. P -> Q = !P || Q
        // then why is there an assertion error
        assertFalse((!c.equals(o) || o.equals(c)) && (!o.equals(c) || c.equals(o)));
    }

    @Test public void p3_obj_c(){
        C c = new C(0);
        Object o = new Object();

        assertFalse((!o.equals(c) || c.equals(o)) && (!c.equals(o) || o.equals(c)));
    }

    @Test public void p3_d_obj() {
        D d = new D(0,0);
        Object o = new Object();

        assertFalse((!d.equals(o) || o.equals(d)) && (!o.equals(d) || d.equals(o)));
    }

    @Test public void p3_obj_d(){
        Object o = new Object();
        D d = new D(0,0);

        assertFalse((!o.equals(d) || d.equals(o)) && (!d.equals(o) || o.equals(d)));
    }

    @Test public void p3_c_d(){
        C c = new C(0);
        D d = new D(0,0);

        assertFalse((!c.equals(d) || d.equals(c)) && (!d.equals(c) || c.equals(d)));
    }

    @Test public void p3_d_c(){
        C c = new C(0);
        D d = new D(0,0);

        assertFalse((!d.equals(c) || c.equals(d)) && (!c.equals(d) || d.equals(c)));
    }

    @Test public void p3_obj_obj_false(){
        Object o1 = new Object();
        Object o2 = new Object();

        assertFalse((!o1.equals(o2) || o2.equals(o1)) && (!o2.equals(o1) || o1.equals(o1)));
    }

    @Test public void p3_obj_obj_true(){
        Object o1 = new Object();
        Object o2 = o1;

        assertTrue((!o1.equals(o2) || o2.equals(o1)) && (!o2.equals(o1) || o1.equals(o1)));
    }

    @Test public void p3_c_c_false(){
        C c1 = new C(0);
        C c2 = new C(0);

        assertFalse((!c1.equals(c2) || c2.equals(c1)) && (!c2.equals(c1) || c1.equals(c2)));
    }

    @Test public void p3_c_c_true(){
        C c1 = new C(0);
        C c2 = c1;

        assertTrue((!c1.equals(c2) || c2.equals(c1)) && (!c2.equals(c1) || c1.equals(c2)));
    }

    @Test public void p3_d_d_false(){
        D d1 = new D(0,0);
        D d2 = new D(0,0);

        assertFalse((!d1.equals(d2) || d2.equals(d1)) && (!d2.equals(d1) || d1.equals(d2)));
    }

    @Test public void p3_d_d_true(){
        D d1 = new D(0,0);
        D d2 = d1;

        assertTrue((!d1.equals(d2) || d2.equals(d1)) && (!d2.equals(d1) || d1.equals(d2)));
    }

    /*
    * P4: It is transitive: for any non-null reference values x, y, and z,
    * if x.equals(y) returns true and y.equals(z) returns true, then
    * x.equals(z) should return true.
    */

    @Test public void p4() {
        
    }
}