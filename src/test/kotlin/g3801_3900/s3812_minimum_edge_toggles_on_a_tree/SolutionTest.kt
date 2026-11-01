package g3801_3900.s3812_minimum_edge_toggles_on_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumFlips() {
        assertThat<MutableList<Int>>(
            Solution().minimumFlips(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), "010", "100"),
            equalTo<MutableList<Int>>(mutableListOf<Int>(0)),
        )
    }

    @Test
    fun minimumFlips2() {
        assertThat<MutableList<Int>>(
            Solution()
                .minimumFlips(
                    7,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4),
                        intArrayOf(3, 5),
                        intArrayOf(1, 6),
                    ),
                    "0011000",
                    "0010001",
                ),
            equalTo<MutableList<Int>>(mutableListOf<Int>(1, 2, 5)),
        )
    }

    @Test
    fun minimumFlips3() {
        assertThat<MutableList<Int>>(
            Solution().minimumFlips(2, arrayOf<IntArray>(intArrayOf(0, 1)), "00", "01"),
            equalTo<MutableList<Int>>(mutableListOf(-1)),
        )
    }
}
