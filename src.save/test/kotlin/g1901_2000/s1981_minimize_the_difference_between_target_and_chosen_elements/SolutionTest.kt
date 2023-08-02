package g1901_2000.s1981_minimize_the_difference_between_target_and_chosen_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeTheDifference() {
        assertThat(
            Solution()
                .minimizeTheDifference(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 13),
            equalTo(0)
        )
    }

    @Test
    fun minimizeTheDifference2() {
        assertThat(
            Solution().minimizeTheDifference(arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3)), 100),
            equalTo(94)
        )
    }

    @Test
    fun minimizeTheDifference3() {
        assertThat(
            Solution().minimizeTheDifference(arrayOf(intArrayOf(1, 2, 9, 8, 7)), 6), equalTo(1)
        )
    }
}
