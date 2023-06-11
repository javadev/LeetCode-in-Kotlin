package g1501_1600.s1520_maximum_number_of_non_overlapping_substrings

import java.util.*

// #Hard #String #Greedy
class Solution {
    fun maxNumOfSubstrings(s: String): List<String> {
        val lefts = IntArray(26)
        val rights = IntArray(26)
        Arrays.fill(lefts, -1)
        for (i in 0 until s.length) {
            val idx = s[i].code - 'a'.code
            if (lefts[idx] == -1) {
                lefts[idx] = i
            }
            rights[idx] = i
        }
        val result: MutableList<String> = ArrayList()
        val stack: Deque<IntArray> = ArrayDeque()
        var top: IntArray? = null
        for (i in 0 until s.length) {
            val idx = s[i].code - 'a'.code
            if (i == lefts[idx]) {
                if (top == null || rights[idx] < top[1]) {
                    top = intArrayOf(i, rights[idx])
                    stack.offerFirst(top)
                } else if (rights[idx] > top[1]) {
                    top[1] = rights[idx]
                }
            } else if (top != null && lefts[idx] < top[0]) {
                var newEnd = rights[idx]
                while (top != null && top[0] > lefts[idx]) {
                    newEnd = Math.max(newEnd, top[1])
                    stack.pollFirst()
                    top = stack.peekFirst()
                }
                if (top != null) {
                    top[1] = Math.max(newEnd, top[1])
                }
            }
            if (top != null && i >= top[1]) {
                result.add(s.substring(top[0], top[1] + 1))
                stack.clear()
                top = null
            }
        }
        return result
    }
}
