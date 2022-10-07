package bai3;

public class FizzBuzz {
    private FizzBuzz() {
        throw new IllegalStateException("FizzBuzz class");
    }

    public static String translate(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }
        if (isFizz(number)) {
            return "Fizz";
        }
        if (isBuzz(number)) {
            return "Buzz";
        }
        return numberInteger(number);
    }

    private static String numberInteger(int number) {
        String numberInteger = "";
        int unit = number % 10; // hàng đơn vị
        int tens = (number % 100) / 10; //hàng chục

        if (number > 10) {
            switch (tens) {
                case 1:
                    numberInteger += "Muoi";
                    break;
                case 2:
                    numberInteger += "Hai";
                    break;
                case 3:
                    numberInteger += "Ba";
                    break;
                case 4:
                    numberInteger += "Bon";
                    break;
                case 5:
                    numberInteger += "Nam";
                    break;
                case 6:
                    numberInteger += "Sau";
                    break;
                case 7:
                    numberInteger += "Bay";
                    break;
                case 8:
                    numberInteger += "Tam";
                    break;
                case 9:
                    numberInteger += "Chin";
                    break;
                default:
                    numberInteger = String.valueOf(number);
            }
        }
        switch (unit) {
            case 1:
                numberInteger += "Muoi";
                break;
            case 2:
                numberInteger += "Hai";
                break;
            case 3:
                numberInteger += "Ba";
                break;
            case 4:
                numberInteger += "Bon";
                break;
            case 5:
                numberInteger += "Nam";
                break;
            case 6:
                numberInteger += "Sau";
                break;
            case 7:
                numberInteger += "Bay";
                break;
            case 8:
                numberInteger += "Tam";
                break;
            case 9:
                numberInteger += "Chin";
                break;
            default:
                numberInteger = String.valueOf(number);
        }
        return numberInteger;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
