package g3901_4000.s3936_minimum_swaps_to_move_zeros_to_end

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSwaps() {
        assertThat<Int>(
            Solution().minimumSwaps(intArrayOf(0, 1, 0, 3, 12)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minimumSwaps2() {
        assertThat<Int>(Solution().minimumSwaps(intArrayOf(0, 1, 0, 2)), equalTo<Int>(1))
    }

    @Test
    fun minimumSwaps3() {
        assertThat<Int>(Solution().minimumSwaps(intArrayOf(1, 2, 0)), equalTo<Int>(0))
    }

    @Test
    fun minimumSwaps4() {
        assertThat<Int>(Solution().minimumSwaps(intArrayOf(0)), equalTo<Int>(0))
    }

    @Test
    fun minimumSwaps5() {
        assertThat<Int>(Solution().minimumSwaps(intArrayOf(1, 2, 3)), equalTo<Int>(0))
    }

    @Test
    fun minimumSwaps6() {
        assertThat<Int>(Solution().minimumSwaps(intArrayOf(0, 0, 0)), equalTo<Int>(0))
    }

    @Test
    fun minimumSwaps7() {
        assertThat<Int>(Solution().minimumSwaps(intArrayOf(0, 0, 1, 2)), equalTo<Int>(2))
    }
}
