package s0001.two.sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        val map = HashMap<Int, Int>()
        for (i in nums.indices)
        {
          val value = target - nums[i]
          if (!map.containsKey(value))
          {
            map.put(nums[i], i)
            continue
          }
          if (map.get(value) !== i)
          {
            res[1] = i
            res[0] = map.get(value)!!
            break
          }
        }
        return res
    }
}
