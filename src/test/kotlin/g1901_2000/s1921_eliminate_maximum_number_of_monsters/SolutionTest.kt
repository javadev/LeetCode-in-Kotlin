package g1901_2000.s1921_eliminate_maximum_number_of_monsters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun eliminateMaximum() {
        assertThat(
            Solution().eliminateMaximum(intArrayOf(1, 3, 4), intArrayOf(1, 1, 1)),
            equalTo(3),
        )
    }

    @Test
    fun eliminateMaximum2() {
        assertThat(
            Solution().eliminateMaximum(intArrayOf(1, 1, 2, 3), intArrayOf(1, 1, 1, 1)),
            equalTo(1),
        )
    }

    @Test
    fun eliminateMaximum3() {
        assertThat(
            Solution().eliminateMaximum(intArrayOf(3, 2, 4), intArrayOf(5, 3, 2)),
            equalTo(1),
        )
    }
}
