package g1601_1700.s1679_max_number_of_k_sum_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxOperations() {
        assertThat(Solution().maxOperations(intArrayOf(1, 2, 3, 4), 5), equalTo(2))
    }

    @Test
    fun maxOperations2() {
        assertThat(Solution().maxOperations(intArrayOf(3, 1, 3, 4, 3), 6), equalTo(1))
    }
}
