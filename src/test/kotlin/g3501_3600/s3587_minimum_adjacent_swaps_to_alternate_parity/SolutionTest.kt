package g3501_3600.s3587_minimum_adjacent_swaps_to_alternate_parity

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(2, 4, 6, 5, 7)), equalTo<Int>(3))
    }

    @Test
    fun minSwaps2() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(2, 4, 5, 7)), equalTo<Int>(1))
    }

    @Test
    fun minSwaps3() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(1, 2, 3)), equalTo<Int>(0))
    }

    @Test
    fun minSwaps4() {
        assertThat<Int>(Solution().minSwaps(intArrayOf(4, 5, 6, 8)), equalTo<Int>(-1))
    }
}
