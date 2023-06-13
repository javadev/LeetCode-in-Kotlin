package g1501_1600.s1589_maximum_sum_obtained_of_any_permutation

// #Medium #Array #Sorting #Greedy #Prefix_Sum
class Solution {
    fun maxSumRangeQuery(nums: IntArray, requests: Array<IntArray>): Int {
        nums.sort()
        val l = nums.size
        val tempArr = IntArray(l)
        // requests[i][0] incrementing index element by 1 and for requests[i][1]+1 decrementing by 1
        // this will help me get the freq of occurrence of each index of array 'nums' in
        // all 'requests' intervals when I compute the sum array of tempArr.
        for (request in requests) {
            val a = request[0]
            val b = request[1] + 1
            tempArr[a]++
            if (b < l) {
                tempArr[b]--
            }
        }
        var prev = 0
        for (i in 0 until l) {
            tempArr[i] += prev
            prev = tempArr[i]
        }
        tempArr.sort()
        var index = l - 1
        var ans: Long = 0
        while (index >= 0) {
            if (tempArr[index] == 0) {
                break
            }
            val x = (tempArr[index] % 1000000007).toLong()
            val y = (nums[index] % 1000000007).toLong()
            index--
            ans += x * y
        }
        return (ans % 1000000007).toInt()
    }
}
