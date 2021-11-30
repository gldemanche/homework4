/**
 * examples
 * @author Gabe Demanche & Chris Chow
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class My_Examples {

    IBinTree testHeap1aa = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap1ab = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap1 = new DataBT(2, testHeap1aa, testHeap1ab);

    IBinTree testHeap1bba = new DataBT(10, new MtBT(), new MtBT());
    IBinTree testHeap1ba = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap1bb = new DataBT(7, new MtBT(), testHeap1bba);

    IBinTree testHeap1b = new DataBT(3, testHeap1ba, testHeap1bb);
    IBinTree testHeap11 = new DataBT(1, testHeap1, testHeap1b);

    IBinTree testHeap2aa = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap2ab = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap2 = new DataBT(2, testHeap2aa, testHeap2ab);

    IBinTree testHeap2bba = new DataBT(1, new MtBT(), new MtBT());
    IBinTree testHeap2ba = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap2bb = new DataBT(7, new MtBT(), testHeap2bba);
    IBinTree testHeap2b = new DataBT(3, testHeap2ba, testHeap2bb);

    IBinTree testHeap12 = new DataBT(10, testHeap2, testHeap2b);

    IBinTree testHeap3aa = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap3ab = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap3a = new DataBT(2, testHeap3aa, testHeap3ab);

    IBinTree testHeap3bba = new DataBT(10, new MtBT(), new MtBT());
    IBinTree testHeap3ba = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap3bb = new DataBT(9, new MtBT(), testHeap3bba);
    IBinTree testHeap3b = new DataBT(3, testHeap3ba, testHeap3bb);

    IBinTree testHeap13 = new DataBT(1, testHeap3a, testHeap3b);

    IBinTree testHeap4aa = new DataBT(3, new MtBT(), new MtBT());
    IBinTree testHeap4ab = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap4a = new DataBT(1, testHeap4aa, testHeap4ab);

    IBinTree testHeap4bba = new DataBT(7, new MtBT(), new MtBT());
    IBinTree testHeap4ba = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap4bb = new DataBT(6, new MtBT(), testHeap4bba);
    IBinTree testHeap4b = new DataBT(2, testHeap4ba, testHeap4bb);

    IBinTree testHeap14 = new DataBT(0, testHeap4a, testHeap4b);

    IHeap heap1 = new DataHeap(1);
    IHeap heap2 = new DataHeap(-1);
    IHeap heap3 = new DataHeap(1);
    IHeap heap4 = new DataHeap(1);
    IHeap heap5 = new DataHeap(1);

    HeapChecker HT = new HeapChecker();

    @Before
    public void setUp() {
        heap1 = heap1.addElt(2);
        heap1 = heap1.addElt(3);
        heap1 = heap1.addElt(4);
        heap1 = heap1.addElt(5);
        heap1 = heap1.addElt(6);
        heap1 = heap1.addElt(7);

        heap2 = heap2.addElt(1);
        heap2 = heap2.addElt(2);
        heap2 = heap2.addElt(3);
        heap2 = heap2.addElt(4);
        heap2 = heap2.addElt(5);
        heap2 = heap2.addElt(6);
        heap2 = heap2.addElt(7);
        heap2 = heap2.addElt(10);

        heap3 = heap3.addElt(2);
        heap3 = heap3.addElt(3);
        heap3 = heap3.addElt(4);
        heap3 = heap3.addElt(5);
        heap3 = heap3.addElt(6);
        heap3 = heap3.addElt(10);

        heap4 = heap4.addElt(1);
        heap4 = heap4.addElt(2);
        heap4 = heap4.addElt(3);
        heap4 = heap4.addElt(4);
        heap4 = heap4.addElt(5);
        heap4 = heap4.addElt(6);
        heap4 = heap4.addElt(7);
        heap4 = heap4.addElt(10);

        heap5 = heap5.addElt(1);
        heap5 = heap5.addElt(2);
        heap5 = heap5.addElt(3);
        heap5 = heap5.addElt(4);
        heap5 = heap5.addElt(5);
        heap5 = heap5.addElt(6);
        heap5 = heap5.addElt(7);
        heap5 = heap5.addElt(10);
        heap5 = heap5.addElt(10);

    }


    //addEltTester

    //addEltTester for a valid heap.
    @Test
    public void checkValidHeap1() {
        assertTrue(HT.addEltTester(heap1, 10, testHeap11));
    }

    //addEltTester for an invalid heap.
    @Test
    public void checkInvalidHeap() {
        assertFalse(HT.addEltTester(heap1, 10, testHeap12));
    }

    //addEltTester for when an added elt has an incorrect number of occurrences.
    @Test
    public void wrongOccurrence() {
        assertFalse(HT.addEltTester(heap1, 10, testHeap13));
    }

    //addEltTester for total no. of elements is incorrect.
    @Test
    public void wrongTotOccurrence() {
        assertFalse(HT.addEltTester(heap5, 0, testHeap14));
    }

    //addEltTester for an empty tree.
    @Test
    public void emptyTree() {
        assertTrue(HT.addEltTester(new MtHeap(), 3, new DataBT(3, new MtBT(), new MtBT())));
    }

    @Test
    public void addMin() {
        assertTrue(HT.addEltTester(heap1, 0, testHeap14));
    }

    @Test
    public void deleteAll() {
        assertFalse(HT.addEltTester(heap1, 10, new MtBT()));
    }


    //remMinEltTester
    @Test
    public void validHeap2() {
        assertTrue(HT.remMinEltTester(heap2, heap2.remMinElt()));
    }

    @Test
    public void emptyTree2() {
        assertTrue(HT.remMinEltTester(new DataHeap(1), new MtBT()));
    }

    @Test
    public void wrongRemoved() {
        assertFalse(HT.remMinEltTester(heap3, testHeap11));
    }

    @Test
    public void duplicate() {
        assertTrue(HT.remMinEltTester(heap4, heap4.remMinElt()));
    }

    @Test
    public void invalidHeap2() {
        assertFalse(HT.remMinEltTester(heap2, testHeap12));
    }

    @Test
    public void emptyTree3() {
        assertTrue(HT.remMinEltTester(new MtHeap(), new MtBT()));
    }

    @Test
    public void wrongTotOccurrence2() {
        assertFalse(HT.remMinEltTester(heap5, testHeap14));
    }

}