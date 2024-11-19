package g0301_0400.s0321_create_maximum_number

// #Hard #Greedy #Stack #Monotonic_Stack #2022_11_12_Time_209_ms_(100.00%)_Space_36.2_MB_(100.00%)

class Solution {
    fun maxNumber(nums1: IntArray, nums2: IntArray, k: Int): IntArray {
        if (k == 0) {
            return IntArray(0)
        }
        val maxSubNums1 = IntArray(k)
        val maxSubNums2 = IntArray(k)
        var res = IntArray(k)
        // select l elements from nums1
        for (l in 0..Math.min(k, nums1.size)) {
            if (l + nums2.size < k) {
                continue
            }
            // create maximum number for each array
            // nums1: l elements; nums2: k - l elements
            maxSubArray(nums1, maxSubNums1, l)
            maxSubArray(nums2, maxSubNums2, k - l)
            // merge the two maximum numbers
            // if get a larger number than res, update res
            res = merge(maxSubNums1, maxSubNums2, l, k - l, res)
        }
        return res
    }

    private fun maxSubArray(nums: IntArray, maxSub: IntArray, size: Int) {
        if (size == 0) {
            return
        }
        var j = 0
        for (i in nums.indices) {
            while (j > 0 && nums.size - i + j > size && nums[i] > maxSub[j - 1]) {
                j--
            }
            if (j < size) {
                maxSub[j++] = nums[i]
            }
        }
    }

    private fun merge(maxSub1: IntArray, maxSub2: IntArray, size1: Int, size2: Int, res: IntArray): IntArray {
        val merge = IntArray(res.size)
        var i = 0
        var j = 0
        var idx = 0
        var equal = true
        while (i < size1 || j < size2) {
            if (j >= size2) {
                merge[idx] = maxSub1[i++]
            } else if (i >= size1) {
                merge[idx] = maxSub2[j++]
            } else {
                var ii = i
                var jj = j
                while (ii < size1 && jj < size2 && maxSub1[ii] == maxSub2[jj]) {
                    ii++
                    jj++
                }
                if (ii < size1 && jj < size2) {
                    if (maxSub1[ii] > maxSub2[jj]) {
                        merge[idx] = maxSub1[i++]
                    } else {
                        merge[idx] = maxSub2[j++]
                    }
                } else if (jj == size2) {
                    merge[idx] = maxSub1[i++]
                } else {
                    // ii == size1
                    merge[idx] = maxSub2[j++]
                }
            }
            // break if we already know merge must be < res
            if (merge[idx] > res[idx]) {
                equal = false
            } else if (equal && merge[idx] < res[idx]) {
                break
            }
            idx++
        }
        // if get a larger number than res, update res
        val k = res.size
        if (i == size1 && j == size2 && !equal) {
            return merge
        }
        return if (equal && merge[k - 1] > res[k - 1]) {
            merge
        } else {
            res
        }
    }
}
