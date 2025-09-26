package g3601_3700.s3690_split_and_merge_array_transformation

// #Medium #Array #Hash_Table #Weekly_Contest_468 #Breadth_First_Search
// #2025_09_26_Time_12_ms_(100.00%)_Space_49.52_MB_(92.31%)

import java.util.Deque
import java.util.LinkedList
import kotlin.math.pow

class Solution {
    fun minSplitMerge(nums1: IntArray, nums2: IntArray): Int {
        val n = nums1.size
        var id = 0
        val map: MutableMap<Int, Int> = HashMap(n shl 1)
        for (value in nums1) {
            if (!map.containsKey(value)) {
                map.put(value, id++)
            }
        }
        var source = 0
        for (x in nums1) {
            source = source * 6 + map[x]!!
        }
        var target = 0
        for (x in nums2) {
            target = target * 6 + map[x]!!
        }
        if (source == target) {
            return 0
        }
        val que: Deque<Int> = LinkedList()
        que.add(source)
        val distances = IntArray(6.0.pow(n.toDouble()).toInt())
        distances[source] = 1
        while (!que.isEmpty()) {
            val x: Int = que.poll()!!
            val cur = rev(x, n)
            for (i in 0..<n) {
                for (j in i..<n) {
                    for (k in -1..<n) {
                        if (k > j) {
                            val ncur = IntArray(n)
                            var t1 = 0
                            for (t in 0..<i) {
                                ncur[t1++] = cur[t]
                            }
                            for (t in j + 1..k) {
                                ncur[t1++] = cur[t]
                            }
                            for (t in i..j) {
                                ncur[t1++] = cur[t]
                            }
                            for (t in k + 1..<n) {
                                ncur[t1++] = cur[t]
                            }
                            val t2 = hash(ncur)
                            if (distances[t2] == 0) {
                                distances[t2] = distances[x] + 1
                                if (t2 == target) {
                                    return distances[x]
                                }
                                que.add(t2)
                            }
                        }
                    }
                }
            }
        }
        return -1
    }

    private fun hash(nums: IntArray): Int {
        var num = 0
        for (x in nums) {
            num = num * 6 + x
        }
        return num
    }

    private fun rev(x: Int, n: Int): IntArray {
        var x = x
        val digits = IntArray(n)
        for (i in n - 1 downTo 0) {
            digits[i] = x % 6
            x /= 6
        }
        return digits
    }
}
