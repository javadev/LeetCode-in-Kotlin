package g2901_3000.s2933_high_access_employees

// #Medium #Array #String #Hash_Table #Sorting
// #2024_01_03_Time_304_ms_(91.67%)_Space_39.6_MB_(95.83%)

class Solution {
    private fun isPossible(a: Int, b: Int): Boolean {
        val hb = b / 100
        val ha = a / 100
        var mind = b % 100
        val mina = a % 100
        if (hb == 23 && ha == 0) {
            return false
        }
        if (hb - ha > 1) {
            return false
        }
        if (hb - ha == 1) {
            mind += 60
        }
        return mind - mina < 60
    }

    private fun isHighAccess(list: List<Int>): Boolean {
        if (list.size < 3) {
            return false
        }
        var i = 0
        var j = 1
        var k = 2
        while (k < list.size) {
            val a = list[i++]
            val b = list[j++]
            val c = list[k++]
            if (isPossible(a, c) && isPossible(b, c) && isPossible(a, b)) {
                return true
            }
        }
        return false
    }

    private fun stringToInt(str: String): Int {
        var i = 1000
        var `val` = 0
        for (ch in str.toCharArray()) {
            val n = ch.code - '0'.code
            `val` += i * n
            i = i / 10
        }
        return `val`
    }

    fun findHighAccessEmployees(accessTimes: List<List<String>>): List<String> {
        val map = HashMap<String, MutableList<Int>>()
        for (list in accessTimes) {
            val temp = map.getOrDefault(list[0], ArrayList())
            val `val` = stringToInt(list[1])
            temp.add(`val`)
            map[list[0]] = temp
        }
        val ans: MutableList<String> = ArrayList()
        for ((key, temp) in map) {
            temp.sort()
            if (isHighAccess(temp)) {
                ans.add(key)
            }
        }
        return ans
    }
}
