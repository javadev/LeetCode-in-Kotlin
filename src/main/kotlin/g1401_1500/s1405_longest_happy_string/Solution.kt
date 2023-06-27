package g1401_1500.s1405_longest_happy_string

// #Medium #String #Greedy #Heap_Priority_Queue
// #2023_06_07_Time_119_ms_(100.00%)_Space_33.7_MB_(100.00%)

class Solution {
    fun longestDiverseString(a: Int, b: Int, c: Int): String {
        val sb = StringBuilder()
        val remains = intArrayOf(a, b, c)
        val chars = charArrayOf('a', 'b', 'c')
        var preIndex = -1
        do {
            var index: Int
            var largest: Boolean
            if (preIndex != -1 &&
                remains[preIndex]
                == Math.max(remains[0], Math.max(remains[1], remains[2]))
            ) {
                index = if (preIndex == 0) {
                    if (remains[1] > remains[2]) 1 else 2
                } else if (preIndex == 1) {
                    if (remains[0] > remains[2]) 0 else 2
                } else {
                    if (remains[0] > remains[1]) 0 else 1
                }
                largest = false
            } else {
                index = if (remains[0] > remains[1]) 0 else 1
                index = if (remains[index] > remains[2]) index else 2
                largest = true
            }
            remains[index]--
            sb.append(chars[index])
            if (remains[index] > 0 && largest) {
                remains[index]--
                sb.append(chars[index])
            }
            preIndex = index
        } while (remains[0] + remains[1] + remains[2] != remains[preIndex])
        return sb.toString()
    }
}
