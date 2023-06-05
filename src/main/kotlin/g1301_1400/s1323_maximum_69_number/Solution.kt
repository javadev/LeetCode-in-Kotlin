package g1301_1400.s1323_maximum_69_number

import java.util.stream.IntStream

// #Easy #Math #Greedy
class Solution {
    fun maximum69Number(num: Int): Int {
        val chars = Integer.toString(num).toCharArray()
        IntStream.range(0, chars.size)
            .filter { i: Int -> chars[i] == '6' }
            .findFirst()
            .ifPresent { i: Int -> chars[i] = '9' }
        return String(chars).toInt()
    }
}
