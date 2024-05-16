public class Main {
    public static void main(String[] args) {

        String prefix = "";

        String[] words = {"abcdefg", "abcdefgh", "abcd", "abcde", "abcdefghi"};

        if (!validate(words)) {
            System.out.println("Blank words are not allowed.");
            return;
        }

        int min = getMin(words);

        prefix = getPrefix(min, words, prefix);

        System.out.println(prefix);
    }

    private static boolean validate(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (words[i].isBlank()) {
                return false;
            }
        }
        return true;
    }

    private static int getMin(String[] words) {

        int min = words[0].length();
        for (int j = 1; j <= words.length - 1; j++) {
            if (words[j].length() < min) {
                min = words[j].length();
            }
        }
        return min;
    }

    private static String getPrefix(int min, String[] words, String prefix) {

        int counter = 1;

        for (int i = 0; i < min; i++) {

            for (int j = 1; j < words.length; j++) {

                if (words[0].charAt(i) == words[j].charAt(i)) {
                    counter = counter + 1;
                    if (counter == words.length) {
                        prefix = prefix + words[0].charAt(i);
                    }
                } else {
                    counter = 0;
                    break;
                }
            }

            if (counter == 0) {
                break;
            } else {
                counter = 1;
            }

        }

        return prefix;
    }

}
