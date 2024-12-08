package g3301_3400.s3377_digit_operations_to_make_two_integers_equal

// #Medium #2024_12_08_Time_215_ms_(100.00%)_Space_40.7_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun minOperations(n: Int, m: Int): Int {
        val limit = 100000
        val sieve = BooleanArray(limit + 1)
        val visited = BooleanArray(limit)
        sieve.fill(true)
        sieve[0] = false
        sieve[1] = false
        var i = 2
        while (i * i <= limit) {
            if (sieve[i]) {
                var j = i * i
                while (j <= limit) {
                    sieve[j] = false
                    j += i
                }
            }
            i++
        }
        if (sieve[n]) {
            return -1
        }
        val pq = PriorityQueue<IntArray>(Comparator { a: IntArray, b: IntArray -> a[0] - b[0] })
        visited[n] = true
        pq.add(intArrayOf(n, n))
        while (pq.isNotEmpty()) {
            val current = pq.poll()
            val cost = current[0]
            val num = current[1]
            val temp = num.toString().toCharArray()
            if (num == m) {
                return cost
            }
            for (j in temp.indices) {
                val old = temp[j]
                for (i in -1..1) {
                    val digit = old.code - '0'.code
                    if ((digit == 9 && i == 1) || (digit == 0 && i == -1)) {
                        continue
                    }
                    temp[j] = (i + digit + '0'.code).toChar()
                    val newNum = String(temp).toInt()
                    if (!sieve[newNum] && !visited[newNum]) {
                        visited[newNum] = true
                        pq.add(intArrayOf(cost + newNum, newNum))
                    }
                }
                temp[j] = old
            }
        }
        return -1
    }
}
