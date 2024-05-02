/**
 * 빼기 연산을 수행합니다.
 */
public class SubtractOperator implements Operator{
    @Override
    public int operate(int firstNum, int secondNum) {
        int subtractResult;
        subtractResult = firstNum - secondNum;
        return subtractResult;
    }
}
