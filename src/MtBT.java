import java.util.LinkedList;

class MtBT implements IBinTree {
    MtBT(){}
    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }
    // returns 0 since enpty tree has no elements
    public int size() {
        return 0;
    }
    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    public boolean isHeap() {
        return true;
    }


    public boolean isEmpty(){
        return true;
    }

    public boolean validRoot(int elt) {
        return true;
    }

    public int countOccurrences(int aVal) {
        return 0;
    }

    public boolean validAdd(int added, IBinTree otherTree) {
        return true;
    }

    public boolean validRemove(int removed, IBinTree otherTree) {
        return true;
    }
    public boolean validRemoveAfter(int removed, IBinTree otherTree) {
        return true;
    }
    public boolean sameSizeAdd(IBinTree otherTree) {
        return true;
    }

    public boolean sameSizeRemove(IBinTree otherTree) {
        return true;
    }

    public int getTop() {
        return 0;
    }
}