package g3501_3600.s3524_find_x_value_of_array_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultArray() {
        assertThat<LongArray>(
            Solution().resultArray(intArrayOf(1, 2, 3, 4, 5), 3),
            equalTo<LongArray>(longArrayOf(9L, 2L, 4L)),
        )
    }

    @Test
    fun resultArray2() {
        assertThat<LongArray>(
            Solution().resultArray(intArrayOf(1, 2, 4, 8, 16, 32), 4),
            equalTo<LongArray>(longArrayOf(18L, 1L, 2L, 0L)),
        )
    }

    @Test
    fun resultArray3() {
        assertThat<LongArray>(
            Solution().resultArray(intArrayOf(1, 1, 2, 1, 1), 2),
            equalTo<LongArray>(longArrayOf(9L, 6L)),
        )
    }
}
