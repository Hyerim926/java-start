package cond.ex;

public class DIstanceEx {
    public static void main(String[] args) {
        int distance = 25;

        if (distance > 100) {
            System.out.println("비행기");
        } else if (distance > 10) {
            System.out.println("자동차");
        } else if (distance > 1) {
            System.out.println("자전거");
        } else {
            System.out.println("도보");
        }
    }
}
