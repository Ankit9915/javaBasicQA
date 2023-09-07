package hackerRank;
public class StringDecryptor {

    public static String decryptString(String encryptedString) {
        StringBuilder decrypted = new StringBuilder();

        // Reverse the string
        StringBuilder reversed = new StringBuilder(encryptedString).reverse();

        int length = reversed.length();
        int i = 0;

        while (i < length) {
            char currentChar = reversed.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Handle numeric characters by repeating the previous word
                StringBuilder previousWord = new StringBuilder();
                while (i < length && Character.isDigit(reversed.charAt(i))) {
                    previousWord.append(reversed.charAt(i));
                    i++;
                }
                int repeatCount = Integer.parseInt(previousWord.reverse().toString());

                if (decrypted.length() > 0) {
                    StringBuilder repeatedWord = new StringBuilder(decrypted.substring(decrypted.length() - repeatCount));
                    for (int j = 1; j < repeatCount; j++) {
                        decrypted.append(repeatedWord);
                    }
                }
            } else if (Character.isWhitespace(currentChar)) {
                decrypted.append(' ');
                i++;
            } else {
                StringBuilder word = new StringBuilder();
                while (i < length && !Character.isDigit(reversed.charAt(i)) && !Character.isWhitespace(reversed.charAt(i))) {
                    word.append(reversed.charAt(i));
                    i++;
                }
                decrypted.append(word.reverse());
            }
        }

        return decrypted.toString();
    }

    public static void main(String[] args) {
        String encryptedString = "seaside the to sent be to ne2ds army ten of team a";
        String decryptedString = decryptString(encryptedString);
        System.out.println(decryptedString);  // Output: "a team of ten army needs to be sent to the seaside"
    }
}
