package Java.java.quiz;

public class T4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate the
        //sum of even and odd numbers for that array
        int [][] num={
                {20,45,60,11,33},
                {3,7,11,72,80},

        };
        for (int i=0;i<num.length;i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 != 0) {
                    System.out.print(num[i][j]+" ");
                }
            }
        }}}
