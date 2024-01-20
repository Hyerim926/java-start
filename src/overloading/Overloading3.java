package overloading;

/*
* 타입이 다른 경우*/
public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2)); // 매개변수의 타입에 적합한 것을 찾고 -> 없을 경우 자동 형변환이 가능한 메서드 호출
        System.out.println("2: " + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    // 더 큰 타입으로 선언된 메서드 지우면 에러남
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
