package g3801_3900.s3842_toggle_light_bulbs

// #Easy #Array #Hash_Table #Sorting #Simulation #Mid_Level #Weekly_Contest_489
// #2026_07_22_Time_2_ms_(99.86%)_Space_46.70_MB_(58.12%)

class Solution {
    fun toggleLightBulbs(bulbs: MutableList<Int>): MutableList<Int> {
        val on = BooleanArray(101)
        for (b in bulbs) {
            on[b!!] = !on[b]
        }
        val ans: MutableList<Int> = ArrayList<Int>()
        for (i in 1..100) {
            if (on[i]) {
                ans.add(i)
            }
        }
        return ans
    }
}
