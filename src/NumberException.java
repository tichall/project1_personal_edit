/**
 * 올바르지 않은 피연산자가 들어온 경우 던집니다.
 */
public class NumberException extends Exception{
    public NumberException(String errMsg) {
        super("[피연산자 에러 발생] " + errMsg);
    }
}
