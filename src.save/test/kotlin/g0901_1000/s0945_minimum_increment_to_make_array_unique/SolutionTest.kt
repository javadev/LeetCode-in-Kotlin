package g0901_1000.s0945_minimum_increment_to_make_array_unique

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minIncrementForUnique() {
        assertThat(Solution().minIncrementForUnique(intArrayOf(1, 2, 2)), equalTo(1))
    }

    @Test
    fun minIncrementForUnique2() {
        assertThat(Solution().minIncrementForUnique(intArrayOf(3, 2, 1, 2, 1, 7)), equalTo(6))
    }
}
