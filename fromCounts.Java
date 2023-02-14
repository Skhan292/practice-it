//Write a method called fromCounts that constructs and returns a new ArrayIntList of values given an existing ArrayIntList of counts. Assume that the ArrayIntList that is passed as a parameter stores a sequence of integer pairs that each indicate a count and a number. For example, suppose that an ArrayIntList called list stores [5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17]. We will interpret this sequence of pairs to mean that you have 5 occurrences of 2, followed by two occurrences of -5 followed by 4 occurrences of 3, and so on. So the call of:
//
//            ArrayIntList list2 = list.fromCounts();
//            
//should cause the variable list2 to store [2, 2, 2, 2, 2, -5, -5, 3, 3, 3, 3, 4, 4, 1, 0, 17, 17].
//
//Assume you are adding to the ArrayIntList class with following fields:
//
//public class ArrayIntList {
//    private int[] elementData;
//    private int size;
//
//  // your code goes here
//}
//Type Solution Here:


public ArrayIntList fromCounts()
{

        int newsize = 0;
        for(int i = 0; i < elementData.length; i = i + 2)
        {
            newsize = newsize + elementData[i];
        }
        int k = 0;
        int[] arr = new int[newsize];    // arr is created, but initialized to all zeroes.  Next we fill it out with input array
        for(int i = 0; i < elementData.length; i = i + 2)
        {
            int Count = elementData[i];
            int Value = elementData[i + 1];
            for(int j = 0; j < Count; j++)
            {
                arr[k] = Value;
                k++;
            }
        }
        ArrayIntList list2 = new ArrayIntList(arr);
        return list2;
}
