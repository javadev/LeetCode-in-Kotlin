package g1001_1100.s1053_previous_permutation_with_one_swap

// #Medium #Array #Greedy #2023_05_30_Time_338_ms_(25.00%)_Space_71.2_MB_(25.00%)

class Solution {
    fun prevPermOpt1(arr: IntArray): IntArray {
        for (i in arr.indices.reversed()) {
            var diff = Int.MAX_VALUE
            var index = i
            for (j in i + 1 until arr.size) {
                if (arr[i] - arr[j] in 1 until diff) {
                    diff = arr[i] - arr[j]
                    index = j
                }
            }
            if (diff != Int.MAX_VALUE) {
                val temp = arr[i]
                arr[i] = arr[index]
                arr[index] = temp
                break
            }
        }
        return arr
    }
}
