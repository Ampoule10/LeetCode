import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listFirst = new ArrayList<>();
        listFirst.add(1);
        listFirst.add(2);
        listFirst.add(4);

        List<Integer> listSecond = Arrays.asList(1, 3, 4);

        for(int i = 0; i<listSecond.size(); i++){
            listFirst.add(listSecond.get(i));
        }

        for (int j = 0; j < listFirst.size(); j++) {
            for (int i = 0; i < listFirst.size() - 1; i++) {
                if (listFirst.get(i) > listFirst.get(i + 1)) {
                    int temp = listFirst.get(i);
                    listFirst.set(i, listFirst.get(i + 1));
                    listFirst.set((i + 1), temp);
                }
            }
        }

        System.out.println(listFirst);

    }
}
