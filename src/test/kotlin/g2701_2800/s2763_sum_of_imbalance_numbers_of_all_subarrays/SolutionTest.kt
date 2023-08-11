package g2701_2800.s2763_sum_of_imbalance_numbers_of_all_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumImbalanceNumbers() {
        assertThat(Solution().sumImbalanceNumbers(intArrayOf(2, 3, 1, 4)), equalTo(3))
    }

    @Test
    fun sumImbalanceNumbers2() {
        assertThat(Solution().sumImbalanceNumbers(intArrayOf(1, 3, 3, 3, 5)), equalTo(8))
    }
}
