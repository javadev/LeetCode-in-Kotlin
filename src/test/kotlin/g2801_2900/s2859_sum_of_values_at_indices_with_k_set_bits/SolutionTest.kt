package g2801_2900.s2859_sum_of_values_at_indices_with_k_set_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumIndicesWithKSetBits() {
        assertThat(
            Solution().sumIndicesWithKSetBits(mutableListOf(5, 10, 1, 5, 2), 1),
            equalTo(13),
        )
    }

    @Test
    fun sumIndicesWithKSetBits2() {
        assertThat(
            Solution().sumIndicesWithKSetBits(mutableListOf(4, 3, 2, 1), 2),
            equalTo(1),
        )
    }
}
