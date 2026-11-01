package g3801_3900.s3872_longest_arithmetic_sequence_after_changing_at_most_one_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestArithmetic() {
        assertThat<Int>(
            Solution().longestArithmetic(intArrayOf(9, 7, 5, 10, 1)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun longestArithmetic2() {
        assertThat<Int>(
            Solution().longestArithmetic(intArrayOf(1, 2, 6, 7)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun longestArithmetic3() {
        assertThat<Int>(
            Solution().longestArithmetic(intArrayOf(1, 3, 5, 7)),
            equalTo<Int>(4),
        )
    }
}
