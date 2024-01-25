package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 인스턴스화되어 들어가는 게 아니고 참조값을 복사해서 들어감. 즉, 같은 인스턴스임

        System.out.println("dataA 참조값=" + dataA); // 같은 참조값
        System.out.println("dataB 참조값=" + dataB); // 같은 참조값
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        //dataA 변경, 참조값이 같기 때문에 dataB의 값도 같이 변경됨
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 10(x) -> 20(o)

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 20(x) -> 30(o)
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}
