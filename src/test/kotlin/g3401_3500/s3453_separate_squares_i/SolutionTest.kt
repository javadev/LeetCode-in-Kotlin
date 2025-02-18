package g3401_3500.s3453_separate_squares_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun separateSquares() {
        assertThat<Double>(
            Solution().separateSquares(arrayOf<IntArray>(intArrayOf(0, 0, 1), intArrayOf(2, 2, 1))),
            equalTo<Double>(1.0),
        )
    }

    @Test
    fun separateSquares2() {
        assertThat<Double>(
            Solution().separateSquares(arrayOf<IntArray>(intArrayOf(0, 0, 2), intArrayOf(1, 1, 1))),
            equalTo<Double>(1.1666666666666667),
        )
    }
}
