package g3301_3400.s3393_count_paths_with_the_given_xor_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPathsWithXorValue() {
        assertThat<Int>(
            Solution()
                .countPathsWithXorValue(
                    arrayOf<IntArray>(intArrayOf(2, 1, 5), intArrayOf(7, 10, 0), intArrayOf(12, 6, 4)),
                    11,
                ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun countPathsWithXorValue2() {
        assertThat<Int>(
            Solution()
                .countPathsWithXorValue(
                    arrayOf<IntArray>(intArrayOf(1, 3, 3, 3), intArrayOf(0, 3, 3, 2), intArrayOf(3, 0, 1, 1)),
                    2,
                ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun countPathsWithXorValue3() {
        assertThat<Int>(
            Solution()
                .countPathsWithXorValue(
                    arrayOf<IntArray>(intArrayOf(1, 1, 1, 2), intArrayOf(3, 0, 3, 2), intArrayOf(3, 0, 2, 2)),
                    10,
                ),
            equalTo<Int>(0),
        )
    }
}
