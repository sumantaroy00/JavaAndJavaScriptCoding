package JavaCoding.DSA.TwoPointer;

public class validWordAbbrebiation {

    public static void main(String[] args) {

       String word = "international";
       String abbr = "i9l";

int i = 0, j = 0;

while (i < word.length() && j < abbr.length()) {

    if (Character.isDigit(abbr.charAt(j))) {

        if (abbr.charAt(j) == '0') {
            System.out.println("not valid");
            return;
        }

        int num = 0;
        while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
            num = num * 10 + (abbr.charAt(j) - '0');
            j++;
        }

        i = i + num;

    } else {

        if (i >= word.length() || word.charAt(i) != abbr.charAt(j)) {
            System.out.println("not valid");
            return;
        }

        i++;
        j++;
    }
}
    }
    
}
