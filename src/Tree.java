public class Tree {

    private char _array[];
    /*Method initializes Tree
     * @param char array[]
     * @return nothing
     * @throws Nothing is implemented
     * O(n)=c
     */
    public Tree(char array[]) {
        _array = array;

    }
    /*Method method for scanning every node of a tree using a recursive (node left right) scan
     * @param int index of the node to start at
     * @return String a list of the char stored in hte nodes on the tree in order they are searched
     * @throws Nothing is implemented
     * O(n)=n
     */
    public String nlrScan(int p){
        String returnString="";
        returnString  +=  _array[p];
        if (_array[(2*p)+1] != '\0'){
            returnString += nlrScan((2*p)+1);

        }
        if (_array[(2*p)+2] != '\0'){
            returnString += nlrScan((2*p)+2);
        }
        return returnString;
    }
}
