package casting;

/*
* 형변환과 오버플로우
* 형변환을 할 때 만약 작은 숫자가 표현할 수 있는 범위를 넘어서면 어떻게 될까?
* */
public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        // 오버플로우 발생 -> int의 가장 작은 범위부터 재시작함
        // 오버플로우는 발생하면 안됨 !
        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = " + intValue);
    }
}
