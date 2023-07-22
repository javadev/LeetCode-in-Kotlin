package g2201_2300.s2216_minimum_deletions_to_make_array_beautiful

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDeletion() {
        assertThat(Solution().minDeletion(intArrayOf(1, 1, 2, 3, 5)), equalTo(1))
    }

    @Test
    fun minDeletion2() {
        assertThat(Solution().minDeletion(intArrayOf(1, 1, 2, 2, 3, 3)), equalTo(2))
    }
}
