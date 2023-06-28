package g2001_2100.s2094_finding_3_digit_even_numbers

// #Easy #Array #Hash_Table #Sorting #Enumeration
// #2023_06_28_Time_181_ms_(100.00%)_Space_37.4_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val idx = IntArray(1)
        val result = IntArray(9 * 10 * 5)
        val digitMap = IntArray(10)
        for (digit in digits) {
            digitMap[digit]++
        }
        dfs(result, digitMap, idx, 0)
        return result.copyOfRange(0, idx[0])
    }

    private fun dfs(result: IntArray, digitMap: IntArray, idx: IntArray, `val`: Int) {
        var `val` = `val`
        if (`val` > 99) {
            result[idx[0]++] = `val`
            return
        }
        `val` *= 10
        for (i in 0..9) {
            if (digitMap[i] == 0 || `val` == 0 && i == 0 || `val` > 99 && i and 1 == 1) {
                continue
            }
            digitMap[i]--
            `val` += i
            dfs(result, digitMap, idx, `val`)
            `val` -= i
            digitMap[i]++
        }
    }
}
