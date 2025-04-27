package g3501_3600.s3527_find_the_most_common_response

// #Medium #2025_04_27_Time_73_ms_(100.00%)_Space_243.97_MB_(50.00%)

class Solution {
    private fun compareStrings(str1: String, str2: String): Boolean {
        val n = str1.length
        val m = str2.length
        var i = 0
        var j = 0
        while (i < n && j < m) {
            if (str1[i] < str2[j]) {
                return true
            } else if (str1[i] > str2[j]) {
                return false
            }
            i++
            j++
        }
        return n < m
    }

    fun findCommonResponse(responses: List<List<String>>): String {
        val n = responses.size
        val mp: MutableMap<String, IntArray> = HashMap()
        var ans = responses[0][0]
        var maxFreq = 0
        for (row in 0..<n) {
            val m = responses[row].size
            for (col in 0..<m) {
                val resp = responses[row][col]
                val arr = mp.getOrDefault(resp, intArrayOf(0, -1))
                if (arr[1] != row) {
                    arr[0]++
                    arr[1] = row
                    mp.put(resp, arr)
                }
                if (arr[0] > maxFreq ||
                    (ans != resp) && arr[0] == maxFreq && compareStrings(resp, ans)
                ) {
                    ans = resp
                    maxFreq = arr[0]
                }
            }
        }
        return ans
    }
}
