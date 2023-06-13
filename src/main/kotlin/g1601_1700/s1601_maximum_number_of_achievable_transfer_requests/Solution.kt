package g1601_1700.s1601_maximum_number_of_achievable_transfer_requests

// #Hard #Array #Bit_Manipulation #Backtracking #Enumeration
// #2023_06_13_Time_206_ms_(100.00%)_Space_34.4_MB_(100.00%)

class Solution {
    private var max = 0
    fun maximumRequests(n: Int, requests: Array<IntArray>): Int {
        helper(requests, 0, IntArray(n), 0)
        return max
    }

    private fun helper(requests: Array<IntArray>, index: Int, count: IntArray, num: Int) {
        if (index == requests.size) {
            for (i in count) {
                if (0 != i) {
                    return
                }
            }
            max = Math.max(max, num)
            return
        }
        count[requests[index][0]]++
        count[requests[index][1]]--
        helper(requests, index + 1, count, num + 1)
        count[requests[index][0]]--
        count[requests[index][1]]++
        helper(requests, index + 1, count, num)
    }
}
