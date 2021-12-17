import java.util.Scanner;

public class AlmostPalindrome {


    public static boolean checkAlmostPalindrome(String str){

        int count = 0;
        for (int i=0, j= str.length()-1; i<j && count<2; i++, j--){
            if (str.charAt(i) != str.charAt(j)){
                count ++;
            }
        }
        return count ==1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");

        String str = in.nextLine();

        if (checkAlmostPalindrome(str))

            System.out.println("True");
        else
            System.out.println("False");

    }

}
