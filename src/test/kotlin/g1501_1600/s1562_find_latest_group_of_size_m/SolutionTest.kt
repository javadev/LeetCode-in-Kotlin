package g1501_1600.s1562_find_latest_group_of_size_m

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLatestStep() {
        MatcherAssert.assertThat(Solution().findLatestStep(intArrayOf(3, 5, 1, 2, 4), 1), CoreMatchers.equalTo(4))
    }

    @Test
    fun findLatestStep2() {
        MatcherAssert.assertThat(Solution().findLatestStep(intArrayOf(3, 1, 5, 4, 2), 2), CoreMatchers.equalTo(-1))
    }
}
