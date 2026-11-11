import java.util.ArrayList;

class ListSum {

    public static int sumList(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(1);
        nums.add(2);

        System.out.println(sumList(nums));
    }
}

// O(n)
// use it whn u dont know the size of an array
