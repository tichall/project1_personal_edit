/**
 * 더하기 연산을 수행합니다.
 */
public class AddOperator implements Operator {

    @Override
    public int operate(int firstNum, int secondNum) {
        int addResult;
        addResult = firstNum + secondNum;
        return addResult;
    }
}
