/**
 * 곱하기 연산을 수행합니다.
 */
public class MultiplyOperator implements Operator {
    @Override
    public int operate(int firstNum, int secondNum) {
        int multiplyResult;
        multiplyResult = firstNum * secondNum;
        return multiplyResult;
    }
}
