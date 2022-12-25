package g0001_0100.s0060_permutation_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getPermutation() {
        assertThat(Solution().getPermutation(3, 3), equalTo("213"))
    }

    @Test
    fun getPermutation2() {
        assertThat(Solution().getPermutation(4, 9), equalTo("2314"))
    }

    @Test
    fun getPermutation3() {
        assertThat(Solution().getPermutation(3, 1), equalTo("123"))
    }
}
