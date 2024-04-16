package g3001_3100.s3080_mark_elements_on_array_by_performing_queries

// #Medium #Array #Hash_Table #Sorting #Heap_Priority_Queue #Simulation
// #2024_04_16_Time_937_ms_(97.78%)_Space_90.4_MB_(55.56%)

class Solution {
    fun unmarkedSumArray(nums: IntArray, queries: Array<IntArray>): LongArray {
        val l = nums.size
        val orig = IntArray(l)
        for (i in 0 until l) {
            orig[i] = i
        }
        var x = 1
        while (x < l) {
            val temp = IntArray(l)
            val teor = IntArray(l)
            var y = 0
            while (y < l) {
                var s1 = 0
                var s2 = 0
                while (s1 + s2 < 2 * x && y + s1 + s2 < l) {
                    if (s2 >= x || y + x + s2 >= l) {
                        temp[y + s1 + s2] = nums[y + s1]
                        teor[y + s1 + s2] = orig[y + s1]
                        s1++
                    } else if (s1 >= x) {
                        temp[y + s1 + s2] = nums[y + x + s2]
                        teor[y + s1 + s2] = orig[y + x + s2]
                        s2++
                    } else if (nums[y + s1] <= nums[y + x + s2]) {
                        temp[y + s1 + s2] = nums[y + s1]
                        teor[y + s1 + s2] = orig[y + s1]
                        s1++
                    } else {
                        temp[y + s1 + s2] = nums[y + x + s2]
                        teor[y + s1 + s2] = orig[y + x + s2]
                        s2++
                    }
                }
                y += 2 * x
            }
            for (i in 0 until l) {
                nums[i] = temp[i]
                orig[i] = teor[i]
            }
            x *= 2
        }
        val change = IntArray(l)
        for (i in 0 until l) {
            change[orig[i]] = i
        }
        val mark = BooleanArray(l)
        val m = queries.size
        var st = 0
        var sum: Long = 0
        for (num in nums) {
            sum += num.toLong()
        }
        val out = LongArray(m)
        for (i in 0 until m) {
            val a = queries[i][0]
            if (!mark[change[a]]) {
                mark[change[a]] = true
                sum -= nums[change[a]].toLong()
            }
            val b = queries[i][1]
            var many = 0
            while (many < b) {
                if (st == l) {
                    out[i] = sum
                    break
                }
                if (!mark[st]) {
                    mark[st] = true
                    sum -= nums[st].toLong()
                    many++
                }
                st++
            }
            out[i] = sum
        }
        return out
    }
}
