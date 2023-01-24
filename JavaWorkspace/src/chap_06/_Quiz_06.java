package chap_06;

public class _Quiz_06 {
    // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.
    // 조건1. 개인정보를 비공개로 전환하는 메소드 작성
    // 조건2. 하나의 메소드에서 모든 동작 처리

    // ex)
    // 그레타 -> 그**
    // 990130-1234567 -> 990130-1******
    // 010-1234-5678 -> 010-1234-****

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // 그레타 -> 그
//        for (int i = index; index < data.length(); index++)
        for (int i = 0; i < (data.length() - index); i++) {
            hiddenData += "*"; // 그**
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "그레타";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
