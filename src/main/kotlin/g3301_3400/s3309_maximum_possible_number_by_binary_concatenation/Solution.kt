package g3301_3400.s3309_maximum_possible_number_by_binary_concatenation

// #Medium #Array #Bit_Manipulation #Enumeration
// #2024_10_12_Time_182_ms_(73.47%)_Space_36.8_MB_(79.59%)

class Solution {
    private var result = "0"

    fun maxGoodNumber(nums: IntArray): Int {
        val visited = BooleanArray(nums.size)
        val sb = StringBuilder()
        solve(nums, visited, 0, sb)
        var score = 0
        var `val`: Int
        for (c in result.toCharArray()) {
            `val` = c.code - '0'.code
            score *= 2
            score += `val`
        }
        return score
    }

    private fun solve(nums: IntArray, visited: BooleanArray, pos: Int, sb: StringBuilder) {
        if (pos == nums.size) {
            val `val` = sb.toString()
            if ((result.length == `val`.length && result.compareTo(`val`) < 0) ||
                `val`.length > result.length
            ) {
                result = `val`
            }
            return
        }
        var cur: String?
        for (i in nums.indices) {
            if (visited[i]) {
                continue
            }
            visited[i] = true
            cur = Integer.toBinaryString(nums[i])
            sb.append(cur)
            solve(nums, visited, pos + 1, sb)
            sb.setLength(sb.length - cur.length)
            visited[i] = false
        }
    }
}
