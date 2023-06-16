package g1601_1700.s1621_number_of_sets_of_k_non_overlapping_line_segments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSets() {
        assertThat(Solution().numberOfSets(4, 2), equalTo(5))
    }

    @Test
    fun numberOfSets2() {
        assertThat(Solution().numberOfSets(3, 1), equalTo(3))
    }

    @Test
    fun numberOfSets3() {
        assertThat(Solution().numberOfSets(30, 7), equalTo(796297179))
    }
}
