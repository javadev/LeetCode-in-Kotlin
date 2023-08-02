package g2501_2600.s2525_categorize_box_according_to_criteria

// #Easy #Math #2023_07_04_Time_119_ms_(100.00%)_Space_33.2_MB_(100.00%)

class Solution {
    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
        val vol = length.toLong() * width * height
        var b = false
        var h = false
        if (length >= 10000 || width >= 10000 || height >= 10000 || vol >= 1000000000) {
            b = true
        }
        if (mass >= 100) {
            h = true
        }
        return if (b && h) {
            "Both"
        } else if (!b && !h) {
            "Neither"
        } else if (b) {
            "Bulky"
        } else {
            "Heavy"
        }
    }
}
