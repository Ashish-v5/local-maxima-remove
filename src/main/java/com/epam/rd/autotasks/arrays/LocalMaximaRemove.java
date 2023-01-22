package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int n = array.length;
        int[] result = new int[n];
        int j=0;
        for (int i=0;i<n-1;i++,j++){
            if(array[i]>array[i+1]){
                result[j]=array[++i];
            }else{
                result[j]=array[i];
            }
        }
        return Arrays.copyOf(result,j);
    }
}
