package g1801_1900.s1854_maximum_population_year

// #Easy #Array #Counting
class Solution {
    fun maximumPopulation(logs: Array<IntArray>): Int {
        val arr = IntArray(101)
        for (log in logs) {
            arr[log[0] - 1950]++
            arr[log[1] - 1950]--
        }
        for (i in 1..100) {
            arr[i] += arr[i - 1]
        }
        var maxyear = 1950
        var max = 0
        for (i in 0..100) {
            if (arr[i] > max) {
                max = arr[i]
                maxyear = i + 1950
            }
        }
        return maxyear
    }
}
