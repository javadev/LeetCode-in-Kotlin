package g1201_1300.s1291_sequential_digits

// #Medium #Enumeration #Udemy_Arrays
class Solution {
    fun sequentialDigits(low: Int, high: Int): List<Int> {
        val arr = intArrayOf(
            12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456,
            4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789,
            1234567, 2345678, 3456789, 12345678, 23456789, 123456789
        )
        val result: MutableList<Int> = ArrayList()
        for (j in arr) {
            // 234    148         234        256
            if (j >= low && j <= high) {
                result.add(j)
            }
        }
        return result
    }
}
