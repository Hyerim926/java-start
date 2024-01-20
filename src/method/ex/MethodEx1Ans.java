package method.ex;

public class MethodEx1Ans {
    public static void main(String[] args) {
        System.out.println("평균값: " + getAverage(1, 2, 3));

        System.out.println("평균값: " + getAverage(15, 25, 35));
    }

    public static double getAverage(int a, int b, int c) {
        int sum = a + b + c;

        return sum / 3.0;
    }
}
