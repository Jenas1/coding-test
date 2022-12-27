package programmers.base;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReverseArray {

    public static void main(String[] args) {

        int[] num_list = new int[]{1,2,3,4,5};

        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        Collections.reverse(list);

        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();

        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
