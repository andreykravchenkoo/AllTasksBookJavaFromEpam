package Task11.project;

import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        TextService textService = (text) -> {
            String[] arrayText = text.toLowerCase(Locale.ROOT).trim().split("\\.");

            for (int i = 0; i < arrayText.length; i++) {
                    int countVowel = arrayText[i].replaceAll("[^aeiouyw]", "").length();
                    int countConsonant = arrayText[i].replaceAll("[^bcdfgjklmnpqstvxzhrwy]", "").length();

                    String result = new String();

                    if (countVowel > countConsonant) {
                        result = "Count vowel more";
                    } else {
                        result = "Count consonant more";
                    }

                System.out.println("Sentence: " + arrayText[i] + " count vowel: " + countVowel + ", count consonant: " + countConsonant + ", " + result);
            }
        };

        String text = "In English, these letters are B, C, D, F, G, J, K, L, M, N, P, Q, S, T, V, X, Z and often H, R, W, Y. In English orthography, the letters H, R, W, Y and the digraph GH are used for both consonants and vowels.";

        textService.countVowelConsonant(text);
    }
}

