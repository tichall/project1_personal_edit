/**
 * 연산자 타입을 담아둡니다.
 */
public enum OperatorType {
    ADD('+') {
        @Override
        public double applyCalculate(int firstNum, int secondNum) {
            return firstNum + secondNum;
        }
    },
    SUBSTRACT('-')  {
        @Override
        public double applyCalculate(int firstNum, int secondNum) {
            return firstNum - secondNum;
        }
    },
    MULTIPLY('*')  {
        @Override
        public double applyCalculate(int firstNum, int secondNum) {
            return firstNum * secondNum;
        }
    },
    DIVIDE('/')  {
        @Override
        public double applyCalculate(int firstNum, int secondNum) throws NumberException {
            if (secondNum == 0) {
                throw new NumberException("나누기 연산에서 분모로 0을 사용할 수 없습니다.");
            }
            return firstNum / secondNum;
        }
    },
    MOD('%') {
        @Override
        public double applyCalculate(int firstNum, int secondNum) throws NumberException{
            if (secondNum == 0) {
                throw new NumberException("나머지 연산에서 분모로 0을 사용할 수 없습니다.");
            }
            return firstNum % secondNum;
        }
    };

    private final char operator;
    OperatorType(char operator) {
        this.operator = operator;
    }

    /**
     * 정의된 연산자 타입 중 사용자가 입력한 연산자과 일치하는 것을 반환합니다.
     *
     * @param inputOperator 사용자가 입력한 연산자
     * @return 일치하는 연산자 타입
     * @throws OperationException 정의되지 않은 연산자 입력
     */
    public static OperatorType getOperatorType(char inputOperator) throws OperationException {
        for (OperatorType type : OperatorType.values()) {
            if (type.operator == inputOperator) {
                return type;
            }
        }
        throw new OperationException(inputOperator);
    }

    /**
     * 연산자 타입 별로 알맞은 연산을 수행해 결과값을 반환합니다.
     *
     * @param firstNum 연산에 사용될 첫 번째 숫자
     * @param secondNum 연산에 사용될 두 번째 숫자
     * @return 연산 결과값
     * @throws NumberException 나누기, 나머지 연산에서 secondNum(분모) 값으로 0 입력
     */
    public abstract double applyCalculate(int firstNum, int secondNum) throws NumberException;

    // 이렇게 NumberException 같이 ArithmeticCalculator에서 중복되는 주석은 어떻게 해야 할지..
    // 그냥 계속 똑같이 써주는 것이 답..? 아니면 이렇게 중복된 주석을 작성하게 하는 코드 자체가 문제인지..?

}
