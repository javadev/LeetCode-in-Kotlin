package g3001_3100.s3072_distribute_elements_into_two_arrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultArray() {
        assertThat(
            Solution().resultArray(intArrayOf(2, 1, 3, 3)),
            equalTo(intArrayOf(2, 3, 1, 3))
        )
    }

    @Test
    fun resultArray2() {
        assertThat(
            Solution().resultArray(intArrayOf(5, 14, 3, 1, 2)),
            equalTo(intArrayOf(5, 3, 2, 14, 1))
        )
    }

    @Test
    fun resultArray3() {
        assertThat(
            Solution().resultArray(intArrayOf(3, 3, 3, 3)),
            equalTo(intArrayOf(3, 3, 3, 3))
        )
    }
}
