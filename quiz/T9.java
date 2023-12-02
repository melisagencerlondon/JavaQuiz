package Java.java.quiz;

public class T9 {
    public static void main(String[] args) {
        int[] number = {21, 73, 90, 41, 63, 11};

        int largestNumber = 0;
        int secondLargest = 0;

        for (int i = 0; i < number.length; i++)
        {
            if(number[i] > largestNumber)
            {
                secondLargest = largestNumber;
                largestNumber = number[i];
            }
        }

        System.out.print("Largest number is " +largestNumber);
        System.out.print("Largest number is " +secondLargest);
    }
}