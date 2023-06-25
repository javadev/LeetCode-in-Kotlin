package g2101_2200.s2125_number_of_laser_beams_in_a_bank

// #Medium #Array #String #Math #Matrix #2023_06_25_Time_297_ms_(100.00%)_Space_40.7_MB_(100.00%)

class Solution {
    fun numberOfBeams(bank: Array<String>): Int {
        var beam = 0
        var prev = 0
        for (s in bank) {
            var nos = 0
            for (j in s.toCharArray()) {
                if (j == '1') {
                    nos++
                }
            }
            if (nos > 0) {
                if (prev == 0) {
                    prev = nos
                } else {
                    beam += prev * nos
                    prev = nos
                }
            }
        }
        return beam
    }
}
