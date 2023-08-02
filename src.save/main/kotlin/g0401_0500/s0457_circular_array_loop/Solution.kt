package g0401_0500.s0457_circular_array_loop

// #Medium #Array #Hash_Table #Two_Pointers #2022_12_26_Time_143_ms_(100.00%)_Space_34_MB_(66.67%)

class Solution {
    fun circularArrayLoop(arr: IntArray): Boolean {
        val n = arr.size
        val map: MutableMap<Int, Int> = HashMap()
        // arr[i]%n==0 (cycle)
        for (start in 0 until n) {
            if (map.containsKey(start)) {
                // check if already visited
                continue
            }
            var curr = start
            // Check if the current index is valid
            while (isValidCycle(start, curr, arr)) {
                // marking current index visited and set value as start of loop
                map[curr] = start
                // steps to jump;
                val jump = arr[curr] % n
                // Jumping x steps backwards is same as jumping (n-x) steps forward
                // going to next index;
                curr = (curr + jump + n) % n
                if (map.containsKey(curr)) {
                    // value already processed
                    if (map[curr] == start) {
                        // If equal to start then we have found a loop
                        return true
                    }
                    // Else we can break since this has already been visited hence we will get the
                    // same result as before
                    break
                }
            }
        }
        return false
    }

    private fun isValidCycle(start: Int, curr: Int, arr: IntArray): Boolean {
        return (
            (arr[start] <= 0 || arr[curr] >= 0) &&
                (arr[start] >= 0 || arr[curr] <= 0) && arr[curr] % arr.size != 0
            )
    }
}
