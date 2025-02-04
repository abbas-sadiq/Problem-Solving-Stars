package org.abbas.controlFlow;


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int number = 123456789;
        int[] expectedArray = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("input " + number);
        int[] splitArray = split(number);
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println();

        }

        System.out.println("output :" + Arrays.toString(splitArray));
        splitEventNumbers(expectedArray);
        splitOddNumbers(expectedArray);


    }

    private static void splitEventNumbers(int[] expectedArray) {
        System.out.println("Event Numbers");
        for (int i : expectedArray) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }
    }

    private static void splitOddNumbers(int[] expectedArray) {
        System.out.println("Odd Numbers");
        for (int i : expectedArray) {
            if(i %2 !=0) {
                System.out.println(i);
            }
        }
    }

    public static int[] split(int number){

        int[] splitArray = new int[]{number};
        while(number < 0){
            int a= number % 10;
            System.out.println(a);
            number = number / 10;

        }

        return splitArray;
    }

    public static int count(int number){

        return number;
    }


}

