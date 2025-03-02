package g3401_3500.s3470_permutations_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun permute() {
        assertThat<IntArray>(
            Solution().permute(4, 6L),
            equalTo<IntArray>(intArrayOf(3, 4, 1, 2)),
        )
    }

    @Test
    fun permute2() {
        assertThat<IntArray>(
            Solution().permute(3, 2L),
            equalTo<IntArray>(intArrayOf(3, 2, 1)),
        )
    }

    @Test
    fun permute3() {
        assertThat<IntArray>(Solution().permute(2, 3L), equalTo<IntArray>(intArrayOf()))
    }

    @Test
    fun permute4() {
        assertThat<IntArray>(
            Solution().permute(43, 142570305460935L),
            equalTo<IntArray>(
                intArrayOf(
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                    21, 22, 43, 40, 27, 36, 25, 34, 31, 32, 29, 28, 33, 24, 23, 26, 41, 42,
                    35, 38, 37, 30, 39,
                ),
            ),
        )
    }
}
