package g3301_3400.s3399_smallest_substring_with_identical_characters_ii

// #Hard #2024_12_24_Time_11_ms_(100.00%)_Space_45.7_MB_(54.55%)

class Solution {
    fun minLength(s: String, numOps: Int): Int {
        val l = s.length
        var lingyi = 0
        var yiling = 0
        val pq: MutableList<Int> = ArrayList<Int>()
        var thisone = s.get(0)
        var chang = 1
        if (thisone == '0') {
            yiling++
        } else {
            lingyi++
        }
        for (i in 1..<l) {
            val cur = s.get(i)
            if (cur == thisone) {
                chang++
            } else {
                if (chang >= 2) {
                    pq.add(chang)
                }
                chang = 1
                thisone = cur
            }
            if (i % 2 == 0) {
                if (cur == '0') {
                    yiling++
                } else {
                    lingyi++
                }
            } else {
                if (cur == '0') {
                    lingyi++
                } else {
                    yiling++
                }
            }
        }
        if (numOps >= lingyi || numOps >= yiling) {
            return 1
        }
        if (chang >= 2) {
            pq.add(chang)
        }
        var one = -1
        var two = -1
        for (cur in pq) {
            if (cur > one) {
                two = one
                one = cur
            } else if (cur > two) {
                two = cur
            }
        }
        if (two == -1) {
            return if (one / (numOps + 1) > 1) one / (numOps + 1) else 2
        }
        if (numOps == 0) {
            return one
        }
        if (numOps == 1) {
            return if (one / 2 > two) (if (one / 2 == 1) 2 else one / 2) else two
        }
        var left = 2
        var right = l / (numOps + 1)
        while (left < right) {
            val mid = left + (right - left) / 2
            var sum = 0
            for (integer in pq) {
                sum += integer / (mid + 1)
            }
            if (sum <= numOps) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}
