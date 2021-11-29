import org.junit.Test;
import static org.junit.Assert.*;

class Examples {

    Examples(){}

    HeapChecker HT = new HeapChecker();

    ...

    @Test
    public void test3(){
        assertTrue(HT.addEltTester(myHeap, 5, myBinTree));
    }
}