package Java.java.quiz;

public class T8 {
    public static void main(String[] args) {
        // Maximum and minimum number in the array?
        int[] number = {21, 73, 90, 41, 63, 11};
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.print("Maximum number is " + max);
        System.out.println();
        System.out.println("Minimum number is " + min);
    }
}
