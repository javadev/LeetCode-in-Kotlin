package g3501_3600.s3529_count_cells_in_overlapping_horizontal_and_vertical_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCells() {
        assertThat<Int>(
            Solution()
                .countCells(
                    arrayOf<CharArray>(
                        charArrayOf('a', 'a', 'c', 'c'),
                        charArrayOf('b', 'b', 'b', 'c'),
                        charArrayOf('a', 'a', 'b', 'a'),
                        charArrayOf('c', 'a', 'a', 'c'),
                        charArrayOf('a', 'a', 'c', 'c'),
                    ),
                    "abaca",
                ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countCells2() {
        assertThat<Int>(
            Solution()
                .countCells(
                    arrayOf<CharArray>(
                        charArrayOf('c', 'a', 'a', 'a'),
                        charArrayOf('a', 'a', 'b', 'a'),
                        charArrayOf('b', 'b', 'a', 'a'),
                        charArrayOf('a', 'a', 'b', 'a'),
                    ),
                    "aba",
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countCells3() {
        assertThat<Int>(
            Solution().countCells(arrayOf<CharArray>(charArrayOf('a')), "a"),
            equalTo<Int>(1),
        )
    }
}
