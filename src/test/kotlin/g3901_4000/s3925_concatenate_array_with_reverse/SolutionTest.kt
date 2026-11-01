package g3901_4000.s3925_concatenate_array_with_reverse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun concatWithReverse() {
        assertThat<IntArray>(
            Solution().concatWithReverse(intArrayOf(1, 2, 3)),
            equalTo<IntArray>(intArrayOf(1, 2, 3, 3, 2, 1)),
        )
    }

    @Test
    fun concatWithReverse2() {
        assertThat<IntArray>(
            Solution().concatWithReverse(intArrayOf(1)),
            equalTo<IntArray>(intArrayOf(1, 1)),
        )
    }

    @Test
    fun concatWithReverse3() {
        assertThat<IntArray>(
            Solution().concatWithReverse(intArrayOf(2, 2)),
            equalTo<IntArray>(intArrayOf(2, 2, 2, 2)),
        )
    }

    @Test
    fun concatWithReverse4() {
        assertThat<IntArray>(
            Solution().concatWithReverse(intArrayOf(100, 1)),
            equalTo<IntArray>(intArrayOf(100, 1, 1, 100)),
        )
    }
}
