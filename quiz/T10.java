package Java.java.quiz;

public class T10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?
        String [] names = {"Ali","Hasan" , "Mesut", "Test", "Ali", "Mesut", "Dursun"};

        String a="";
        for ( int j=0 ; j < names.length;j++)
        {
            a=names[j];

            for ( int i=j+1 ; i < names.length; i++)
            {
                if(a==names[i])
                {
                    System.out.println(names[i]+" is dublicated");
                }
            }

        }

    }
}
