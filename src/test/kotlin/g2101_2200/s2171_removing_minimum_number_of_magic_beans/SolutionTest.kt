package g2101_2200.s2171_removing_minimum_number_of_magic_beans

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumRemoval() {
        MatcherAssert.assertThat(Solution().minimumRemoval(intArrayOf(4, 1, 6, 5)), CoreMatchers.equalTo(4L))
    }

    @Test
    fun minimumRemoval2() {
        MatcherAssert.assertThat(Solution().minimumRemoval(intArrayOf(2, 10, 3, 2)), CoreMatchers.equalTo(7L))
    }
}
