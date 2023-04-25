package g0001_0100.s0062_unique_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniquePaths() {
        assertThat(Solution().uniquePaths(3, 7), equalTo(28))
    }

    @Test
    fun uniquePaths2() {
        assertThat(Solution().uniquePaths(3, 2), equalTo(3))
    }
}
