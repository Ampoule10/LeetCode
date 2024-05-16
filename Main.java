import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Character, Character> s = new HashMap<>();
        s.put('(', ')');
        s.put('{', '}');
        s.put('[', ']');
        s.put(')', ')');
        s.put('}', '}');
        s.put(']', ']');

        String word = "()[]}{";

        if(!validate(word,s)){
            System.out.println("Invalid input");
            return;
        }

        boolean x = checkBrackets(word,s);
        System.out.println(x);

    }

    private static boolean validate(String word, Map<Character, Character> s) {
        if(word.isBlank()){
            return false;
        }
        for(int i = 0; i < word.length(); i++){
            if(s.get(word.charAt(i)) == null){
                return false;
            }
        }
        return true;
    }

    private static boolean checkBrackets(String word,Map<Character, Character> s){
        for(int i = 0; i < word.length()-1; i++) {
            if(s.get(word.charAt(i)) == word.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }
}
