package g2101_2200.s2103_rings_and_rods

// #Easy #String #Hash_Table
class Solution {
    fun countPoints(rings: String): Int {
        val redHashMap: MutableMap<Int, Int> = HashMap()
        val greenHashMap: MutableMap<Int, Int> = HashMap()
        val blueHashMap: MutableMap<Int, Int> = HashMap()
        run {
            var i = 0
            while (i <= rings.length - 2) {
                val charOne = rings[i]
                val charTwo = rings[i + 1]
                if (charOne == 'R') {
                    redHashMap[Character.getNumericValue(charTwo)] = 123
                } else if (charOne == 'G') {
                    greenHashMap[Character.getNumericValue(charTwo)] = 123
                } else {
                    blueHashMap[Character.getNumericValue(charTwo)] = 123
                }
                i = i + 2
            }
        }
        var result = 0
        for (i in 0..9) {
            if (redHashMap.containsKey(i) &&
                greenHashMap.containsKey(i) &&
                blueHashMap.containsKey(i)
            ) {
                result++
            }
        }
        return result
    }
}
