package g1201_1300.s1296_divide_array_in_sets_of_k_consecutive_numbers

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2023_06_08_Time_488_ms_(100.00%)_Space_54.2_MB_(28.57%)

class Solution {
    fun isPossibleDivide(nums: IntArray, k: Int): Boolean {
        nums.sort()
        val map = HashMap<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        for (num in nums) {
            if (map[num] == 0) {
                continue
            }
            for (v in num until num + k) {
                if (!map.containsKey(v) || map[v] == 0) {
                    return false
                } else {
                    map[v] = map[v]!! - 1
                }
            }
        }
        return true
    }
}
