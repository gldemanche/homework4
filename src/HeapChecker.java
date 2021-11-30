/**
 * Heap Checker
 * @author Gabe Demanche & Chris Chow
 */
public class HeapChecker {

    /**
     * returns if the given binary tree is a valid addition of an element to the initial heap
     * @param hOrig the original heap
     * @param elt the element being added
     * @param hAdded the resulting binary tree
     * @return true if the BT is a heap and the elements are the same with the addition of the given element
     */
    public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        return (hOrig.isHeap() && hAdded.isHeap()) &&  hOrig.validAdd(elt, hAdded) && hOrig.sameSizeAdd(hAdded);
    }

    /**
     * returns if the given binary tree is a valid heap with the min element of the original heap removed
     * @param hOrig the original heap
     * @param hRemoved the resulting binary tree
     * @return true if the resulting BT is a heap and the elements of the heaps are the same minus the minimum element that was removed
     */
    public boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
        return (hOrig.isHeap() && hRemoved.isHeap()) &&  hOrig.validRemove(hOrig.getTop(), hRemoved) && hOrig.sameSizeRemove(hRemoved);
    }
}
