package g2101_2200.s2166_design_bitset

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class BitsetTest {
    @Test
    fun bitset() {
        // bitset = "00000".
        val bs = Bitset(5)
        // the value at idx = 3 is updated to 1, so bitset = "00010".
        bs.fix(3)
        // the value at idx = 1 is updated to 1, so bitset = "01010".
        bs.fix(1)
        // the value of each bit is flipped, so bitset = "10101".
        bs.flip()
        // return False, as not all values of the bitset are 1.
        bs.all()
        // the value at idx = 0 is updated to 0, so bitset = "00101".
        bs.unfix(0)
        // the value of each bit is flipped, so bitset = "11010".
        bs.flip()
        // return True, as there is at least 1 index with value 1.
        bs.one()
        // the value at idx = 0 is updated to 0, so bitset = "01010".
        bs.unfix(0)
        // return 2, as there are 2 bits with value 1.
        MatcherAssert.assertThat(bs.count(), CoreMatchers.equalTo(2))
        // return "01010", which is the composition of bitset.
        MatcherAssert.assertThat(bs.toString(), CoreMatchers.equalTo("01010"))
    }
}
