package g3401_3500.s3454_separate_squares_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun separateSquares() {
        MatcherAssert.assertThat<Double>(
            Solution().separateSquares(arrayOf<IntArray>(intArrayOf(0, 0, 1), intArrayOf(2, 2, 1))),
            CoreMatchers.equalTo<Double>(1.0),
        )
    }

    @Test
    fun separateSquares2() {
        MatcherAssert.assertThat<Double>(
            Solution().separateSquares(arrayOf<IntArray>(intArrayOf(0, 0, 2), intArrayOf(1, 1, 1))),
            CoreMatchers.equalTo<Double>(1.0),
        )
    }
}
