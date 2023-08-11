package g0501_0600.s0576_out_of_boundary_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPaths() {
        assertThat(Solution().findPaths(2, 2, 2, 0, 0), equalTo(6))
    }

    @Test
    fun findPaths2() {
        assertThat(Solution().findPaths(1, 3, 3, 0, 1), equalTo(12))
    }
}
