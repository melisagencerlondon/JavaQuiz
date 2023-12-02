package Java.java.quiz;

public class T3 {
    public static void main(String[] args) {
//Create a 2D array or integer type where you will store odd and even
//numbers. Develop a program which will identify/print the even numbers
//only.
        int [][] num={
                {20,45,60,11,33},
                {3,7,11,72,80},

        };
        for (int i=0;i<num.length;i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j]+" ");
                }
            }
        }}}