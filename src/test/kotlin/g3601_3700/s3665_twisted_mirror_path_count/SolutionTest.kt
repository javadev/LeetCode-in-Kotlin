package g3601_3700.s3665_twisted_mirror_path_count

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniquePaths() {
        assertThat<Int>(
            Solution().uniquePaths(arrayOf<IntArray>(intArrayOf(0, 1, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0, 0))),
            equalTo<Int>(5),
        )
    }

    @Test
    fun uniquePaths2() {
        assertThat<Int>(
            Solution().uniquePaths(arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(0, 0))),
            equalTo<Int>(2),
        )
    }

    @Test
    fun uniquePaths3() {
        assertThat<Int>(
            Solution().uniquePaths(
                arrayOf<IntArray>(
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 1, 0),
                ),
            ),
            equalTo<Int>(1),
        )
    }
}
