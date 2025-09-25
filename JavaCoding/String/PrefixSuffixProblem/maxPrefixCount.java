package JavaCoding.String.PrefixSuffixProblem;

public class maxPrefixCount {

    public static void main(String[] args) {

        String str = "ababbab";
        System.out.println("Max Prefix String is " + MaxOccurringPrefix(str));

    }

    public static String MaxOccurringPrefix(String str) {
        int len = str.length();
        String maxPrefix = "";
        int maxCount = 0;

        for (int i = 1; i <= len; i++) {
            String prefix = str.substring(0, i);
            int count = countOccurrences(str, prefix);

            if (count > maxCount) {
                maxCount = count;
                maxPrefix = prefix;
            }
        }

        System.out.println("Occurrence Count: " + maxCount);
        return maxPrefix;
    }

    private static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += 1; // to handle overlapping substrings
        }

        return count;
    }

}
