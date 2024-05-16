public class Main {
    public static void main(String[] args) {
        String haystack = "saqbutsad";
        String needle = "sad";
        System.out.println(getIndex(haystack, needle));
    }

    private static int getIndex(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String checkNeedle = haystack.substring(i, i + needle.length());
                if (checkNeedle.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
