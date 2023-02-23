package g0701_0800.s0704_binary_search

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun search() {
        assertThat(Solution().search(intArrayOf(-1, 0, 3, 5, 9, 12), 9), equalTo(4))
    }

    @Test
    fun search2() {
        assertThat(Solution().search(intArrayOf(-1, 0, 3, 5, 9, 12), 2), equalTo(-1))
    }
}
