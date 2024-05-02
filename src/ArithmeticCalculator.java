/**
 * 사칙연산 계산기 클래스
 */
public class ArithmeticCalculator extends Calculator{
    Operator add, subtract, multiply, divide, mod;

    /**
     * 사칙연산 계산기 생성 시 연산자 인스턴스를 생성
     */
    public ArithmeticCalculator() {
        // 부모 생성자 호출
        super();
        this.add = new AddOperator();
        this.subtract = new SubtractOperator();
        this.multiply = new MultiplyOperator();
        this.divide = new DivideOperator();
        this.mod = new ModOperator();
    }

    /**
     * 실제 사칙연산 수행
     *
     * @param firstNum 연산에 사용될 첫 번째 숫자
     * @param secondNum 연산에 사용될 두 번째 숫자
     * @param operator 연산자
     * @return 사칙연산 결과값
     * @throws NumberException 나눗셈에서 secondNum(분모) 값으로 0 입력
     * @throws OperationException 정의되지 않은 연산자 입력
     */
    public double calculate(int firstNum, int secondNum, char operator) throws NumberException, OperationException {
        double result = switch (operator) {
            case '+' -> add.operate(firstNum, secondNum);
            case '-' -> subtract.operate(firstNum, secondNum);
            case '*' -> multiply.operate(firstNum, secondNum);
            case '/' -> divide.operate(firstNum, secondNum);
            case '%' -> mod.operate(firstNum, secondNum);
            default ->
                // 잘못된 연산자 예외 처리
                    throw new OperationException(operator);
        };

        return result;
    }

    /**
     * 사칙연산 계산 결과를 모두 출력
     */
    @Override
    public void inquiryResults() {
        System.out.println("[ 총 결과값 개수 : " + super.getResultList().size() + " ]");
        for (Double i : super.getResultList()) {
            System.out.println("사칙연산 값 : " +i);
        }
    }
}
