import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> s = new HashMap<>();
        s.put('I', 1);
        s.put('V', 5);
        s.put('X', 10);
        s.put('L', 50);
        s.put('C', 100);
        s.put('D', 500);
        s.put('M', 1000);

        String romanNumber = "CM";
        int arabicNumber = 0;

        if (!validate(romanNumber,s)) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < romanNumber.length() - 1; i++) {

            Character currentSymbol = (romanNumber.charAt(i));

            Character nextSymbol = (romanNumber.charAt(i + 1));

            if (s.get(currentSymbol) < s.get(nextSymbol)) {
                arabicNumber = arabicNumber - s.get(currentSymbol);
            } else {
                arabicNumber = arabicNumber + s.get(currentSymbol);
            }

        }

        arabicNumber = arabicNumber + s.get((romanNumber.charAt(romanNumber.length() - 1)));

        System.out.println(romanNumber + " = " + arabicNumber);
    }

    private static boolean validate(String romanNumber,Map<Character, Integer> s) {
        if (romanNumber == null || romanNumber.isBlank()) {
            return false;
        }
        for (int i = 0; i < romanNumber.length(); i++) {
            if(s.get(romanNumber.charAt(i)) == null) {
                return false;
            }
        }
        return true;
    }
}

