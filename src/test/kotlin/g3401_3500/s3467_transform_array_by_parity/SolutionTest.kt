package g3401_3500.s3467_transform_array_by_parity

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun transformArray() {
        assertThat<IntArray>(
            Solution().transformArray(intArrayOf(4, 3, 2, 1)),
            equalTo<IntArray>(intArrayOf(0, 0, 1, 1)),
        )
    }

    @Test
    fun transformArray2() {
        assertThat<IntArray>(
            Solution().transformArray(intArrayOf(1, 5, 1, 4, 2)),
            equalTo<IntArray>(intArrayOf(0, 0, 1, 1, 1)),
        )
    }
}
