package g4001_4100.s4011_count_subarrays_with_even_odd_ratio_i

// #Medium #Array #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree #Merge_Sort
// #Senior #Weekly_Contest_513 #2026_11_17_Time_6_ms_(99.17%)_Space_46.46_MB_(30.99%)

class Solution {
    private var count = 0

    fun countRatioSubarrays(nums: IntArray, a: Int, b: Int): Int {
        count = 0
        val n = nums.size
        val p = IntArray(n + 1)
        for (i in 0..<n) {
            p[i + 1] = p[i] + (if (nums[i] % 2 == 0) b else -a)
        }
        mergesort(p)
        return count
    }

    private fun mergesort(p: IntArray) {
        val n = p.size
        if (n < 2) {
            return
        }
        val a = IntArray(n / 2)
        val b = IntArray(n - n / 2)
        var idx = 0
        for (i in a.indices) {
            a[i] = p[idx++]
        }
        for (i in b.indices) {
            b[i] = p[idx++]
        }
        mergesort(a)
        mergesort(b)
        merge(a, b, p)
    }

    private fun merge(a: IntArray, b: IntArray, c: IntArray) {
        var i = 0
        var j = 0
        var k = 0
        while (i < a.size && j < b.size) {
            if (a[i] < b[j]) {
                c[k++] = a[i++]
            } else {
                count += (a.size - i)
                c[k++] = b[j++]
            }
        }
        while (i < a.size) {
            c[k++] = a[i++]
        }
        while (j < b.size) {
            c[k++] = b[j++]
        }
    }
}
