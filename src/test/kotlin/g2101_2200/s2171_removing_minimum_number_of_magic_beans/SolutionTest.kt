package g2101_2200.s2171_removing_minimum_number_of_magic_beans

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumRemoval() {
        assertThat(Solution().minimumRemoval(intArrayOf(4, 1, 6, 5)), equalTo(4L))
    }

    @Test
    fun minimumRemoval2() {
        assertThat(Solution().minimumRemoval(intArrayOf(2, 10, 3, 2)), equalTo(7L))
    }
}
