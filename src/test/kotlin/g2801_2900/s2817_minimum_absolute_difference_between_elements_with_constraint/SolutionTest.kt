package g2801_2900.s2817_minimum_absolute_difference_between_elements_with_constraint

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

// #Medium #Array #Binary_Search #Ordered_Set
internal class SolutionTest {
    @Test
    fun minAbsoluteDifference() {
        assertThat(
            Solution().minAbsoluteDifference(mutableListOf(4, 3, 2, 4), 2),
            equalTo(0)
        )
    }

    @Test
    fun minAbsoluteDifference2() {
        assertThat(
            Solution().minAbsoluteDifference(mutableListOf(5, 3, 2, 10, 15), 1),
            equalTo(1)
        )
    }

    @Test
    fun minAbsoluteDifference3() {
        assertThat(
            Solution().minAbsoluteDifference(mutableListOf(1, 2, 3, 4), 3),
            equalTo(3)
        )
    }
}
