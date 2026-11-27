package g4001_4100.s4037_maximum_valid_split_positions_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValidSplits() {
        assertThat<Int>(Solution().maxValidSplits(intArrayOf(2, 4, 6)), equalTo<Int>(1))
    }

    @Test
    fun maxValidSplits2() {
        assertThat<Int>(Solution().maxValidSplits(intArrayOf(3, 3, 3)), equalTo<Int>(2))
    }

    @Test
    fun maxValidSplits3() {
        assertThat<Int>(Solution().maxValidSplits(intArrayOf(5)), equalTo<Int>(0))
    }
}
