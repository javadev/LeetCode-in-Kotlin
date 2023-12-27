package g2901_3000.s2910_minimum_number_of_groups_to_create_a_valid_assignment

class Solution {
    fun minGroupsForValidAssignment(nums: IntArray): Int {
        val count = getCountMap(nums)
        val countFreq = getCountFrequencyMap(count)
        val minFrequency = getMinFrequency(countFreq)
        for (size in minFrequency downTo 1) {
            val group = calculateGroups(countFreq, size)
            if (group > 0) {
                return group
            }
        }
        return -1
    }

    private fun getCountMap(nums: IntArray): Map<Int, Int> {
        val count: MutableMap<Int, Int> = HashMap()
        for (num in nums) {
            count.merge(num, 1) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!, b!!
                )
            }
        }
        return count
    }

    private fun getCountFrequencyMap(count: Map<Int, Int>): Map<Int, Int> {
        val countFreq: MutableMap<Int, Int> = HashMap()
        for (c in count.values) {
            countFreq.merge(c, 1) { a: Int?, b: Int? ->
                Integer.sum(
                    a!!, b!!
                )
            }
        }
        return countFreq
    }

    private fun getMinFrequency(countFreq: Map<Int, Int>): Int {
        return countFreq.keys.stream()
            .min { obj: Int, anotherInteger: Int? -> obj.compareTo(anotherInteger!!) }
            .orElseThrow { IllegalStateException("Count frequency map is empty") }
    }

    private fun calculateGroups(countFreq: Map<Int, Int>, size: Int): Int {
        var group = 0
        for ((len, value) in countFreq) {
            val rem = len % (size + 1)
            val g = len / (size + 1)
            group += if (rem == 0) {
                g * value
            } else {
                val need = size - rem
                if (g >= need) {
                    (g + 1) * value
                } else {
                    return -1
                }
            }
        }
        return group
    }
}
