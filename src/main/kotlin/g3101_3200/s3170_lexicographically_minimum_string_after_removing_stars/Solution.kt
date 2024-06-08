package g3101_3200.s3170_lexicographically_minimum_string_after_removing_stars

// #2024_06_06_Time_29_ms_(99.93%)_Space_45.6_MB_(92.80%)

class Solution {
    fun clearStars(s: String): String {
        val arr = s.toCharArray()
        val idxChain = IntArray(arr.size)
        val lastIdx = IntArray(26)
        idxChain.fill(-1)
        lastIdx.fill(-1)
        for (i in arr.indices) {
            if (arr[i] == '*') {
                for (j in 0..25) {
                    if (lastIdx[j] != -1) {
                        arr[lastIdx[j]] = '#'
                        lastIdx[j] = idxChain[lastIdx[j]]
                        break
                    }
                }
                arr[i] = '#'
            } else {
                idxChain[i] = lastIdx[arr[i].code - 'a'.code]
                lastIdx[arr[i].code - 'a'.code] = i
            }
        }
        val sb = StringBuilder()
        for (c in arr) {
            if (c != '#') {
                sb.append(c)
            }
        }
        return sb.toString()
    }
}
