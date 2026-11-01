package g3901_4000.s3917_count_indices_with_opposite_parity

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOppositeParity() {
        assertThat<IntArray>(
            Solution().countOppositeParity(intArrayOf(1, 2, 3, 4)),
            equalTo<IntArray?>(intArrayOf(2, 1, 1, 0)),
        )
    }

    @Test
    fun countOppositeParity2() {
        assertThat<IntArray>(
            Solution().countOppositeParity(intArrayOf(1)),
            equalTo<IntArray?>(intArrayOf(0)),
        )
    }
}
