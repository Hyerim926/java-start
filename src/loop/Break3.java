package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        // i변수는 for문 안에서만 사용한다
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
