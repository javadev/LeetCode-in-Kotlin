package g2101_2200.s2125_number_of_laser_beams_in_a_bank

// #Medium #Array #String #Math #Matrix
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
