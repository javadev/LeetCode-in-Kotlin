package g1401_1500.s1470_shuffle_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shuffle() {
        assertThat(
            Solution().shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3),
            equalTo(intArrayOf(2, 3, 5, 4, 1, 7))
        )
    }

    @Test
    fun shuffle2() {
        assertThat(
            Solution().shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4),
            equalTo(intArrayOf(1, 4, 2, 3, 3, 2, 4, 1))
        )
    }

    @Test
    fun shuffle3() {
        assertThat(
            Solution().shuffle(intArrayOf(1, 1, 2, 2), 2), equalTo(intArrayOf(1, 2, 1, 2))
        )
    }
}
