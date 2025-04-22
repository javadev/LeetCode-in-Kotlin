package g3501_3600.s3522_calculate_score_after_performing_instructions

// #Medium #Array #String #Hash_Table #Simulation
// #2025_04_20_Time_3_ms_(100.00%)_Space_84.28_MB_(81.82%)

class Solution {
    fun calculateScore(instructions: Array<String>, values: IntArray): Long {
        var ans: Long = 0
        val seen = BooleanArray(instructions.size)
        var pos = 0
        while (pos >= 0 && pos < instructions.size && !seen[pos]) {
            seen[pos] = true
            if (instructions[pos][0] == 'a') {
                ans += values[pos].toLong()
                pos++
            } else {
                pos += values[pos]
            }
        }
        return ans
    }
}
