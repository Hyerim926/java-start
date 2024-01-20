package overloading;

/*
* 오버로딩이란
* 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것
* 규칙
* 1. 메서드 이름과 매개변수 타입이 같은데 반환 타입이 다르면 불가능
* 2. 메서드 이름 + 매개변수 타입(순서)가 다르면 불가능 */
public class Overloading1 {
    /*
    * 매개변수의 개수가 다른 오버로딩
    * */
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    // 첫번째 메서드
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

}
