package ru.itpark;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class People {

    private FileInputStream input;

    private String str = null;
    private byte bytes[];
    private int spaceMark = 0;
    private int countAges = 0;
    private int coevalsCount = 0;
    private int countRows = 0;
    private String inputName;
    private int age = 0;
    public People(String inputName){
        this.inputName = inputName;
        try {
            input = new FileInputStream(inputName);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        try {
            bytes = new byte[input.available()];
            input.read(bytes);
            str = new String(bytes, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void coevals() {
        char chars[] = str.toCharArray();
        for(int i = 0; i< chars.length;i++){
            if(chars[i]=='\r'){
                countRows++;
            }
        }


        int[] ages = new int[countRows+1];
//        String[] names = new String[countRows];

        for (int i = 0; i<chars.length; i++) {
            if (chars[i] == ' ') {
                spaceMark = i;
            } else if(chars[i] == '\r') {
                for (int j = spaceMark + 1; j < i; j++){
                    age *=10;
                    age += (- 48 + (int)chars[j]);
                }
                ages[countAges] = age;
                countAges++;
                age = 0;
            }
        }
        for(int i = 0; i<countAges;i++) {
            int min = i;
            for (int j = i; j < countAges; j++) {
                if(ages[min] > ages[j]) {
                    min = j;
                }
            }
            int temp = ages[i];
            ages[i] = ages[min];
            ages[min] = temp;
        }
        for (int i = 0; i <countAges;i++) {
            coevalsCount++;
            if (ages[i] < ages[i+1] | i==countAges-1) {
                System.out.println("Количество людей "+ ages[i] + " лет: "+ (coevalsCount) );
                coevalsCount=0;
            }
        }
    }
}



