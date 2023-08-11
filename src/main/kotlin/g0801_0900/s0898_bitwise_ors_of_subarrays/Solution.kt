package g0801_0900.s0898_bitwise_ors_of_subarrays

// #Medium #Array #Dynamic_Programming #Bit_Manipulation
// #2023_04_12_Time_812_ms_(100.00%)_Space_60.1_MB_(100.00%)

class Solution {
    fun subarrayBitwiseORs(arr: IntArray): Int {
        val set: MutableSet<Int> = HashSet()
        for (i in arr.indices) {
            set.add(arr[i])
            for (j in i - 1 downTo 0) {
                if (arr[i] or arr[j] == arr[j]) {
                    break
                }
                arr[j] = arr[j] or arr[i]
                set.add(arr[j])
            }
        }
        return set.size
    }
}
