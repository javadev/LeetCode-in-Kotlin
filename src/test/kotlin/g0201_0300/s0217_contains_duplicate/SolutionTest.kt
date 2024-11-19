package g0201_0300.s0217_contains_duplicate

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsDuplicate() {
        assertThat(Solution().containsDuplicate(intArrayOf(1, 2, 3, 1)), equalTo(true))
    }

    @Test
    fun containsDuplicate2() {
        assertThat(Solution().containsDuplicate(intArrayOf(1, 2, 3, 4)), equalTo(false))
    }

    @Test
    fun containsDuplicate3() {
        assertThat(
            Solution().containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)),
            equalTo(true),
        )
    }
}
