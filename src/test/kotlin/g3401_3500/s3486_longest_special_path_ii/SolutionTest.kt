package g3401_3500.s3486_longest_special_path_ii

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
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 1),
                        intArrayOf(2, 4, 6),
                        intArrayOf(4, 7, 2),
                        intArrayOf(3, 5, 2),
                        intArrayOf(3, 6, 5),
                        intArrayOf(6, 8, 3),
                    ),
                    intArrayOf(1, 1, 0, 3, 1, 2, 1, 1, 0),
                ),
            equalTo<IntArray>(intArrayOf(9, 3)),
        )
    }

    @Test
    fun longestSpecialPath2() {
        assertThat<IntArray>(
            Solution()
                .longestSpecialPath(
                    arrayOf<IntArray>(intArrayOf(1, 0, 3), intArrayOf(0, 2, 4), intArrayOf(0, 3, 5)),
                    intArrayOf(1, 1, 0, 2),
                ),
            equalTo<IntArray>(intArrayOf(5, 2)),
        )
    }

    @Test
    fun longestSpecialPath3() {
        assertThat<IntArray>(
            Solution()
                .longestSpecialPath(
                    arrayOf<IntArray>(intArrayOf(0, 2, 4), intArrayOf(1, 2, 10), intArrayOf(3, 1, 5)),
                    intArrayOf(4, 5, 4, 5),
                ),
            equalTo<IntArray>(intArrayOf(15, 3)),
        )
    }
}
