public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String clean = "";
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        if (c >= 'A' && c <= 'Z') c = (char)(c - 'A' + 'a');
        clean += c;
    }
    return clean;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
    str1 = lowerCase(str1);
    str2 = lowerCase(str2);

    // Handle empty substring
    if (str2.length() == 0) return true;

    char first = str2.charAt(0);
    int pos = str1.indexOf(first);

    while (pos != -1) {
        int counter = 0;
        for (int i = pos; i < pos + str2.length(); i++) {
            if (i >= str1.length()) break;
            if (str1.charAt(i) == str2.charAt(counter)) {
                counter++;
            } else {
                counter = 0;
                break;
            }
            if (counter == str2.length()) {
                return true;
            }
        }
        pos = str1.indexOf(first, pos + 1);
    }
    return false;
}
}
