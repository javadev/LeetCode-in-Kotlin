package g1901_2000.s1943_describe_the_painting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitPainting() {
        assertThat(
            Solution().splitPainting(arrayOf(intArrayOf(1, 4, 5), intArrayOf(4, 7, 7), intArrayOf(1, 7, 9))),
            equalTo(listOf(mutableListOf(1L, 4L, 14L), mutableListOf(4L, 7L, 16L))),
        )
    }

    @Test
    fun splitPainting2() {
        assertThat(
            Solution().splitPainting(arrayOf(intArrayOf(1, 7, 9), intArrayOf(6, 8, 15), intArrayOf(8, 10, 7))),
            equalTo(
                listOf(
                    mutableListOf(1L, 6L, 9L),
                    mutableListOf(6L, 7L, 24L),
                    mutableListOf(7L, 8L, 15L),
                    mutableListOf(8L, 10L, 7L),
                ),
            ),
        )
    }

    @Test
    fun splitPainting3() {
        assertThat(
            Solution()
                .splitPainting(
                    arrayOf(
                        intArrayOf(1, 4, 5),
                        intArrayOf(1, 4, 7),
                        intArrayOf(4, 7, 1),
                        intArrayOf(4, 7, 11),
                    ),
                ),
            equalTo(listOf(mutableListOf(1L, 4L, 12L), mutableListOf(4L, 7L, 12L))),
        )
    }
}
