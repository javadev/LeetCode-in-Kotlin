package g1801_1900.s1893_check_if_all_the_integers_in_a_range_are_covered

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isCovered() {
        assertThat(
            Solution().isCovered(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6)), 2, 5),
            equalTo(true)
        )
    }

    @Test
    fun isCovered2() {
        assertThat(
            Solution().isCovered(arrayOf(intArrayOf(1, 10), intArrayOf(10, 20)), 21, 21),
            equalTo(false)
        )
    }
}
