package g3801_3900.s3833_count_dominant_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dominantIndices() {
        assertThat<Int>(Solution().dominantIndices(intArrayOf(5, 4, 3)), equalTo<Int>(2))
    }

    @Test
    fun dominantIndices2() {
        assertThat<Int>(Solution().dominantIndices(intArrayOf(4, 1, 2)), equalTo<Int>(1))
    }
}
