package g3801_3900.s3858_minimum_bitwise_or_from_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOR() {
        assertThat<Int>(
            Solution().minimumOR(arrayOf<IntArray>(intArrayOf(1, 5), intArrayOf(2, 4))),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minimumOR2() {
        assertThat<Int>(
            Solution().minimumOR(arrayOf<IntArray>(intArrayOf(3, 5), intArrayOf(6, 4))),
            equalTo<Int>(5),
        )
    }

    @Test
    fun minimumOR3() {
        assertThat<Int>(
            Solution().minimumOR(arrayOf<IntArray>(intArrayOf(7, 9, 8))),
            equalTo<Int>(7),
        )
    }
}
