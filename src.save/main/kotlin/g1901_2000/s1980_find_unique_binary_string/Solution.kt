package g1901_2000.s1980_find_unique_binary_string

// #Medium #Array #String #Backtracking #2023_06_21_Time_186_ms_(50.00%)_Space_37.5_MB_(66.67%)

class Solution {
    fun findDifferentBinaryString(nums: Array<String>): String {
        val set: Set<String> = HashSet(listOf(*nums))
        val len = nums[0].length
        val sb = StringBuilder()
        var i = 0
        while (i < len) {
            sb.append(1)
            i++
        }
        val max = sb.toString().toInt(2)
        for (num in 0..max) {
            var binary = Integer.toBinaryString(num)
            if (binary.length < len) {
                sb.setLength(0)
                sb.append(binary)
                while (sb.length < len) {
                    sb.insert(0, "0")
                }
                binary = sb.toString()
            }
            if (!set.contains(binary)) {
                return binary
            }
        }
        return ""
    }
}
