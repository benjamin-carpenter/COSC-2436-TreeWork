/**
 *Description: a simple program to scan a tree that can easily be incorporated into another program for purposes
 *Class: Spring - COSC 2436.83448
 *Assignment7: NLR tree Scan
 *Date: 05/12/2019
 *@author  Ban Carpenter
 *@version 0.0.1
 */
public class Main {

    public static void main(String[] args){

    char[] aArray;
    //huge list of the test arrays
        aArray = new char[31];
        aArray[0] = 'A';
        aArray[1] = 'B';
        aArray[2] = 'D';
        aArray[4] = 'E';
        aArray[5] = 'F';
        aArray[9] = 'G';
        aArray[10] = 'H';

        char[] bArray;
        bArray = new char[7];
        bArray[0] = 'A';
        bArray[2] = 'B';

        char[] cArray;
        cArray = new char[31];
        cArray[0] = 'A';
        cArray[1] = 'B';
        cArray[3] = 'C';
        cArray[7] = 'D';

        char[] dArray;
        dArray = new char[15];
        dArray[0] = 'A';
        dArray[2] = 'B';
        dArray[6] = 'C';

        char[] eArray;
        eArray = new char[15];
        eArray[0] = 'A';
        eArray[1] = 'B';
        eArray[2] = 'C';
        eArray[3] = 'D';
        eArray[4] = 'E';
        eArray[5] = 'F';


        char[] fArray;
        fArray = new char[15];
        fArray[0] = 'A';
        fArray[1] = 'B';
        fArray[2] = 'C';
        fArray[3] = 'D';
        fArray[4] = 'E';
        fArray[5] = 'F';
        fArray[6] = 'G';

        //calling tree NLR scanner while outputing the String
        Tree aTree = new Tree(aArray);
        System.out.println(aTree.nlrScan(0));

        Tree bTree = new Tree(bArray);
        System.out.println(bTree.nlrScan(0));

        Tree cTree = new Tree(cArray);
        System.out.println(cTree.nlrScan(0));

        Tree dTree = new Tree(dArray);
        System.out.println(dTree.nlrScan(0));

        Tree eTree = new Tree(eArray);
        System.out.println(eTree.nlrScan(0));

        Tree fTree = new Tree(fArray);
        System.out.println(fTree.nlrScan(0));





    }
}
