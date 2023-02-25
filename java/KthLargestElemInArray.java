// https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElemInArray {
    public static int kthLargestElemInArray(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int kthInt = nums[0];

        for (int num: nums) {
            maxHeap.add(num);
        }

        for (int i = 0; i < k; i++) {
            kthInt = maxHeap.poll();
        }

        return kthInt;
    }
    public static void main(String[] args) {
        System.out.println(kthLargestElemInArray(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
