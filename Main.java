import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = sc.nextInt();

        String strNumber = Integer.toString(number);

        System.out.println(strNumber);

        String revStrNumber = "";

        for (int i = strNumber.length() - 1; i >= 0; i--) {
            revStrNumber = revStrNumber + strNumber.charAt(i);
        }
        if(revStrNumber.equals(strNumber)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

