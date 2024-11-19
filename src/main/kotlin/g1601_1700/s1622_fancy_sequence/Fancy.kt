package g1601_1700.s1622_fancy_sequence

// #Hard #Math #Design #Segment_Tree #2023_06_16_Time_1050_ms_(100.00%)_Space_113.1_MB_(100.00%)

class Fancy {
    private var values = IntArray(8)
    private var add: Long = 0
    private var mult: Long = 1
    private var rMult: Long = 1
    private var size = 0
    private var inverses = cache()
    fun append(`val`: Int) {
        val result = (`val` - add + MOD) * rMult % MOD
        if (size >= values.size) {
            values = values.copyOf(size + (size shl 1))
        }
        values[size++] = result.toInt()
    }

    fun addAll(inc: Int) {
        add = (add + inc) % MOD
    }

    fun multAll(m: Int) {
        mult = mult * m % MOD
        add = add * m % MOD
        rMult = rMult * inverses[m] % MOD
    }

    fun getIndex(idx: Int): Int {
        return if (idx >= size) {
            -1
        } else {
            ((mult * values[idx] + add) % MOD).toInt()
        }
    }

    private fun multiplicativeInverse(x: Int): Int {
        var y: Long = 1
        val m = MOD.toLong() - 2
        var p = x.toLong()
        var i = 0
        while (1L shl i < m) {
            if (m shr i and 1L == 1L) {
                y = y * p % MOD
            }
            i++
            p = p * p % MOD
        }
        return y.toInt()
    }

    private fun cache(): IntArray {
        inverses = IntArray(101)
        inverses[0] = 0
        inverses[1] = 1
        for (i in 2 until inverses.size) {
            inverses[i] = multiplicativeInverse(i)
        }
        return inverses
    }

    companion object {
        private const val MOD = 1000000007
    }
}
