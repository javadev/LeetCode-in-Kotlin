package g1401_1500.s1441_build_an_array_with_stack_operations

// #Easy #Array #Stack #Simulation #2023_06_07_Time_160_ms_(100.00%)_Space_35.4_MB_(100.00%)

class Solution {
    fun buildArray(target: IntArray, n: Int): List<String> {
        val result: MutableList<String> = ArrayList()
        val set: MutableSet<Int> = HashSet()
        for (i in target) {
            set.add(i)
        }
        val max = target[target.size - 1]
        for (i in 1..n) {
            if (!set.contains(i)) {
                result.add("Push")
                result.add("Pop")
            } else {
                result.add("Push")
            }
            if (i == max) {
                break
            }
        }
        return result
    }
}
