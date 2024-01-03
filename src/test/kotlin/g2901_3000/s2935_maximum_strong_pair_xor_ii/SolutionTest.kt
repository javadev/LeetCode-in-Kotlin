package g2901_3000.s2935_maximum_strong_pair_xor_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumStrongPairXor() {
        assertThat(Solution().maximumStrongPairXor(intArrayOf(1, 2, 3, 4, 5)), equalTo(7))
    }

    @Test
    fun maximumStrongPairXor2() {
        assertThat(Solution().maximumStrongPairXor(intArrayOf(10, 100)), equalTo(0))
    }

    @Test
    fun maximumStrongPairXor3() {
        assertThat(
            Solution().maximumStrongPairXor(intArrayOf(500, 520, 2500, 3000)),
            equalTo(1020)
        )
    }
}
