import org.jetbrains.annotations.NotNull;

public class ArithmeticOperations {
private static double result;
    public static double arithmeticOperation(String firstNumber, String secondNumber, @NotNull String operation)
    {
    if (operation.equalsIgnoreCase("+")) {//todo аналогично, зачем игноркейс для знака?
        result = ConversionOperations.conversionOperation(firstNumber) * 1.0 + ConversionOperations.conversionOperation(secondNumber); //todo *1.0 для конвертации в дабл?) оригинально, но есть встроенные методы более явные
    }
    else if (operation.equalsIgnoreCase("-")) {
        result = ConversionOperations.conversionOperation(firstNumber) * 1.0 - ConversionOperations.conversionOperation(secondNumber);
    }
    else if (operation.equalsIgnoreCase("*")) {
        result = ConversionOperations.conversionOperation(firstNumber) * 1.0 * ConversionOperations.conversionOperation(secondNumber);
    }
    else if (operation.equalsIgnoreCase("/")){
        result = ConversionOperations.conversionOperation(firstNumber) * 1.0 / ConversionOperations.conversionOperation(secondNumber);
    }
        return result;
    }
}
