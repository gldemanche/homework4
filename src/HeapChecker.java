public class HeapChecker {
    boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        return (hOrig.isHeap() && hAdded.isHeap()) &&  hOrig.validAdd(elt, hAdded) && hOrig.sameSizeAdd(hAdded);
    }

    boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
        return (hOrig.isHeap() && hRemoved.isHeap()) &&  hOrig.validRemove(hOrig.getTop(), hRemoved) && hOrig.sameSizeRemove(hRemoved);
    }
}
