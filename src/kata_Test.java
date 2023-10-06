import java.util.Scanner;
import java.lang.Exception;
import java.lang.String;

class kata_Test {

    public static String calc() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение.");
        String input = scanner.nextLine();
        int num1 = 0;
        int num2 = 0;
        String answer = null;
        int result = 0;


        String[] numbers = input.split("[+\\-*/]");
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = numbers[i].trim();
        }
        if (numbers.length != 2) throw new Exception("Должно быть два числа.");
        boolean isRoman = Rome.isRome(numbers);
        String oper = kata_Test.findoperation(input);
        if (isRoman) {
            num1 = Rome.firstToArabic(numbers);
            num2 = Rome.secondToArabic(numbers);
            if(num1 > 10 || num2 > 10) throw new Exception("Числа не должны быть больше 10.");
            if (oper.equals("+")){
                result = num1 + num2;
            }
            else if (oper.equals("-")){
                if (num1 > num2) throw new Exception("Ответ не может быть меньше 0");
                result = num1 - num2;
            }
            else if (oper.equals("*")){
                result = num1 * num2;
            }
            else if (oper.equals("/")){
                result = num1 / num2;
            }
            return Rome.ArabicToRome(result);
        }
        else {
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            if (oper.equals("+")){
                result = num1 + num2;
            }
            else if (oper.equals("-")){
                result = num1 - num2;
            }
            else if (oper.equals("*")){
                result = num1 * num2;
            }
            else if (oper.equals("/")){
                result = num1 / num2;
            }
            return "" + result;
        }
    }

    private static String findoperation(String input) {
        if (input.contains("+")) {
            return "+";
        } else if (input.contains("-")) {
            return "-";
        } else if (input.contains("*")) {
            return "*";
        } else if (input.contains("/")) {
            return "/";
        }
        return "";
    }
}
