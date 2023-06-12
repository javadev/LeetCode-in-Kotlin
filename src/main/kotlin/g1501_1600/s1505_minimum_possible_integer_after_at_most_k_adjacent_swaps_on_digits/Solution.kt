package g1501_1600.s1505_minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits

// #Hard #String #Greedy #Segment_Tree #Binary_Indexed_Tree
// #2023_06_12_Time_226_ms_(100.00%)_Space_39.2_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minInteger(num: String, k: Int): String {
        var k = k
        val sb = StringBuilder()
        val digitPos = IntArray(10)
        val reduceMove = IntArray(10)
        var matchAmount = 0
        val chars = num.toCharArray()
        digitPos.fill(chars.size)
        for (i in chars.indices) {
            val cur = chars[i].code - '0'.code
            if (digitPos[cur] == chars.size) {
                digitPos[cur] = i
                matchAmount++
                if (matchAmount == 10) {
                    break
                }
            }
        }
        var curIndex = 0
        while (k > 0 && curIndex < chars.size) {
            for (digit in 0..9) {
                if (digitPos[digit] < chars.size && digitPos[digit] - reduceMove[digit] <= k) {
                    sb.append(chars[digitPos[digit]])
                    k -= digitPos[digit] - reduceMove[digit]
                    curIndex++
                    reduceMove[digit]++
                    for (j in 0..9) {
                        if (j != digit && digitPos[j] > digitPos[digit]) {
                            reduceMove[j]++
                        }
                    }
                    var find = false
                    for (next in digitPos[digit] + 1 until chars.size) {
                        val cur = chars[next].code - '0'.code
                        if (cur == digit) {
                            find = true
                            digitPos[digit] = next
                            break
                        }
                        if (next < digitPos[cur]) {
                            reduceMove[digit]++
                        }
                    }
                    if (!find) {
                        digitPos[digit] = chars.size
                    }
                    break
                }
            }
        }
        val start = digitPos.min()
        for (i in start until chars.size) {
            if (digitPos[chars[i].code - '0'.code] <= i) {
                sb.append(chars[i])
            }
        }
        return sb.toString()
    }
}
