
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Examples {

    public Examples(){}
    IBinTree testHeap1_4 = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap1_5 = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap1_2 = new DataBT(2, testHeap1_4, testHeap1_5);

    IBinTree testHeap1_10 = new DataBT(10, new MtBT(), new MtBT());
    IBinTree testHeap1_6 = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap1_7 = new DataBT(7, new MtBT(),testHeap1_10);
    IBinTree testheap1_10a = new DataBT(10, new MtBT(),testHeap1_10);

    IBinTree testHeap1_3 = new DataBT(3, testHeap1_6, testHeap1_7);
    IBinTree testHeap1_1 = new DataBT(1, testHeap1_2, testHeap1_3);

    IBinTree testHeap1_3a = new DataBT(3, testHeap1_6, testheap1_10a);
    IBinTree testHeap1_1a = new DataBT(1, testHeap1_2, testHeap1_3a);

    IBinTree testheap2_4 = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testheap2_5 = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap2_2 = new DataBT(2, testheap2_4, testheap2_5);

    IBinTree testHeap2_1 = new DataBT(1, new MtBT(), new MtBT());
    IBinTree testHeap2_6 = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap2_7 = new DataBT(7, new MtBT(), testHeap2_1);
    IBinTree testHeap2_3 = new DataBT(3, testHeap2_6, testHeap2_7);

    IBinTree testHeap2_10 = new DataBT(10, testHeap2_2, testHeap2_3);

    IBinTree testHeap3_4 = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap3_5 = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap3_2 = new DataBT(2, testHeap3_4, testHeap3_5);

    IBinTree testHeap3_10 = new DataBT(10, new MtBT(), new MtBT());
    IBinTree testHeap3_6 = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap3_9 = new DataBT(9, new MtBT(), testHeap3_10);
    IBinTree testHeap3_3 = new DataBT(3, testHeap3_6, testHeap3_9);

    IBinTree testHeap3_1 = new DataBT(1, testHeap3_2, testHeap3_3);

    IBinTree testHeap4_3 = new DataBT(3, new MtBT(), new MtBT());
    IBinTree testHeap4_4 = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap4_1 = new DataBT(1, testHeap4_3, testHeap4_4);

    IBinTree testHeap4_7 = new DataBT(7, new MtBT(), new MtBT());
    IBinTree testHeap4_5 = new DataBT(5, new MtBT(), new MtBT());
    IBinTree testHeap4_6 = new DataBT(6, new MtBT(), testHeap4_7);
    IBinTree testHeap4_2 = new DataBT(2, testHeap4_5, testHeap4_6);

    IBinTree testHeap4_0 = new DataBT(0, testHeap4_1, testHeap4_2);

    IBinTree testHeap5_4 = new DataBT(4, new MtBT(), new MtBT());
    IBinTree testHeap5_6 = new DataBT(6, new MtBT(), new MtBT());
    IBinTree testHeap5_10 = new DataBT(10, new MtBT(),new MtBT());
    IBinTree testHeap5_3 = new DataBT(3, testHeap5_4, testHeap5_10);
    IBinTree testHeap5_5 = new DataBT(5, new MtBT(), testHeap5_6);

    IBinTree testHeap5_2 = new DataBT(2, testHeap5_3, testHeap5_5);


    IHeap heap1 = new DataHeap(1);
    IHeap heap2 = new DataHeap(-1);
    IHeap heap3 = new DataHeap(1);
    IHeap heap4 = new DataHeap(1);
    IHeap heap5 = new DataHeap(1);
    IHeap heap6 = new DataHeap(1);
    IHeap heap7 = new DataHeap(1);

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

        heap6 = heap6.addElt(1);
        heap6 = heap6.addElt(2);
        heap6 = heap6.addElt(3);
        heap6 = heap6.addElt(4);
        heap6 = heap6.addElt(5);
        heap6 = heap6.addElt(6);
        heap6 = heap6.addElt(7);
        heap6 = heap6.addElt(7);
        heap6 = heap6.addElt(10);

        heap7 = heap7.addElt(2);
        heap7 = heap7.addElt(3);
        heap7 = heap7.addElt(4);
        heap7 = heap7.addElt(5);
        heap7 = heap7.addElt(6);
        heap7 = heap7.addElt(10);
    }


    // addEltTester
    // valid heap
    // invalid heap
    // added elt wrong number of times
    // other elt wrong number of times
    // total elements is incorrect
    // empty tree
    // duplicate added value

    // valid heap
    @Test
    public void validHeap_Add() {
        assertTrue(HT.addEltTester(heap1, 10, testHeap1_1));
    }

    // invalid heap.
    @Test
    public void checkInvalidHeap_Add() {
        assertFalse(HT.addEltTester(heap1, 10, testHeap2_10));
    }

    // added elt wrong number of times
    @Test
    public void wrongTimes_Add() {
        assertFalse(HT.addEltTester(heap1, 0, testHeap3_1));
    }

    // other elt wrong number of times
    @Test
    public void otherWrongTimes_Add() {
        assertFalse(HT.addEltTester(heap6, 10, testHeap4_0));
    }
    // total elements is incorrect
    @Test
    public void totalElementsIncorrect_Add() {
        assertFalse(HT.addEltTester(heap5, 0, testHeap4_0));
    }

    // empty tree
    @Test
    public void emptyTree_Add() {
        assertTrue(HT.addEltTester(new MtHeap(), 3, new DataBT(3, new MtBT(), new MtBT())));
    }

    // duplicate added value
    @Test
    public void duplicate_Add() {
        assertTrue(HT.addEltTester(heap7, 10, testHeap1_1a));
    }



    //remMinEltTester
    // valid heap
    // invalid heap
    // remove elt wrong number of times
    // other elt wrong number of times
    // total elements is incorrect
    // empty tree

    // valid heap
    @Test
    public void validHeap_Rem() {
        assertTrue(HT.remMinEltTester(heap2, testHeap1_1));
    }

    // invalid heap
    @Test
    public void invalidHeap_Rem() {
        assertFalse(HT.remMinEltTester(heap2, testHeap2_10));
    }

    // remove elt wrong number of times
    @Test
    public void wrongTimes_Rem() {
        assertFalse(HT.remMinEltTester(heap3, testHeap1_1));
    }

    // other elt wrong number of times
    @Test
    public void otherWrongTimes_Rem() {
        assertFalse(HT.remMinEltTester(heap6, testHeap4_0));
    }

    // total elements is incorrect
    @Test
    public void totalElementsIncorrect_Rem() {
        assertFalse(HT.remMinEltTester(heap5, testHeap4_0));
    }

    // empty tree
    @Test
    public void emptyTree_Rem() {
        assertTrue(HT.remMinEltTester(new MtHeap(), new MtBT()));
    }

    // duplicate added value
    @Test
    public void duplicate_Rem() {
        assertTrue(HT.remMinEltTester(heap7, testHeap5_2));
    }
}
