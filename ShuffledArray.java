import java.util.ArrayList;

public class ShuffledArray {
    public static void main(String[] args) {
        int[] array1 = {1,4,5,2,3,6,10,11,12,16,1};

        int half = array1.length/2;

        ArrayList<Integer> shuffledArray = new ArrayList<>();

        for(int i = 0; i < half; i++) {
            shuffledArray.add(array1[i]);
            shuffledArray.add(array1[i + half]);
        }

        System.out.println(shuffledArray);
    }
}

