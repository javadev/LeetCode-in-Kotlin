package g3501_3600.s3550_smallest_index_with_digit_sum_equal_to_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestIndex() {
        assertThat<Int>(Solution().smallestIndex(intArrayOf(1, 3, 2)), equalTo<Int>(2))
    }

    @Test
    fun smallestIndex2() {
        assertThat<Int>(Solution().smallestIndex(intArrayOf(1, 10, 11)), equalTo<Int>(1))
    }

    @Test
    fun smallestIndex3() {
        assertThat<Int>(Solution().smallestIndex(intArrayOf(1, 2, 3)), equalTo<Int>(-1))
    }
}
