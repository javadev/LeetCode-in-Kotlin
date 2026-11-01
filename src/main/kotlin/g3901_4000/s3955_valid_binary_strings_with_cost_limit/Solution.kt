package g3901_4000.s3955_valid_binary_strings_with_cost_limit

// #Medium #String #Bit_Manipulation #Backtracking #Enumeration #Senior #Weekly_Contest_505
// #2026_10_20_Time_5_ms_(96.05%)_Space_46.65_MB_(99.60%)

class Solution {
    private lateinit var result: MutableList<String>
    private var n = 0
    private var k = 0

    fun generateValidStrings(n: Int, k: Int): MutableList<String> {
        this.result = ArrayList<String>()
        this.n = n
        this.k = k
        val path = CharArray(n)
        dfs(0, 0, path)
        return result
    }

    private fun dfs(index: Int, cost: Int, path: CharArray) {
        if (index == n) {
            result!!.add(String(path))
            return
        }
        path[index] = '0'
        dfs(index + 1, cost, path)
        val canPlaceOne = (index == 0 || path[index - 1] != '1') && (cost + index <= k)
        if (canPlaceOne) {
            path[index] = '1'
            dfs(index + 1, cost + index, path)
        }
    }
}
