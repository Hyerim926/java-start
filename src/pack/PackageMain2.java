/*
* 첫줄에는 패키지, 그 다음 줄부터 Import문 사용*/
package pack;

import pack.a.*; // 다른 위치에 있는 패키지를 불러올 때

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
