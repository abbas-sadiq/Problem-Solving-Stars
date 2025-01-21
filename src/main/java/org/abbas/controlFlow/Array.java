package org.abbas.controlFlow;


public class Array {
    public static void main(String[] args) {

        int number = 123456789;
        int[] expectedArray = new int[]{1,2,3,4,5,6,7,8,9};
        int[] numberArray = split(number);
        int count = count(number);
        System.out.println("input " + number);
        int[] split = split(number);

        System.out.println("output :" + split(number));
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
        number = 123456789;
        int[] ars = new int[number];
        for(int i = 0; i < number; i++){
            ars[i] = number % 10;
            number /= 10;

        }
        return ars;
    }

    public static int count(int number){

        return number;
    }


}

