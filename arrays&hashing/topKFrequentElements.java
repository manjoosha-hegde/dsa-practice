import java.util.*;

public class topKFrequentElements {

    // Function to find top k frequent elements
    public static int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Fill buckets with numbers
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        // Step 4: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
                if (index == k)
                    break;
            }
        }

        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}