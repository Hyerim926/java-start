package scope;

/*
* 스코프의 사용 이유
* 1. 비효율적인 메모리 사용을 줄이기 위해
* 2. 코드 복잡성을 낮추기 위해
* */
public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
//        System.out.println(temp);
        System.out.println("m = " + m);
    }
}
