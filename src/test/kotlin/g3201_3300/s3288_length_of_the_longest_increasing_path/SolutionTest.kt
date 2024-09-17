package g3201_3300.s3288_length_of_the_longest_increasing_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPathLength() {
        assertThat<Int?>(
            Solution()
                .maxPathLength(
                    arrayOf<IntArray>(
                        intArrayOf(3, 1),
                        intArrayOf(2, 2),
                        intArrayOf(4, 1),
                        intArrayOf(0, 0),
                        intArrayOf(5, 3)
                    ),
                    1
                ),
            equalTo<Int?>(3)
        )
    }

    @Test
    fun maxPathLength2() {
        assertThat<Int?>(
            Solution().maxPathLength(arrayOf<IntArray>(intArrayOf(2, 1), intArrayOf(7, 0), intArrayOf(5, 6)), 2),
            equalTo<Int?>(2)
        )
    }

    @Test
    fun maxPathLength3() {
        assertThat<Int?>(
            Solution().maxPathLength(arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(8, 5), intArrayOf(6, 8)), 0),
            equalTo<Int?>(2)
        )
    }

    @Test
    fun maxPathLength4() {
        assertThat<Int?>(
            Solution().maxPathLength(
                arrayOf<IntArray>(
                    intArrayOf(8, 8),
                    intArrayOf(7, 0),
                    intArrayOf(5, 6),
                    intArrayOf(9, 1)
                ),
                0
            ),
            equalTo<Int?>(2)
        )
    }

    @Test
    fun maxPathLength5() {
        assertThat<Int?>(
            Solution()
                .maxPathLength(
                    arrayOf<IntArray>(
                        intArrayOf(1, 1),
                        intArrayOf(0, 1),
                        intArrayOf(5, 4),
                        intArrayOf(3, 3),
                        intArrayOf(2, 0),
                        intArrayOf(1, 4),
                        intArrayOf(6, 8)
                    ),
                    6
                ),
            equalTo<Int?>(4)
        )
    }
}
