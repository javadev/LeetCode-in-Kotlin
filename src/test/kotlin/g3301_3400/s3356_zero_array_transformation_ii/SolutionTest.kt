package g3301_3400.s3356_zero_array_transformation_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minZeroArray() {
        assertThat<Int>(
            Solution()
                .minZeroArray(
                    intArrayOf(2, 0, 2),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(0, 2, 1), intArrayOf(1, 1, 3))
                ),
            equalTo<Int>(2)
        )
    }

    @Test
    fun minZeroArray2() {
        assertThat<Int>(
            Solution()
                .minZeroArray(intArrayOf(4, 3, 2, 1), arrayOf<IntArray>(intArrayOf(1, 3, 2), intArrayOf(0, 2, 1))),
            equalTo<Int>(-1)
        )
    }
}
