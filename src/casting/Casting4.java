package casting;
/*
* 계산과 형변환
* 형변환은 대입 뿐만 아니라, 계산을 할 때도 발생한다.
*
* 자바에서의 계산
* 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다 (int + int = int)
* 2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다 (int + double = double + double)
* */
public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5 => int / int => int
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; //1.5 => int / int => int
        System.out.println("div2 = " + div2); //1.0

        double div3 = 3.0 / 2;//1.5 => double / int = > double
        System.out.println("div3 = " + div3); //1.5

        double div4 = (double) 3 / 2; //1.5 => (double) int / int => double 명시적 형변환
        System.out.println("div4 = " + div4); //1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; //1.5 => (double) int / int => double 명시적 형변환
        System.out.println("result = " + result);
    }
}
