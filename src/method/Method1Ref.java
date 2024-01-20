package method;

/*
* 함수의 한 종류
* 함수 = 블랙박스*/
public class Method1Ref {
    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);


        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

    }

    // add 메서드 정의
    /*
    * 제어자: public, static
    * 반환타입: 메서드가 실행된 후 반환하는 데이터의 타입, 반환값이 없는 경우는 void
    * 메서드 이름
    * 매개변수: 입력값, 입력값이 없는 경우 안써도 됨
    * 메서드 본문: 동작 코드
    * */
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        return sum1;
    }
}
