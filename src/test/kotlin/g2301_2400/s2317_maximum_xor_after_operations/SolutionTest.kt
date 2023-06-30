package g2301_2400.s2317_maximum_xor_after_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumXOR() {
        assertThat(Solution().maximumXOR(intArrayOf(3, 2, 4, 6)), equalTo(7))
    }

    @Test
    fun maximumXOR2() {
        assertThat(Solution().maximumXOR(intArrayOf(1, 2, 3, 9, 2)), equalTo(11))
    }
}
