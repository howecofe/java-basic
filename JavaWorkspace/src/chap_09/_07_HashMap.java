package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("김태리", 10);
        map.put("김겨울", 5);
        map.put("고아성", 3);
        map.put("김연경", 15);

        System.out.println("총 고객 수 : " + map.size());

        System.out.println("---------------------");

        // 조회
        System.out.println("김태리님의 포인트 : " + map.get("김태리"));
        System.out.println("김겨울님의 포인트 : " + map.get("김겨울"));
        System.out.println("고아성님의 포인트 : " + map.get("고아성"));

        System.out.println("---------------------");

        // 확인
        if (map.containsKey("김연경")) {
            int point = map.get("김연경");
            map.put("김연경", ++point);
            System.out.println("김연경님의 누적 포인트 : " + map.get("김연경"));
        } else {
            map.put("김연경", 1);
            System.out.println("김연경님 신규 등록 (포인트 1)");
        }

        System.out.println("---------------------");

        // 삭제
        map.remove("김태리");
        System.out.println(map.get("김태리")); // 키가 없으면 null 반환

        System.out.println("---------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("---------------------");

        // 다시 고객들이 막 찾아옴
        map.put("김태리", 10);
        map.put("김겨울", 5);
        map.put("고아성", 3);
        map.put("김연경", 15);

        // Key 확인: 순서 보장 X, 중복 허용 X
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("---------------------");

        // Value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---------------------");

        // Key & Value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("---------------------");

        // 맵 : 중복 허용 X, 순서 보장 X
        map.put("김연경", 10);
        map.put("김연경", 30);
        map.put("김연경", 50); // 키가 중복이라면, 가장 마지막 값으로 업데이트 된다.

        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("---------------------");

        // 순서 보장하고 싶은 경우
        HashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("김태리", 10);
        map2.put("김겨울", 5);
        map2.put("고아성", 3);
        map2.put("김연경", 15);

        for (String key : map2.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map2.get(key));
        }
    }
}
