import java.util.ArrayList;
import java.util.List;

/**
 * 계산기 클래스
 */
public abstract class Calculator {
    /**
     * 연산 결과가 저장되는 결과값 리스트
     */
    private final List<Double> resultList;

    /**
     * 계산기 생성 시 결과값 리스트를 초기화합니다.
     */
    public Calculator() {
        this.resultList =  new ArrayList<>();
    }

    /**
     * 결과값 리스트를 반환합니다.
     * @return
     */
    public List<Double> getResultList () {
        return this.resultList;
    }

    /**
     * 결과값 리스트에 연산 결과를 추가합니다.
     * @param result
     */
    public void setResultList(double result) {
            this.resultList.add(result);
    }

    /**
     * 결과값 리스트의 첫 번째 연산 결과를 삭제합니다.
     */
    public void removeResult() {
        this.resultList.remove(0);
    }

    /**
     * 결과값 리스트의 모든 값을 출력합니다.
     */
    public abstract void inquiryResults();
}
