import static java.lang.Math.abs;

public class ConversionOperations {
    public static int conversionOperation(String number){
        int result;
        switch (number)
        {
            case "minusten":
                result = -10;
                break;
            case "minusnine":
                result = -9;
                break;
            case "minuseight":
                result = -8;
                break;
            case "minusseven":
                result = -7;
                break;
            case "minussix":
                result = -6;
                break;
            case "minusfive":
                result = -5;
                break;
            case "minusfour":
                result = -4;
                break;
            case "minusthree":
                result = -3;
                break;
            case "minustwo":
                result = -2;
                break;
            case "minusone":
                result = -1;
            break;
            case "null":
                result = 0;
            break;
            case "ten":
                result = 10;
            break;
            case "nine":
                result = 9;
            break;
            case "eight":
                result = 8;
            break;
            case "seven":
                result = 7;
            break;
            case "six":
                result = 6;
            break;
            case "five":
                result = 5;
            break;
            case "four":
                result = 4;
            break;
            case "three":
                result = 3;
            break;
            case "two":
                result = 2;
            break;
            case "one":
                result = 1;
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
        return result;

    }
}
