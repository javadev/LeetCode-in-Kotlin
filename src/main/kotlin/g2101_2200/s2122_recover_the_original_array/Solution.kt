package g2101_2200.s2122_recover_the_original_array

// #Hard #Array #Hash_Table #Sorting #Enumeration
class Solution {
    private lateinit var res: IntArray

    fun recoverArray(nums: IntArray): IntArray {
        val n = nums.size
        nums.sort()
        val diffs = ArrayList<Int>()
        val smallest = nums[0]
        for (i in 1 until n) {
            val k = (nums[i] - smallest) / 2
            if ((nums[i] - smallest) % 2 == 0 && k != 0) {
                diffs.add(k)
            }
        }
        for (k in diffs) {
            if (check(n, k, nums)) {
                break
            }
        }
        return res
    }

    private fun check(n: Int, k: Int, nums: IntArray): Boolean {
        res = IntArray(n / 2)
        val visited = BooleanArray(n)
        var lower = 0
        var higher = 1
        var count = 0
        while (lower < n) {
            if (visited[lower]) {
                lower++
                continue
            }
            val lowerVal = nums[lower]
            val higherVal = lowerVal + 2 * k
            while (higher < n) {
                if (nums[higher] == higherVal && !visited[higher]) {
                    break
                }
                higher++
            }
            if (higher == n) {
                return false
            }
            visited[lower] = true
            visited[higher] = true
            res[count] = lowerVal + k
            count++
            if (count == n / 2) {
                return true
            }
            lower++
            higher++
        }
        return false
    }
}
