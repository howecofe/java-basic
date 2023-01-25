package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("김태리");
        list.add("(알 수 없음)");
        list.add("김겨울");
        list.add("(알 수 없음)");
        list.add("고아성");
        list.add("(알 수 없음)");
        list.add("김연경");
        list.add("(알 수 없음)");
        list.add("김연아");

        for (String s :
                list
        ) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-----------------");

        // 순회
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // 다음에 가져올 데이터가 있는지 : hasNext()
            System.out.println(it.next());
        }

        System.out.println("-----------------");

        // 삭제
        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 해당 데이터 삭제
            }
        }

        // 순회
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // 다음에 가져올 데이터가 있는지 : hasNext()
            System.out.println(it.next());
        }

        System.out.println("-----------------");

        // 이터레이터는 Set, Map 에서도 사용 가능
        HashSet<String> set = new HashSet<>();
        set.add("김태리");
        set.add("김겨울");
        Iterator<String> itSet = set.iterator();

        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("-----------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("김태리", 10);
        map.put("김겨울", 5);

//        map.iterator(); // 제공되지 않음.
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("-----------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("-----------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next()); // key=value 형태로 출력된다.
        }
    }
}
