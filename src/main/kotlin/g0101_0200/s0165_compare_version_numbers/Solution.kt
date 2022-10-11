package g0101_0200.s0165_compare_version_numbers

// #Medium #String #Two_Pointers #2022_10_11_Time_144_ms_(100.00%)_Space_33.6_MB_(100.00%)

class Solution {
    fun compareVersion(version1: String, version2: String): Int {
        // acquire first number
        var numA = 0
        var i: Int
        i = 0
        while (i < version1.length) {
            val c = version1[i]
            numA = if (c == '.') {
                break
            } else {
                numA * 10 + (c.toInt() - 48)
            }
            i++
        }
        // acquire second number
        var numB = 0
        var j: Int
        j = 0
        while (j < version2.length) {
            val c = version2[j]
            numB = if (c == '.') {
                break
            } else {
                numB * 10 + (c.toInt() - 48)
            }
            j++
        }
        // compare
        return if (numA > numB) {
            1
        } else if (numA < numB) {
            -1
        } else {
            // equal
            var v1 = ""
            var v2 = ""
            if (i != version1.length) {
                v1 = version1.substring(i + 1)
            }
            if (j != version2.length) {
                v2 = version2.substring(j + 1)
            }
            // if both versions end here, they are equal
            if (v1 == "" && v2 == "") {
                0
            } else {
                compareVersion(v1, v2)
            }
        }
    }
}
