package g0601_0700.s0659_split_array_into_consecutive_subsequences

// #Medium #Array #Hash_Table #Greedy #Heap_Priority_Queue
// #2023_02_14_Time_352_ms_(100.00%)_Space_38.5_MB_(100.00%)

class Solution {
    fun isPossible(nums: IntArray): Boolean {
        val element = IntArray(2001)
        for (num in nums) {
            element[num + 1000] += 1
        }
        for (i in element.indices) {
            while (element[i] > 0) {
                var length = 1
                while (i + length < element.size &&
                    element[i + length] >= element[i + length - 1]
                ) {
                    length += 1
                }
                if (length < 3) {
                    return false
                } else {
                    for (j in i until i + length) {
                        element[j] -= 1
                    }
                }
            }
        }
        return true
    }
}
