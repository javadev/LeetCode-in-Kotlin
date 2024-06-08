package g3101_3200.s3170_lexicographically_minimum_string_after_removing_stars

// #Medium #String #Hash_Table #Greedy #Stack #Heap_Priority_Queue
// #2024_06_08_Time_316_ms_(100.00%)_Space_40.9_MB_(89.58%)

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
