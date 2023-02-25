import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthClosestElements {
    public static List<Integer> kthClosestElements(int[] arr, int k, int x) {
        List<Integer> answer = new ArrayList<>();
        if (arr.length == 1) {
            answer.add(arr[0]);
            return answer;
        }

//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> weights = new ArrayList<>();
        int leftPtr = 0;
        int rightPtr = arr.length;
        int minWeight = Integer.MAX_VALUE;

//        for (int i = 0; i < arr.length - 1; i++) {
//            if ()
//        }


        return answer;
    }
}
