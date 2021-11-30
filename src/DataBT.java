/**
 * DataBT
 * @author Gabe Demanche & Chris Chow
 */
class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;
    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }
    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }
    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }
    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }


    /**
     * checks if the binary tree is empty
     * @return false since a DataBT cannot be empty
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * checks if a given element is a valid root of a heap
     * @param elt the element you check against
     * @return if the data is greater than the element
     */
    public boolean validRoot(int elt) {
        return this.data>= elt;
    }

    /**
     * recursively checks if a binary tree is a valid heap
     * @return true if the heap has empty subtrees, or if the BT meets the min-heap requirement of each tree
     * containing larger values than the root, then recursively repeat on the subtrees
     */
    public boolean isHeap(){
        if(this.left.isEmpty() && this.right.isEmpty()){
            return true;
        }
        else return this.left.validRoot(this.data) && this.right.validRoot(this.data) &&
                this.left.isHeap() && this.right.isHeap();

    }

    /**
     * recursively counts how many times a value appears in a BT
     * @param aVal the desired value
     * @return if the value is the BTs root, then recursively repeats on the subtrees until empty
     */
    public int countOccurrences(int aVal) {
        if(aVal == data){
            return 1 + left.countOccurrences(aVal) + right.countOccurrences(aVal);
        }
        else{
            return left.countOccurrences(aVal) + right.countOccurrences(aVal);
        }
    }

    /**
     * checks if an element was validly added to a BT
     * @param added the number added
     * @param otherTree the tree with the added variable
     * @return if the number of occurrences of each element in the initial tree matches the resulting tree plus the number
     * added to that tree, recursively repeats on every element in the tree
     */
    public boolean validAdd(int added, IBinTree otherTree) {
        if(this.data == added && otherTree.countOccurrences(this.data) != (this.countOccurrences(this.data) +1)) {
            return false;
        }
        else {
            return (this.countOccurrences(this.data) == otherTree.countOccurrences(this.data)) &&
                    left.validAdd(added, otherTree) && right.validAdd(added, otherTree);
        }
    }

    /**
     * checks the resulting subtrees after a recursive call on a removed tree to account of multiple of the same variable
     * @param removed the element removed
     * @param otherTree the resulting tree after the minremove
     * @return if the number of occurrences of each element matches in the two trees, then recursively calls the two
     * subtrees
     */
    public boolean validRemoveAfter(int removed, IBinTree otherTree){
        if(this.data == removed && this.countOccurrences(this.data) != otherTree.countOccurrences(this.data)){
            return false;
        }
        else if(this.data == removed){
            return (this.countOccurrences(this.data) == otherTree.countOccurrences(this.data)) &&
                    left.validRemoveAfter(removed, otherTree) && right.validRemoveAfter(removed, otherTree);
        }
        else{
            return (this.countOccurrences(this.data) == otherTree.countOccurrences(this.data)) &&
                    left.validRemove(removed, otherTree) && right.validRemove(removed, otherTree);
        }
    }

    /**
     * checks if the resulting tree contains all the same elements as the original tree minus the minimum element
     * removed
     * @param removed the min element removed
     * @param otherTree the resulting BT
     * @return if the tree contains the correct number of occurrences of each original element with the min Element
     * appearing one less time since it was removed, then recursively calling this on the subtrees
     */
    public boolean validRemove(int removed, IBinTree otherTree) {
        if(this.data == removed && this.countOccurrences(this.data) != otherTree.countOccurrences(this.data) +1){
            return false;
        }
        else if(this.data == removed){
            return (this.countOccurrences(this.data) == otherTree.countOccurrences(this.data) +1) &&
                    left.validRemoveAfter(removed, otherTree) && right.validRemoveAfter(removed, otherTree);
        }
        else{
            return (this.countOccurrences(this.data) == otherTree.countOccurrences(this.data)) &&
                    left.validRemove(removed, otherTree) && right.validRemove(removed, otherTree);
        }
    }

    /**
     * checks if the resulting tree is one element larger than the original since an element was added
     * @param otherTree the resulting tree
     * @return if the resulting tree is the same size of the original plus one
     */
    public boolean sameSizeAdd(IBinTree otherTree) {
        return otherTree.size() == this.size() +1;
    }

    /**
     * checks if the resulting tree is one element smaller than the original since the min was removed
     * @param otherTree the resulting tree
     * @return if the resulting tree is the same size of the original minus one
     */
    public boolean sameSizeRemove(IBinTree otherTree){
        return otherTree.size() == this.size() -1;
    }

    /**
     * gets the root of a binary tree
     * @return the root of the BT
     */
    public int getTop() {
        return this.data;
    }
}