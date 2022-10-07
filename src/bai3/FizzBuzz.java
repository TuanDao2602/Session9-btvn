package bai3;

public class FizzBuzz {
    public static String translate(int number) {
        if (isFizz(number) && isBuzz(number)){
            return "FizzBuzz";
        }
        if(isFizz(number)){
            return "Fizz";
        }
        if (isBuzz(number)){
            return "Buzz";
        }
        return numberInteger(number);
    }

    private static boolean isFizz(int number) {
    }
