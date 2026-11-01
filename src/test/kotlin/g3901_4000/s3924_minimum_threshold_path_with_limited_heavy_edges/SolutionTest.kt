package g3901_4000.s3924_minimum_threshold_path_with_limited_heavy_edges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumThreshold() {
        assertThat<Int>(
            Solution()
                .minimumThreshold(
                    6,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 5),
                        intArrayOf(1, 2, 3),
                        intArrayOf(3, 4, 4),
                        intArrayOf(4, 5, 1),
                        intArrayOf(1, 4, 2),
                    ),
                    0,
                    3,
                    1,
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minimumThreshold2() {
        assertThat<Int>(
            Solution()
                .minimumThreshold(
                    6,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 3),
                        intArrayOf(1, 2, 4),
                        intArrayOf(3, 4, 5),
                        intArrayOf(4, 5, 6),
                    ),
                    0,
                    4,
                    1,
                ),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minimumThreshold3() {
        assertThat<Int>(
            Solution().minimumThreshold(1, arrayOf<IntArray>(), 0, 0, 0),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minimumThreshold4() {
        assertThat<Int>(
            Solution().minimumThreshold(2, arrayOf<IntArray>(), 0, 1, 0),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minimumThreshold5() {
        assertThat<Int>(
            Solution()
                .minimumThreshold(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 9), intArrayOf(1, 2, 4), intArrayOf(0, 2, 7)),
                    0,
                    2,
                    0,
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun minimumThreshold6() {
        assertThat<Int>(
            Solution().minimumThreshold(3, arrayOf<IntArray>(intArrayOf(0, 1, 9), intArrayOf(1, 2, 4)), 2, 0, 1),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minimumThreshold7() {
        assertThat<Int>(
            Solution().minimumThreshold(3, arrayOf<IntArray>(intArrayOf(0, 1, 9), intArrayOf(1, 2, 4)), 0, 2, 2),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minimumThreshold8() {
        assertThat<Int>(
            Solution().minimumThreshold(2, arrayOf<IntArray>(intArrayOf(0, 1, 1000000000)), 0, 1, 0),
            equalTo<Int>(1000000000),
        )
    }
}
