package g1601_1700.s1659_maximize_grid_happiness

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxGridHappiness() {
        assertThat(Solution().getMaxGridHappiness(2, 3, 1, 2), equalTo(240))
    }

    @Test
    fun maxGridHappiness2() {
        assertThat(Solution().getMaxGridHappiness(3, 1, 2, 1), equalTo(260))
    }

    @Test
    fun maxGridHappiness3() {
        assertThat(Solution().getMaxGridHappiness(2, 2, 4, 0), equalTo(240))
    }
}
