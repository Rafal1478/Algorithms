package limplists;

import java.util.Random;

public class ListMAin {
    public static void main(String[] args) {
        IList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        int numberCount = 10;
        for(int i = 0; i < numberCount; i++)
            list.add(rand.nextInt(20));
        ListUtilities.display(list);
        list.add(11,2);
        ListUtilities.display(list);
        list.remove(9);
        System.out.println(list.size());
        list.get(2);
        ListUtilities.insertSort(list);
        ListUtilities.display(list);

    }
}
