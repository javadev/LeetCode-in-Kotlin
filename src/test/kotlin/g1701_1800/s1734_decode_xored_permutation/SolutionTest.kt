package g1701_1800.s1734_decode_xored_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decode() {
        assertThat(Solution().decode(intArrayOf(3, 1)), equalTo(intArrayOf(1, 2, 3)))
    }

    @Test
    fun decode2() {
        assertThat(
            Solution().decode(intArrayOf(6, 5, 4, 6)),
            equalTo(intArrayOf(2, 4, 1, 5, 3)),
        )
    }
}
