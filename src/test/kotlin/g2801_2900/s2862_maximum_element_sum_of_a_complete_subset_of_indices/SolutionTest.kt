package g2801_2900.s2862_maximum_element_sum_of_a_complete_subset_of_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSum() {
        assertThat(
            Solution().maximumSum(mutableListOf(8, 7, 3, 5, 7, 2, 4, 9)),
            equalTo(16L),
        )
    }

    @Test
    fun maximumSum2() {
        assertThat(
            Solution().maximumSum(mutableListOf(5, 10, 3, 10, 1, 13, 7, 9, 4)),
            equalTo(19L),
        )
    }
}
