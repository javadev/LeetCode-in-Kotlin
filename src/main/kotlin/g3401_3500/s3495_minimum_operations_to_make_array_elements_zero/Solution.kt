package g3401_3500.s3495_minimum_operations_to_make_array_elements_zero

// #Hard #Array #Math #Bit_Manipulation #2025_03_23_Time_12_ms_(100.00%)_Space_105.09_MB_(100.00%)

class Solution {
    fun minOperations(queries: Array<IntArray>): Long {
        var result: Long = 0
        for (query in queries) {
            var v: Long = 4
            var req: Long = 1
            var totalReq: Long = 0
            while (query[0] >= v) {
                v *= 4
                req++
            }
            var group: Long
            if (query[1] < v) {
                group = query[1] - query[0] + 1L
                totalReq += group * req
                result += (totalReq + 1) / 2
                continue
            }
            group = v - query[0]
            totalReq += group * req
            var bottom = v
            while (true) {
                v *= 4
                req++
                if (query[1] < v) {
                    group = query[1] - bottom + 1
                    totalReq += group * req
                    break
                }
                group = v - bottom
                totalReq += group * req
                bottom = v
            }
            result += (totalReq + 1) / 2
        }
        return result
    }
}
