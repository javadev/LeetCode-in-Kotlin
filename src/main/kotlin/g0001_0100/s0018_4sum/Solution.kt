package g0001_0100.s0018_4sum

// #Medium #Array #Sorting #Two_Pointers #2023_07_03_Time_229_ms_(98.59%)_Space_37.8_MB_(100.00%)

class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val n = nums.size
        nums.sort()
        val result: MutableList<List<Int>> = ArrayList()
        for (i in 0 until n - 3) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            if (nums[i].toLong() + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break
            }
            if (nums[i].toLong() + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue
            }
            for (j in i + 1 until n - 2) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue
                }
                if (nums[j].toLong() + nums[j + 1] + nums[j + 2] > target - nums[i]) {
                    break
                }
                if (nums[j].toLong() + nums[n - 2] + nums[n - 1] < target - nums[i]) {
                    continue
                }
                val tempTarget = target - (nums[i] + nums[j])
                var low = j + 1
                var high = n - 1
                while (low < high) {
                    val curSum = nums[low] + nums[high]
                    if (curSum == tempTarget) {
                        val tempList: MutableList<Int> = ArrayList()
                        tempList.add(nums[i])
                        tempList.add(nums[j])
                        tempList.add(nums[low])
                        tempList.add(nums[high])
                        result.add(tempList)
                        low++
                        high--
                        while (low < high && nums[low] == nums[low - 1]) {
                            low++
                        }
                        while (low < high && nums[high] == nums[high + 1]) {
                            high--
                        }
                    } else if (curSum < tempTarget) {
                        low++
                    } else {
                        high--
                    }
                }
            }
        }
        return result
    }
}
