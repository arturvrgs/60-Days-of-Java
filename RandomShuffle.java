import java.util.*;

public class RandomShuffle {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        System.out.println(arr);
        shuffle(arr);
    }

    public static void shuffle(ArrayList<Integer> arr) {
        ArrayList<Integer> shuffled = new ArrayList<Integer>();

        Random rand = new Random();

        while(arr.size() > 0) {
            int randIndex = rand.nextInt(arr.size());
            shuffled.add(arr.get(randIndex));
            arr.remove(randIndex);
        }

        System.out.println(shuffled);
    }
}