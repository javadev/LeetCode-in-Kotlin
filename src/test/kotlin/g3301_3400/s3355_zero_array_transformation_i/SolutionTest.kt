package g3301_3400.s3355_zero_array_transformation_i

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isZeroArray() {
        assertThat<Boolean>(
            Solution()
                .isZeroArray(intArrayOf(1, 0, 1), arrayOf<IntArray>(intArrayOf(0, 2))),
            CoreMatchers.equalTo<Boolean>(true),
        )
    }

    @Test
    fun isZeroArray2() {
        assertThat<Boolean>(
            Solution().isZeroArray(
                intArrayOf(4, 3, 2, 1),
                arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(0, 2)),
            ),
            CoreMatchers.equalTo<Boolean>(false),
        )
    }

    @Test
    fun isZeroArray3() {
        assertThat<Boolean>(
            Solution().isZeroArray(
                intArrayOf(-1, 0, 1),
                arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(0, 2)),
            ),
            CoreMatchers.equalTo<Boolean>(true),
        )
    }
}
