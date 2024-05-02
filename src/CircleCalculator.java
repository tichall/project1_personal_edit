
/**
 * 원의 넓이 계산기 클래스
 *
 */
public class CircleCalculator extends Calculator{

    private final double PI = 3.14;


    public CircleCalculator() {
        super();
    }

    /**
     * 반지름 값을 받아 원의 넓이를 계산해 반환
     *
     * @param radius 원의 반지름
     * @return 원의 넓이
     *
     */
    @Override
    public double calculate(int radius) {
        super.result = radius * radius * PI;
        return super.result;
    }

    @Override
    public double calculate(int firstNum, int secondNum, char operator) {
        System.out.println("다른 계산기에서 사용되는 기능입니다.");
        return 0;
    }
}
