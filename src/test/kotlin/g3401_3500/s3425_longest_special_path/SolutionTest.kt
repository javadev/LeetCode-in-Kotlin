package g3401_3500.s3425_longest_special_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSpecialPath() {
        assertThat<IntArray>(
            Solution()
                .longestSpecialPath(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 2),
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 5),
                        intArrayOf(1, 4, 4),
                        intArrayOf(2, 5, 6),
                    ),
                    intArrayOf(2, 1, 2, 1, 3, 1),
                ),
            equalTo<IntArray>(intArrayOf(6, 2)),
        )
    }

    @Test
    fun longestSpecialPath2() {
        assertThat<IntArray>(
            Solution().longestSpecialPath(arrayOf<IntArray>(intArrayOf(1, 0, 8)), intArrayOf(2, 2)),
            equalTo<IntArray>(intArrayOf(0, 1)),
        )
    }
}
