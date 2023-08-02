package g2301_2400.s2320_count_number_of_ways_to_place_houses

// #Medium #Dynamic_Programming #2023_06_30_Time_122_ms_(100.00%)_Space_33.2_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countHousePlacements(n: Int): Int {
        // algo - 1st solve one side  of the street
        // think 0 - space , 1 - house
        // if n = 1 then we can take one 0 and one 1 (total ways = 2)
        // if n = 2 then 00 , 01 , 10 , 11 but we cant take 11 as two house cant be adjacent.
        // so the 1 ended string will be only 1 which is same as previous 0 ended string and 0 ended
        // string are 2 which is previous sum(total ways)
        // apply this formula for n no's
        var n = n
        val mod: Long = 1000000007
        var space: Long = 1
        var house: Long = 1
        var sum = space + house
        while (--n > 0) {
            house = space
            space = sum
            sum = (house + space) % mod
        }
        // as street has two side
        return (sum * sum % mod).toInt()
    }
}
