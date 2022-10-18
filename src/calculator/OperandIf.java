package calculator;

public interface OperandIf {
    void addDigit(char digit);
    void deleteLastDigit();
    void deleteLastEntry();
    void reset();
    void complete();
}