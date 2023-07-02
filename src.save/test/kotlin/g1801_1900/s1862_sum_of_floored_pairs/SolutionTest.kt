package g1801_1900.s1862_sum_of_floored_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfFlooredPairs() {
        assertThat(Solution().sumOfFlooredPairs(intArrayOf(2, 5, 9)), equalTo(10))
    }

    @Test
    fun sumOfFlooredPairs2() {
        assertThat(
            Solution().sumOfFlooredPairs(intArrayOf(7, 7, 7, 7, 7, 7, 7)),
            equalTo(49)
        )
    }
}
