public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    //System.out.println("TLV : " + lowerCase("TLV"));
    //System.out.println(contains("personality", "son"));

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
       for (int i = 0; i< sentences.length; i++){

            for (int j = 0; j< keywords.length; j++){
                keywords[j] = lowerCase(keywords[j]);
            if (contains(lowerCase(sentences[i]), keywords[j])){
                System.out.println(sentences[i]);
                break;
            }
       }
    }
}
    public static String lowerCase(String str) {
        String clean = "";
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        if (c >= 'A' && c <= 'Z') c = (char)(c - 'A' + 'a');
        clean += c;
    }
    return clean;
    }

    public static boolean contains(String str1, String str2) {
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);

        // Handle empty substring
        if (str2.length() == 0) return true;
        if (str2.length() > str1.length()) return false;
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

