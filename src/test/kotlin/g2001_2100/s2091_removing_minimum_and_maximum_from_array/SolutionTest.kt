package g2001_2100.s2091_removing_minimum_and_maximum_from_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDeletions() {
        assertThat(
            Solution().minimumDeletions(intArrayOf(2, 10, 7, 5, 4, 1, 8, 6)),
            equalTo(5),
        )
    }

    @Test
    fun minimumDeletions2() {
        assertThat(
            Solution().minimumDeletions(intArrayOf(0, -4, 19, 1, 8, -2, -3, 5)),
            equalTo(3),
        )
    }

    @Test
    fun minimumDeletions3() {
        assertThat(Solution().minimumDeletions(intArrayOf(101)), equalTo(1))
    }
}
