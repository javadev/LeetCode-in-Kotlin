package g0701_0800.s0747_largest_number_at_least_twice_of_others

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dominantIndex() {
        assertThat(Solution().dominantIndex(intArrayOf(3, 6, 1, 0)), equalTo(1))
    }

    @Test
    fun dominantIndex2() {
        assertThat(Solution().dominantIndex(intArrayOf(1, 2, 3, 4)), equalTo(-1))
    }

    @Test
    fun dominantIndex3() {
        assertThat(Solution().dominantIndex(intArrayOf(1)), equalTo(0))
    }
}
