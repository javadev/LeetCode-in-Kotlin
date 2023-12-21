package g2801_2900.s2859_sum_of_values_at_indices_with_k_set_bits

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumIndicesWithKSetBits() {
        MatcherAssert.assertThat(
            Solution().sumIndicesWithKSetBits(mutableListOf(5, 10, 1, 5, 2), 1),
            CoreMatchers.equalTo(13)
        )
    }

    @Test
    fun sumIndicesWithKSetBits2() {
        MatcherAssert.assertThat(
            Solution().sumIndicesWithKSetBits(mutableListOf(4, 3, 2, 1), 2),
            CoreMatchers.equalTo(1)
        )
    }
}
