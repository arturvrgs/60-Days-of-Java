import java.util.ArrayList;

public class RemoveDuplicates {

    static int[] numb = {1,2,3,4,5,1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println(removeDuplicateNumber(numb));
    }

    public static String removeDuplicateNumber(int[] numb) {

        ArrayList<Integer> numsWithoutDuplicates = new ArrayList<>();

        for(int num : numb) {
            if(!numsWithoutDuplicates.contains(num)) {
                numsWithoutDuplicates.add(num);
            }
        }

        return numsWithoutDuplicates.toString();
    }
}
