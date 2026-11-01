package g3801_3900.s3850_count_sequences_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSequences() {
        assertThat<Int>(Solution().countSequences(intArrayOf(2, 3, 2), 6), equalTo<Int>(2))
    }

    @Test
    fun countSequences2() {
        assertThat<Int>(Solution().countSequences(intArrayOf(4, 6, 3), 2), equalTo<Int>(2))
    }

    @Test
    fun countSequences3() {
        assertThat<Int>(Solution().countSequences(intArrayOf(1, 5), 1), equalTo<Int>(3))
    }
}
