package g2101_2200.s2151_maximum_good_people_based_on_statements

// #Hard #Array #Bit_Manipulation #Backtracking #Enumeration
// #2023_06_26_Time_308_ms_(100.00%)_Space_46.3_MB_(100.00%)

class Solution {
    fun maximumGood(statements: Array<IntArray>): Int {
        val known = IntArray(statements.size)
        known.fill(2)
        return max(statements, known, 0)
    }

    private fun max(statements: Array<IntArray>, known: IntArray, position: Int): Int {
        return if (position == statements.size) {
            known.asSequence().filter { a: Int -> a == 1 }.count()
        } else {
            when (known[position]) {
                0 -> assumeBad(statements, known, position)
                1 -> assumeGood(statements, known, position)
                else -> Math.max(
                    assumeBad(statements, known, position),
                    assumeGood(statements, known, position),
                )
            }
        }
    }

    private fun assumeBad(statements: Array<IntArray>, known: IntArray, position: Int): Int {
        val updatedKnown = known.clone()
        updatedKnown[position] = 0
        return max(statements, updatedKnown, position + 1)
    }

    private fun assumeGood(statements: Array<IntArray>, known: IntArray, position: Int): Int {
        val updatedKnown = known.clone()
        var conflictDetected = false
        updatedKnown[position] = 1
        for (i in statements[position].indices) {
            val answer = statements[position][i]
            if (answer != 2) {
                if (known[i] != 2 && answer != known[i]) {
                    conflictDetected = true
                    break
                }
                updatedKnown[i] = answer
            }
        }
        return if (conflictDetected) 0 else max(statements, updatedKnown, position + 1)
    }
}
