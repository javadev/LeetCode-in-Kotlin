package g1801_1900.s1899_merge_triplets_to_form_target_triplet

// #Medium #Array #Greedy #2023_06_22_Time_954_ms_(71.43%)_Space_126_MB_(100.00%)

class Solution {
    fun mergeTriplets(triplets: Array<IntArray>, target: IntArray): Boolean {
        var one = false
        var two = false
        var three = false
        for (triplet in triplets) {
            if (!one && triplet[0] == target[0] && triplet[1] <= target[1] && triplet[2] <= target[2]) {
                one = true
            }
            if (!two && triplet[0] <= target[0] && triplet[1] == target[1] && triplet[2] <= target[2]) {
                two = true
            }
            if (!three && triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2] == target[2]) {
                three = true
            }
            if (one && two && three) {
                return true
            }
        }
        return false
    }
}
