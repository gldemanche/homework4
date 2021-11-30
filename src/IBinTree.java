import java.lang.Math;
import java.util.LinkedList;

interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();

    boolean isHeap();

    boolean isEmpty();

    boolean validRoot(int elt);

    int countOccurrences(int aVal);

    boolean validAdd(int added, IBinTree otherTree);

    boolean validRemove(int removed, IBinTree otherTree);

    boolean validRemoveAfter(int removed, IBinTree otherTree);

    boolean sameSizeAdd(IBinTree otherTree);

    boolean sameSizeRemove(IBinTree otherTree);

    int getTop();




}

