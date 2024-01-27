package access.a;

public class AccessData {
    public int publicField;
    int defalutField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defalutField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defalutField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod(); // 내부에서 호출하는 것이기 때문에 실행 가능
    }

}
