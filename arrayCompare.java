package com.burak;
import java.lang.ArrayIndexOutOfBoundsException;
//Compare to 2 array and create a new array as a array 3
public class arrayCompare {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5};
        int array2[] = {6,7,8,4,5};


        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (array1[i]==array2[j]){
                    System.out.println("Same element : "+array1[i]);
                }

            }
        }

    }
}
