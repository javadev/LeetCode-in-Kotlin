package g3301_3400.s3335_total_characters_in_string_after_transformations_i

// #Medium #2024_10_27_Time_55_ms_(100.00%)_Space_38.3_MB_(100.00%)

import java.util.LinkedList

class Solution {
    fun lengthAfterTransformations(s: String, t: Int): Int {
        val count = IntArray(26)
        for (c in s.toCharArray()) {
            count[c.code - 'a'.code]++
        }
        val list = LinkedList<Int?>()
        for (c in count) {
            list.add(c)
        }
        var delta = s.length % 1000000007
        for (i in 0 until t) {
            val zCount = list.removeLast()!! % 1000000007
            val aCount = list.pollFirst()!! % 1000000007
            list.offerFirst((aCount + zCount) % 1000000007)
            list.offerFirst(zCount)
            delta = delta % 1000000007
            delta = (delta + zCount) % 1000000007
        }
        return delta
    }
}
