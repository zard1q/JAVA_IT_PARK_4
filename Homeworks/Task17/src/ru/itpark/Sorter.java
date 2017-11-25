package ru.itpark;

public  class Sorter {
    static int[] mergeSort(int array[]) {
        int[] helpArray = new int[array.length];
        for(int i = 0; i<helpArray.length;i++) {
            helpArray[i] = array[i];
        }
        int j = 0;
        int k = array.length/2;
        for(int i= 0;i<array.length;i++) {
            if (j >= array.length/2) {
                array[i] = helpArray[k++];

            } else if (k >= array.length) {
                array[i] = helpArray[j++];
            } else {
                if (helpArray[j] < helpArray[k]) {
                    array[i] = helpArray[j];
                    j++;
                } else {
                    array[i] = helpArray[k];
                    k++;
                }
            }
        }
        return array;
        }
    static int[] sort(int array[]) {
        int array1[] = new int[array.length/2];
        int array2[] = new int[array.length/2+1];
        for(int i = 0;i < array.length/2; i++) {
            array1[i] = array[i];
            array2[i] = array[i+array.length/2];
        }
        array2[array.length/2] = array[array.length-1];

        if (array1.length>2) {
            sort(array1);
        } else {
            mergeSort(array1);
        }
        if (array2.length>2) {
            sort(array2);
        } else {
            mergeSort(array2);
        }
        for(int i = 0; i<array.length/2; i++) {
            array[i] = array1[i];
            array[i+array.length/2] = array2[i];
        }
        array[array.length-1] = array2[array.length/2];
        mergeSort(array);

        return array;
    }

}
