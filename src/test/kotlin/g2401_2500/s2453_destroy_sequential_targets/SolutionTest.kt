package g2401_2500.s2453_destroy_sequential_targets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun destroyTargets() {
        assertThat(Solution().destroyTargets(intArrayOf(3, 7, 8, 1, 1, 5), 2), equalTo(1))
    }

    @Test
    fun destroyTargets2() {
        assertThat(Solution().destroyTargets(intArrayOf(1, 3, 5, 2, 4, 6), 2), equalTo(1))
    }

    @Test
    fun destroyTargets3() {
        assertThat(Solution().destroyTargets(intArrayOf(6, 2, 5), 100), equalTo(2))
    }
}
