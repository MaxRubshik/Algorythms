package Lafore.BubbleSort;



/**
 Bubble sort realizing.
 */


class ArrayBub {
    private int[] a;                                         // Link to array
    private int nElems;                                //Quantity of elements

//---------------------------------------------------------------------------

    public ArrayBub(int max) {                                  //Constructor
        a = new int[max];
        nElems = 0;                                           //Now no arrays
    }
//---------------------------------------------------------------------------

    public void insert(int value) {
        a[nElems] = value;                                       // Inserting
        nElems++;                                                    //Size +
    }

    //-----------------------------------------------------------------------
    public void display() {
        for (int i = 0; i < nElems; i++)                          // For each
            System.out.print(a[i] + " ");
        System.out.println();
    }

    //---------------------------------------------------------------------------
    public void bubbleSort() {
        int in, out;
        for (out = nElems - 1; out > 0; out--)             //Outer cycle back
            for (in = 0; in < out; in++)               //Inner cycle straight
                if (a[in] > a[in + 1])                        //Order broken?
                    swap(in, in + 1);                    //Change places
    }
    //---------------------------------------------------------------------------
    public void bubbleSortTwoInCycles() {
        int inLeft, inRight, out;
        for (out = nElems - 1; out > 0; out--)             //Outer cycle back
            for (inLeft = 0; inLeft < out; inLeft++)               //Inner cycle straight
                if (a[inLeft] > a[inLeft + 1])                        //Order broken?
                    swap(inLeft, inLeft + 1);                    //Change places
        for (inRight = nElems -1; inRight > 0; inRight--)
            if(a[inRight] < a[inRight-1])
                swap(inRight, inRight -1);
    }
//---------------------------------------------------------------------------

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
/////////////////////////////////////////////////////////////////////////////
