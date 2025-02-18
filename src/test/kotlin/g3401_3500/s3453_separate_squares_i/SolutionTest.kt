package g3401_3500.s3453_separate_squares_i

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun separateSquares() {
        MatcherAssert.assertThat<Double>(
            Solution().separateSquares(arrayOf<IntArray>(intArrayOf(0, 0, 1), intArrayOf(2, 2, 1))),
            CoreMatchers.equalTo<Double>(1.0000000012083676),
        )
    }

    @Test
    fun separateSquares2() {
        MatcherAssert.assertThat<Double>(
            Solution().separateSquares(arrayOf<IntArray>(intArrayOf(0, 0, 2), intArrayOf(1, 1, 1))),
            CoreMatchers.equalTo<Double>(1.1666666677873083),
        )
    }
}
