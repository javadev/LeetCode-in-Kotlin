package g3401_3500.s3414_maximum_score_of_non_overlapping_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumWeight() {
        assertThat<IntArray>(
            Solution()
                .maximumWeight(
                    listOf<MutableList<Int>>(
                        mutableListOf<Int>(1, 3, 2),
                        mutableListOf<Int>(4, 5, 2),
                        mutableListOf<Int>(1, 5, 5),
                        mutableListOf<Int>(6, 9, 3),
                        mutableListOf<Int>(6, 7, 1),
                        mutableListOf<Int>(8, 9, 1),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(2, 3)),
        )
    }

    @Test
    fun maximumWeight2() {
        assertThat<IntArray>(
            Solution()
                .maximumWeight(
                    listOf<MutableList<Int>>(
                        mutableListOf<Int>(5, 8, 1),
                        mutableListOf<Int>(6, 7, 7),
                        mutableListOf<Int>(4, 7, 3),
                        mutableListOf<Int>(9, 10, 6),
                        mutableListOf<Int>(7, 8, 2),
                        mutableListOf<Int>(11, 14, 3),
                        mutableListOf<Int>(3, 5, 5),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(1, 3, 5, 6)),
        )
    }

    @Test
    fun maximumWeight3() {
        assertThat<IntArray>(
            Solution()
                .maximumWeight(
                    listOf<MutableList<Int>>(
                        mutableListOf<Int>(4, 4, 1),
                        mutableListOf<Int>(2, 5, 3),
                        mutableListOf<Int>(2, 3, 2),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(0, 2)),
        )
    }

    @Test
    fun maximumWeight4() {
        assertThat<IntArray>(
            Solution()
                .maximumWeight(
                    listOf<MutableList<Int>>(
                        mutableListOf<Int>(19, 23, 23),
                        mutableListOf<Int>(19, 23, 40),
                        mutableListOf<Int>(1, 16, 31),
                        mutableListOf<Int>(16, 18, 31),
                        mutableListOf<Int>(14, 20, 22),
                        mutableListOf<Int>(14, 22, 5),
                        mutableListOf<Int>(23, 24, 23),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(1, 2)),
        )
    }
}
