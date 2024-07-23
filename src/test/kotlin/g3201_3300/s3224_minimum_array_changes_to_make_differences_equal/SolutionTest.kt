package g3201_3300.s3224_minimum_array_changes_to_make_differences_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minChanges() {
        assertThat(Solution().minChanges(intArrayOf(1, 0, 1, 2, 4, 3), 4), equalTo(2))
    }

    @Test
    fun minChanges2() {
        assertThat(Solution().minChanges(intArrayOf(0, 1, 2, 3, 3, 6, 5, 4), 6), equalTo(2))
    }
}
