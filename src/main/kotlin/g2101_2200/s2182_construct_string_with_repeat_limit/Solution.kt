package g2101_2200.s2182_construct_string_with_repeat_limit

// #Medium #String #Greedy #Heap_Priority_Queue #Counting
class Solution {
    fun repeatLimitedString(s: String, repeatLimit: Int): String {
        val result = CharArray(s.length)
        val freq = IntArray(128)
        var index = 0
        for (c in s.toCharArray()) {
            freq[c.code]++
        }
        var max = 'z'
        var second = 'y'
        while (true) {
            while (max >= 'a' && freq[max.code] == 0) {
                max--
            }
            if (max < 'a') {
                break
            }
            second = Math.min(max.code - 1, second.code).toChar()
            var count = Math.min(freq[max.code], repeatLimit)
            freq[max.code] -= count
            while (count-- > 0) {
                result[index++] = max
            }
            if (freq[max.code] == 0) {
                max = second--
                continue
            }
            while (second >= 'a' && freq[second.code] == 0) {
                second--
            }
            if (second < 'a') {
                break
            }
            result[index++] = second
            freq[second.code]--
        }
        return String(result, 0, index)
    }
}
