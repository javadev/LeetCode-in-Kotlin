package g0701_0800.s0726_number_of_atoms

// #Hard #String #Hash_Table #Sorting #Stack
// #2023_03_01_Time_149_ms_(100.00%)_Space_35.5_MB_(100.00%)

class Solution {
    data class Item(
        var title: String = "",
        var total: String = "",
        var count: Int = 0
    ) {
        fun getT(): String {
            return if (total == "") "1" else total
        }
    }

    fun countOfAtoms(formula: String): String {
        val set = arrayListOf<Item>()
        var current = Item()
        var open = 0
        var multiply = false
        var multiplier = ""
        fun multiplySet() {
            if (multiplier == "") {
                return
            }
            set.forEach {
                if (it.count > open) {
                    it.total = (it.getT().toInt() * multiplier.toInt()).toString()
                    it.count -= 1
                }
            }
            multiply = false
            multiplier = ""
        }
        formula.forEach {
            if (it !in '0'..'9') {
                multiplySet()
            }
            when (it) {
                in 'A'..'Z' -> {
                    current = Item()
                    set.add(current)
                    current.title = it.toString()
                    current.count = open
                    multiply = false
                }
                in 'a'..'z' -> {
                    current.title += it.toString()
                }
                '(' -> {
                    open++
                }
                ')' -> {
                    multiply = true
                    open--
                }
                in '0'..'9' -> {
                    if (multiply) {
                        multiplier += it.toString()
                    } else {
                        current.total += it.toString()
                    }
                }
                else -> {
                }
            }
        }
        if (multiply) {
            multiplySet()
        }
        var result = ""
        set.groupBy { it.title }.toSortedMap().forEach {
            var count = 0
            it.value.forEach { v ->
                count += v.getT().toInt()
            }
            val c = if (count <= 1) "" else count.toString()
            result += "${it.key}$c"
        }
        return result
    }
}
