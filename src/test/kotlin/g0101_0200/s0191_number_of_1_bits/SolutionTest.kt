package g0101_0200.s0191_number_of_1_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hammingWeight() {
        assertThat(Solution().hammingWeight(11), equalTo(3))
    }

    @Test
    fun hammingWeight2() {
        assertThat(Solution().hammingWeight(128), equalTo(1))
    }
}
