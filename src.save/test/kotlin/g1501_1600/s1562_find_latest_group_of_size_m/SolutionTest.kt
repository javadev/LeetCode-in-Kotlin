package g1501_1600.s1562_find_latest_group_of_size_m

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLatestStep() {
        assertThat(Solution().findLatestStep(intArrayOf(3, 5, 1, 2, 4), 1), equalTo(4))
    }

    @Test
    fun findLatestStep2() {
        assertThat(Solution().findLatestStep(intArrayOf(3, 1, 5, 4, 2), 2), equalTo(-1))
    }
}
