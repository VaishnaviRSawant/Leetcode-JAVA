package com.Array;

import java.util.ArrayList;

public class useArrayList {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,5,7};

        ArrayList<Integer> ans = findAllIndices(arr,0,4,new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList findAllIndices(int[] arr , int index, int target, ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAllIndices(arr,index+1,target,list);
    }
}
