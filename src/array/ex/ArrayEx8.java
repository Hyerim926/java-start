package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");

        int n = scanner.nextInt();

        int[][] scores = new int[n][3];
        String[] subject = {"국어", "영어", "수학"};

        int[] sum = new int[n];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 점수를 입력하세요: ");
            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] +" 점수: ");
                scores[i][j] = scanner.nextInt();
                sum[i] += scores[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            double avg = (double) sum[i] / subject.length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum[i] + ", 평균: " + avg);
        }
    }
}
