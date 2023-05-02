package g0901_1000.s0954_array_of_doubled_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canReorderDoubled() {
        assertThat(Solution().canReorderDoubled(intArrayOf(3, 1, 3, 6)), equalTo(false))
    }

    @Test
    fun canReorderDoubled2() {
        assertThat(Solution().canReorderDoubled(intArrayOf(2, 1, 2, 6)), equalTo(false))
    }

    @Test
    fun canReorderDoubled3() {
        assertThat(Solution().canReorderDoubled(intArrayOf(4, -2, 2, -4)), equalTo(true))
    }
}
