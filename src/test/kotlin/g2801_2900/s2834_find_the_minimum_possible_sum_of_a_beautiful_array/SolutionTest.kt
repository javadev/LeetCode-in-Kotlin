package g2801_2900.s2834_find_the_minimum_possible_sum_of_a_beautiful_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumPossibleSum() {
        assertThat(Solution().minimumPossibleSum(2, 3), equalTo(4))
    }

    @Test
    fun minimumPossibleSum2() {
        assertThat(Solution().minimumPossibleSum(3, 3), equalTo(8))
    }

    @Test
    fun minimumPossibleSum3() {
        assertThat(Solution().minimumPossibleSum(1, 1), equalTo(1))
    }
}
