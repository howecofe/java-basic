package chap_03;

public class _Quiz_03 {
    // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
    // ex. "231231-2345678"인 경우, "231231-2"까지만 출력
    public static void main(String[] args) {
        String id = "231231-2345678";
        System.out.println(id.substring(0, id.indexOf("-") + 2));
    }
}
