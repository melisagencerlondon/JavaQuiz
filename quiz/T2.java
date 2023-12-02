package Java.java.quiz;

public class T2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is created, calculate the
        //sum of all stored elements in that array.
        int[] numbers={10,20,34,56,78,56};
        //int sum=0;
        //for (int i=0;i<numbers.length;i++){
            //sum=sum+numbers[i];
            //System.out.println(i);
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            sum = sum + numbers[row];

        }
        System.out.println(sum);
        }

        }
    

