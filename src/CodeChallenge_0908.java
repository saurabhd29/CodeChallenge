/*
Given an integer array, sort it using the merge sort algorithm.
*/

import java.util.Arrays;

public class CodeChallenge_0908 {
    static int[] a ={9,2,5,6,2,4,1};
    static void mergesort( int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergesort(start,mid);
            mergesort(mid+1,end);
            merger(start,mid,end);
        }
    }

    static void merger(int start,int mid,int end){

        int temp[]=new int[a.length];
        int i,j,index;
        i=index=start;
        j=mid+1;
        while(i<=mid && j<=end)
        {
            if(a[i]<a[j])
                temp[index++]=a[i++];
            else
                temp[index++]=a[j++];
        }
        while(i<=mid)
            temp[index++]=a[i++];
        while(j<=end)
            temp[index++]=a[j++];

        for (i=start;i<=end;i++)
            a[i]=temp[i];

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        mergesort(0, a.length-1);
        System.out.println("Sorted : "+Arrays.toString(a));
    }

}
