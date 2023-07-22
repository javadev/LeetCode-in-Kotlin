package g1801_1900.s1860_incremental_memory_leak

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun memLeak() {
        assertThat(Solution().memLeak(2, 2), equalTo(intArrayOf(3, 1, 0)))
    }

    @Test
    fun memLeak2() {
        assertThat(Solution().memLeak(8, 11), equalTo(intArrayOf(6, 0, 4)))
    }
}
