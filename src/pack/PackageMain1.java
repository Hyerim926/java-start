package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new User(); // 다른 위치에 있는 패키지에 있는 클래스를 불러올 때
    }
}
