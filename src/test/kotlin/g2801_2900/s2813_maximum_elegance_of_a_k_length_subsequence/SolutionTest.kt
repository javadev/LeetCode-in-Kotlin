package g2801_2900.s2813_maximum_elegance_of_a_k_length_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaximumElegance() {
        assertThat(
            Solution().findMaximumElegance(arrayOf(intArrayOf(3, 2), intArrayOf(5, 1), intArrayOf(10, 1)), 2),
            equalTo(17L),
        )
    }

    @Test
    fun findMaximumElegance2() {
        assertThat(
            Solution().findMaximumElegance(
                arrayOf(
                    intArrayOf(3, 1),
                    intArrayOf(3, 1),
                    intArrayOf(2, 2),
                    intArrayOf(5, 3),
                ),
                3,
            ),
            equalTo(19L),
        )
    }

    @Test
    fun findMaximumElegance3() {
        assertThat(
            Solution().findMaximumElegance(arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(3, 1)), 3),
            equalTo(7L),
        )
    }
}
