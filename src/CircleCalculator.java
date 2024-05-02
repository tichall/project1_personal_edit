
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
     */
    public double calculate(int radius) {
        double result;
        result = radius * radius * PI;
        return result;
    }

    /**
     * 원의 넓이 계산 결과를 모두 출력
     */
    @Override
    public void inquiryResults() {
        System.out.println("[ 총 결과값 개수 : " + super.getResultList().size() + " ]");
        for (Double i : super.getResultList()) {
            System.out.println("넓이 값 : " +i);
        }
    }
}
