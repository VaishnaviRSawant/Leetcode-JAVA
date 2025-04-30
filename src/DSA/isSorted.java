package DSA;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,4,55,6};
        System.out.println(Sorted(arr,0));
    }

    static boolean Sorted(int[] arr , int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && Sorted(arr,index+1);
    }
}
