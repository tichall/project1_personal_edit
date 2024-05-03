/**
 * 사칙연산 계산기 클래스
 */
public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator() {
        // 부모 생성자 호출
        super();
    }

    /**
     * 실제 사칙연산을 수행합니다.
     *
     * @param firstNum 연산에 사용될 첫 번째 숫자
     * @param secondNum 연산에 사용될 두 번째 숫자
     * @param operator 연산자
     * @return 사칙연산 결과값
     * @throws NumberException 나누기, 나머지 연산에서 secondNum(분모) 값으로 0 입력
     * @throws OperationException 정의되지 않은 연산자 입력
     */
    public double calculate(int firstNum, int secondNum, char operator) throws NumberException, OperationException {
        OperatorType type = OperatorType.getOperatorType(operator);
        double result = type.applyCalculate(firstNum, secondNum);
        return result;
    }

    /**
     * 사칙연산 계산 결과를 모두 출력합니다.
     */
    @Override
    public void inquiryResults() {
        System.out.println("[ 총 결과값 개수 : " + super.getResultList().size() + " ]");
        for (Double i : super.getResultList()) {
            System.out.println("사칙연산 값 : " +i);
        }
    }
}
