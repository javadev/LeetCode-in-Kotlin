package g2001_2100.s2097_valid_arrangement_of_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validArrangement() {
        assertThat(
            Solution().validArrangement(
                arrayOf(
                    intArrayOf(5, 1),
                    intArrayOf(4, 5),
                    intArrayOf(11, 9),
                    intArrayOf(9, 4),
                ),
            ),
            equalTo(arrayOf(intArrayOf(11, 9), intArrayOf(9, 4), intArrayOf(4, 5), intArrayOf(5, 1))),
        )
    }

    @Test
    fun validArrangement2() {
        assertThat(
            Solution().validArrangement(arrayOf(intArrayOf(1, 3), intArrayOf(3, 2), intArrayOf(2, 1))),
            equalTo(arrayOf(intArrayOf(3, 2), intArrayOf(2, 1), intArrayOf(1, 3))),
        )
    }

    @Test
    fun validArrangement3() {
        assertThat(
            Solution().validArrangement(arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 1))),
            equalTo(arrayOf(intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(1, 3))),
        )
    }
}
