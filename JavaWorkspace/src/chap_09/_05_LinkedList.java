package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("김태리");
        list.add("김겨울");
        list.add("고아성");
        list.add("김연경");
        list.add("김연아");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-----------------------");

        // 추가
        list.addFirst("윤여정"); // 맨 처음에 추가
        for (String s :
                list
        ) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        list.addLast("김혜수"); // 맨 마지막에 추가
        for (String s :
                list
        ) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1, "김새벽"); // 원하는 위치에 추가
        System.out.println("학생 추가 후 (index 1) : " + list.get(1));
        System.out.println("학생 추가 후 (index 2) : " + list.get(2));

        System.out.println("-----------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        System.out.println("-----------------------");

        // 처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); // 처음 데이터 삭제
        list.removeLast(); // 마지막 데이터 삭제
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String s :
                list
        ) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        // 변경 (수강권 양도)
        list.set(0, "김희애");
        System.out.println(list.get(0));

        System.out.println("-----------------------");

        // 확인
        System.out.println(list.indexOf("고아성"));
        if (list.contains("고아성")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-----------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-----------------------");

        // 새로운 학기
        list.add("김태리");
        list.add("김겨울");
        list.add("고아성");
        list.add("김연경");
        list.add("김연아"); // 리스트는 중복 데이터 허용
        list.add("김연아");
        list.add("김연아");
        list.add("김연아");

        Collections.sort(list); // 정렬

        for (String s :
                list
        ) {
            System.out.println(s);
        }
    }
}