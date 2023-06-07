package g1401_1500.s1442_count_triplets_that_can_form_two_arrays_of_equal_xor

// #Medium #Array #Hash_Table #Math #Bit_Manipulation #Prefix_Sum
class Solution {
    fun countTriplets(arr: IntArray): Int {
        var count = 0
        for (i in arr.indices) {
            var xor = arr[i]
            for (k in i + 1 until arr.size) {
                xor = xor xor arr[k]
                if (xor == 0) {
                    count += k - i
                }
            }
        }
        return count
    }
}
