package g0401_0500.s0420_strong_password_checker

// #Hard #String #Greedy #Heap_Priority_Queue
// #2022_12_06_Time_157_ms_(80.00%)_Space_34.4_MB_(20.00%)

class Solution {
    fun strongPasswordChecker(s: String): Int {
        var res = 0
        var a1 = 1
        var a2 = 1
        var d = 1
        val carr = s.toCharArray()
        val arr = IntArray(carr.size)
        var i1 = 0
        while (i1 < arr.size) {
            if (Character.isLowerCase(carr[i1])) {
                a1 = 0
            }
            if (Character.isUpperCase(carr[i1])) {
                a2 = 0
            }
            if (Character.isDigit(carr[i1])) {
                d = 0
            }
            val j = i1
            while (i1 < carr.size && carr[i1] == carr[j]) {
                i1++
            }
            arr[j] = i1 - j
        }
        val totalMissing = a1 + a2 + d
        if (arr.size < 6) {
            res += totalMissing + Math.max(0, 6 - (arr.size + totalMissing))
        } else {
            var overLen = Math.max(arr.size - 20, 0)
            var leftOver = 0
            res += overLen
            for (k in 1..2) {
                var i = 0
                while (i < arr.size && overLen > 0) {
                    if (arr[i] < 3 || arr[i] % 3 != k - 1) {
                        i++
                        continue
                    }
                    arr[i] -= Math.min(overLen, k)
                    overLen -= k
                    i++
                }
            }
            for (i in arr.indices) {
                if (arr[i] >= 3 && overLen > 0) {
                    val need = arr[i] - 2
                    arr[i] -= overLen
                    overLen -= need
                }
                if (arr[i] >= 3) {
                    leftOver += arr[i] / 3
                }
            }
            res += Math.max(totalMissing, leftOver)
        }
        return res
    }
}
