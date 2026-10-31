package g3701_3800.s3796_find_maximum_value_in_a_constrained_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxVal() {
        assertThat<Int>(
            Solution()
                .findMaxVal(
                    10,
                    arrayOf<IntArray>(intArrayOf(3, 1), intArrayOf(8, 1)),
                    intArrayOf(2, 2, 3, 1, 4, 5, 1, 1, 2),
                ),
            equalTo<Int>(6),
        )
    }

    @Test
    fun findMaxVal2() {
        assertThat<Int>(
            Solution().findMaxVal(8, arrayOf<IntArray>(intArrayOf(3, 2)), intArrayOf(3, 5, 2, 4, 2, 3, 1)),
            equalTo<Int>(12),
        )
    }
}
