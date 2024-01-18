package array;

import java.sql.PseudoColumnUsage;

/*
* 자바는 배열을 생성할 때 그 내부값을 자동으로 초기화한다
* int : 0
* boolean : false
* String: null
* */
public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 1. 배열 변수 선언
        students = new int[5]; // 길이가 5인 배열
        System.out.println("참조값: " + students);

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);
    }
}
