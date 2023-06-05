package g1301_1400.s1343_number_of_sub_arrays_of_size_k_and_average_greater_than_or_equal_to_threshold

// #Medium #Array #Sliding_Window
class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        var sum = 0
        for (i in 0 until k - 1) {
            sum += arr[i]
        }
        var count = 0
        for (i in k - 1 until arr.size) {
            sum += arr[i]
            if (i - k >= 0) {
                sum -= arr[i - k]
            }
            if (sum / k >= threshold) {
                count++
            }
        }
        return count
    }
}
