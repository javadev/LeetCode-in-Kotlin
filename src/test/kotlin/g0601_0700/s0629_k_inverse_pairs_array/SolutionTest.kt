package g0601_0700.s0629_k_inverse_pairs_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kInversePairs() {
        assertThat(Solution().kInversePairs(3, 0), equalTo(1))
    }

    @Test
    fun kInversePairs2() {
        assertThat(Solution().kInversePairs(3, 1), equalTo(2))
    }
}
