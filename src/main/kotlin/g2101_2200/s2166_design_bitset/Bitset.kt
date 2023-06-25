package g2101_2200.s2166_design_bitset

// #Medium #Array #Hash_Table #Design
class Bitset(private val sz: Int) {
    private var bits: BooleanArray
    private var flipped: BooleanArray
    private var cnt = 0

    init {
        bits = BooleanArray(sz)
        flipped = BooleanArray(sz)
        flipped.fill(true)
    }

    fun fix(idx: Int) {
        if (!bits[idx]) {
            bits[idx] = bits[idx] xor true
            flipped[idx] = flipped[idx] xor true
            cnt += 1
        }
    }

    fun unfix(idx: Int) {
        if (bits[idx]) {
            bits[idx] = bits[idx] xor true
            flipped[idx] = flipped[idx] xor true
            cnt -= 1
        }
    }

    fun flip() {
        val tmp = bits
        bits = flipped
        flipped = tmp
        cnt = sz - cnt
    }

    fun all(): Boolean {
        return cnt == sz
    }

    fun one(): Boolean {
        return cnt > 0
    }

    fun count(): Int {
        return cnt
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (b in bits) {
            sb.append(if (b) '1' else '0')
        }
        return sb.toString()
    }
}
