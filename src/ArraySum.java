public class ArraySum {

    public int sumOfArray(Integer[] a, int index)
    {

        //Base case if the index is -1 so it starts at 0 index
        if(index==-1){
            return 0;
        }

        else{
            return a[index] + sumOfArray(a, index -1);
        }
    }
}
