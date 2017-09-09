package lec16.oop.interfaces.defaultandstaticmethod;
public abstract class CalculatorFactory {

    public static Calculator getInstance() {
        return new BasicCalculator();
    }
}