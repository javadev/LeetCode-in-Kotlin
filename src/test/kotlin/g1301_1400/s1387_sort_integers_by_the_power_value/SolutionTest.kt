package g1301_1400.s1387_sort_integers_by_the_power_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kth() {
        assertThat(Solution().getKth(12, 15, 2), equalTo(13))
    }

    @Test
    fun kth2() {
        assertThat(Solution().getKth(7, 11, 4), equalTo(7))
    }
}
