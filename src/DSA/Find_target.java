package DSA;

import java.util.ArrayList;

public class Find_target {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7};
        System.out.println(Find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        findAllIndices(arr,4,0, new ArrayList<>());
        System.out.println(indices);
    }

    static boolean Find(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || Find(arr, target, index + 1);
    }


    static int findIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> indices = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            indices.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> indices){

        if(arr[index]== arr.length){
            return indices;
        }
        if(arr[index]==target){
            indices.add(index);
        }
        return findAllIndices(arr, target, index+1,indices);
    }
}
