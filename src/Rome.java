public class Rome {

    public static boolean isRome(String[] numbers) throws Exception {
        boolean firstRoman = false;
        boolean secondRoman = false;
        String[] romanNumbers = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int num1;
        int num2;

        for (int nLength = 0; nLength <= numbers.length; nLength++) {
            for (int rnLength = 0; rnLength < romanNumbers.length; rnLength++) {
                if (numbers[0].equals(romanNumbers[rnLength]) && nLength == 0) {
                    firstRoman = true;
                }
                if (numbers[1].equals(romanNumbers[rnLength]) && nLength == 1) {
                    secondRoman = true;

                }
            }

        }
        if (firstRoman && secondRoman) {
            return true;
        } else if (firstRoman && !secondRoman || !firstRoman && secondRoman)
            throw new Exception("Оба числа должны быть одного формата");
        return false;
    }


    public static int firstToArabic(String[] numbers) {
        String[] romanNumbers = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int rnLength = 0; rnLength < romanNumbers.length; rnLength++) {
            if (numbers[0].equals(romanNumbers[rnLength])) {
                return rnLength;

            }
        }
        return 0;
    }
    public static int secondToArabic(String[] numbers){
        String[] romanNumbers = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int rnLength = 0; rnLength < romanNumbers.length; rnLength++) {
            if (numbers[1].equals(romanNumbers[rnLength])) {
                return rnLength;
            }
        }
        return 0;
    }
    public static String ArabicToRome(int result){
        String answer = null;
        String[] romanNumbers = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XXXXI", "XXXXII", "XXXXIII", "XXXXIV", "XXXXV", "XXXXVI", "XXXXVII", "XXXXVIII", "XXXXIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        answer = romanNumbers[result];
        return answer;
    }
}