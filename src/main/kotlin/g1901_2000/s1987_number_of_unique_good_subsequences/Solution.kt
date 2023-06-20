package g1901_2000.s1987_number_of_unique_good_subsequences

// #Hard #String #Dynamic_Programming
class Solution {
    fun numberOfUniqueGoodSubsequences(binary: String): Int {
        var addZero = false
        // in the first round we "concat" to the empty binary
        var count = 1
        val countEndsWith = IntArray(2)
        for (i in 0 until binary.length) {
            val c = binary[i]
            val cIndex = c.code - '0'.code
            // all valid sub-binaries + c at the end => same count
            var endsWithCCount = count
            if (c == '0') {
                addZero = true
                // every time c is '0', we concat it to "" and get "0" - we wish to count it only
                // once (done in the end)
                endsWithCCount--
            }
            // w/out c at the end minus dups (= already end with c)
            count = (count + endsWithCCount - countEndsWith[cIndex]) % MOD
            // may be negative due to MOD
            count = if (count < 0) count + MOD else count
            countEndsWith[cIndex] = endsWithCCount
        }
        // remove the empty binary
        count--
        // add "0"
        if (addZero) {
            count++
        }
        return count
    }

    companion object {
        private const val MOD = 1000000007
    }
}
