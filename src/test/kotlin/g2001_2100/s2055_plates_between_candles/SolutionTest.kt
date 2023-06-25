package g2001_2100.s2055_plates_between_candles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun platesBetweenCandles() {
        val queries = arrayOf(intArrayOf(2, 5), intArrayOf(5, 9))
        assertThat(
            Solution().platesBetweenCandles("**|**|***|", queries),
            equalTo(intArrayOf(2, 3))
        )
    }

    @Test
    fun platesBetweenCandles2() {
        val queries = arrayOf(
            intArrayOf(1, 17), intArrayOf(4, 5), intArrayOf(14, 17),
            intArrayOf(5, 11), intArrayOf(15, 16)
        )
        assertThat(
            Solution().platesBetweenCandles("***|**|*****|**||**|*", queries),
            equalTo(intArrayOf(9, 0, 0, 0, 0))
        )
    }
}
