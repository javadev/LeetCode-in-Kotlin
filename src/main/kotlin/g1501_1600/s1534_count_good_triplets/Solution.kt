package g1501_1600.s1534_count_good_triplets

// #Easy #Array #Enumeration
class Solution {
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var count = 0
        for (i in 0 until arr.size - 2) {
            for (j in i + 1 until arr.size - 1) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (k in j + 1 until arr.size) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++
                        }
                    }
                }
            }
        }
        return count
    }
}
