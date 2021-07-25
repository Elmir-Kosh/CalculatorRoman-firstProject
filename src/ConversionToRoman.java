import static java.lang.Math.abs;

public class ConversionToRoman {

    public static String conversionToRoman (double result){
        //todo подход имеет место быть, но сложно расширяемый. Лучше выводить римские числа, а не хранить все варианты(будет страшно делать калькулятор на 1000 чисел)
        String[] RomanNumbers= new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII","XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LII", "LIV", "LV", "LVI", "LVII", "LVII", "LVIII", "LVIX", "LX",
                "LXI", "LXII", "LXII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String RomanAnswer;
        if (result % 1 == 0) { //todo не понял для чего этот if (он же всегда будет true)
            if (result < 0) {
        RomanAnswer = "minus  " + RomanNumbers[abs((int) result)];}
            else RomanAnswer = RomanNumbers[(int) result];}
        else if(result >= 0)
        {
            RomanAnswer = Integer.toString((int) result); //todo вместо toString() обычно используют valueOf()
        }
        else {
            RomanAnswer = "округленное значение = " + (int) result;
        }
        return RomanAnswer;

    }
}
