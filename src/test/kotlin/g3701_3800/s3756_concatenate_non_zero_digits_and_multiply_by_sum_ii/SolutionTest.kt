package g3701_3800.s3756_concatenate_non_zero_digits_and_multiply_by_sum_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumAndMultiply() {
        assertThat<IntArray>(
            Solution().sumAndMultiply(
                "10203004",
                arrayOf<IntArray>(intArrayOf(0, 7), intArrayOf(1, 3), intArrayOf(4, 6)),
            ),
            equalTo<IntArray>(intArrayOf(12340, 4, 9)),
        )
    }

    @Test
    fun sumAndMultiply2() {
        assertThat<IntArray>(
            Solution().sumAndMultiply("1000", arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(1, 1))),
            equalTo<IntArray>(intArrayOf(1, 0)),
        )
    }

    @Test
    fun sumAndMultiply3() {
        assertThat<IntArray>(
            Solution().sumAndMultiply("9876543210", arrayOf<IntArray>(intArrayOf(0, 9))),
            equalTo<IntArray>(intArrayOf(444444137)),
        )
    }
}
