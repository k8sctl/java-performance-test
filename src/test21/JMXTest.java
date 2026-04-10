package test21;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JMXTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String key = "KEY";

        // 무한 반복
        // Map에 key 값이 없으면 문자열을 넣고, 이미 key 값이 있다면 문자열을 계속해서 더한다.
        // 문자열의 크기가 점점 늘어나면서 메모리를 차지하게 되는 것을 확인한다.
        while(true) {
            try {
                if (map.get(key) == null) {
                    map.put(key, getString());
                } else {
                    map.put(key, map.get(key) + getString());
                }
                System.out.println(map.get(key));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String getString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }
}
