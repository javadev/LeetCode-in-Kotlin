package g1301_1400.s1390_four_divisors

// #Medium #Array #Math
class Solution {
    fun sumFourDivisors(nums: IntArray): Int {
        var sum = 0
        for (num in nums) {
            val sqrt = Math.sqrt(num.toDouble()).toInt()
            if (sqrt * sqrt == num) {
                continue
            }
            var tmpSum = num + 1
            var count = 0
            for (i in 2..sqrt) {
                if (num % i == 0) {
                    count++
                    tmpSum += i + num / i
                }
                if (count > 1) {
                    break
                }
            }
            if (count == 1) {
                sum += tmpSum
            }
        }
        return sum
    }
}
