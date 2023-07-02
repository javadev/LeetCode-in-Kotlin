package g2301_2400.s2366_minimum_replacements_to_sort_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumReplacement() {
        assertThat(Solution().minimumReplacement(intArrayOf(3, 9, 3)), equalTo(2L))
    }

    @Test
    fun minimumReplacement2() {
        assertThat(Solution().minimumReplacement(intArrayOf(1, 2, 3, 4, 5)), equalTo(0L))
    }
}
