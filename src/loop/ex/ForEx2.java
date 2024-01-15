package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        // 변수 선언과 증감식 모두 여러개 사용할 수 있음
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }
}
