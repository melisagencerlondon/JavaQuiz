package Java.java.quiz;

public class T1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.
        //int[] temp = {10, 40, 30, 20, 39, 5, 9};
      //for (int i = 0; i < temp.length; i++) {
           // if (temp[i]>highesttemp)
           // for (j = 0; j < temp[i].length; j++) {
              //  System.out.print(temp[i][j] + " ");
        int[] temp = {21, 32, 9, 19, 23, 11,5};
        int max = temp[0];
        int min = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        System.out.print("Maximum temperature  is " + max);
        System.out.println();
        System.out.println("Minimum temperature is " + min);
    }
}


