package g2101_2200.s2178_maximum_split_of_positive_even_integers

// #Medium #Math #Greedy #2023_06_26_Time_486_ms_(55.56%)_Space_48_MB_(100.00%)

class Solution {
    fun maximumEvenSplit(finalSum: Long): List<Long> {
        var curr: Long = 2
        var remainingSum = finalSum
        val result: MutableList<Long> = ArrayList()
        if (finalSum % 2 != 0L) {
            return result
        }
        while (remainingSum >= curr) {
            result.add(curr)
            remainingSum -= curr
            curr += 2
        }
        /*
        go greedily by starting from smallest even number
        for target = 16 after the while loop
        remainingSum = 4
        curr = 8 (if we add 8 it exceeds the target 16)
        result = [2,4,6]
        so remove 6 from list and add it to remainigSum and insert to list
        result = [2,4,10]
        */
        val lastSum = result[result.size - 1]
        result.removeAt(result.size - 1)
        result.add(lastSum + remainingSum)
        return result
    }
}
