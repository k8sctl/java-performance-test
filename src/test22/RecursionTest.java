package test22;

import java.util.*;

public class RecursionTest {

    private void getAutoLotto(int counter, List<String> list, int limit) {
        list.add(makeLottoNum());
        counter++;
        if (counter < limit) {
            return;
        }

        getAutoLotto(counter, list, limit);
    }

    private String makeLottoNum() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random rand = new Random();
        while (lottoNumbers.size() < 6) {
            int number = rand.nextInt(45) + 1;
            lottoNumbers.add(number);
        }

        List<Integer> sortedNumbers = new ArrayList<>(lottoNumbers);
        Collections.sort(sortedNumbers);
        return sortedNumbers.toString();
    }

    private void run() {
        List<String> list = null;
        while(true) {
            try {
                list = new ArrayList<>();
                getAutoLotto(1, list, 1000);
                System.out.println("lotto make size = " + list.size());

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new RecursionTest().run();
    }
}
