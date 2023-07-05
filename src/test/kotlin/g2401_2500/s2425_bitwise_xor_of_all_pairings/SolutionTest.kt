package g2401_2500.s2425_bitwise_xor_of_all_pairings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorAllNums() {
        assertThat(
            Solution().xorAllNums(intArrayOf(2, 1, 3), intArrayOf(10, 2, 5, 0)),
            equalTo(13)
        )
    }

    @Test
    fun xorAllNums2() {
        assertThat(Solution().xorAllNums(intArrayOf(1, 2), intArrayOf(3, 4)), equalTo(0))
    }
}
