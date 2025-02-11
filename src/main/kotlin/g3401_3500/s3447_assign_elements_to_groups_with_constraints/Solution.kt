package g3401_3500.s3447_assign_elements_to_groups_with_constraints

// #Medium #Array #Hash_Table #2025_02_11_Time_24_ms_(100.00%)_Space_78.02_MB_(83.33%)

import kotlin.math.max

class Solution {
    fun assignElements(groups: IntArray, elements: IntArray): IntArray {
        var j: Int
        var maxi = 0
        var i = 0
        while (i < groups.size) {
            maxi = max(maxi, groups[i])
            i++
        }
        val n = maxi + 1
        val arr = IntArray(n)
        val ans = IntArray(groups.size)
        arr.fill(-1)
        i = 0
        while (i < elements.size) {
            if (elements[i] < n && arr[elements[i]] == -1) {
                j = elements[i]
                while (j < n) {
                    if (arr[j] == -1) {
                        arr[j] = i
                    }
                    j += elements[i]
                }
            }
            i++
        }
        i = 0
        while (i < groups.size) {
            ans[i] = arr[groups[i]]
            i++
        }
        return ans
    }
}
