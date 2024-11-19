package g2301_2400.s2347_best_poker_hand

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bestHand() {
        assertThat(
            Solution()
                .bestHand(intArrayOf(13, 2, 3, 1, 9), charArrayOf('a', 'a', 'a', 'a', 'a')),
            equalTo("Flush"),
        )
    }

    @Test
    fun bestHand2() {
        assertThat(
            Solution()
                .bestHand(intArrayOf(4, 4, 2, 4, 4), charArrayOf('d', 'a', 'a', 'b', 'c')),
            equalTo("Three of a Kind"),
        )
    }

    @Test
    fun bestHand3() {
        assertThat(
            Solution()
                .bestHand(intArrayOf(10, 10, 2, 12, 9), charArrayOf('a', 'b', 'c', 'a', 'd')),
            equalTo("Pair"),
        )
    }

    @Test
    fun bestHand4() {
        assertThat(
            Solution()
                .bestHand(intArrayOf(13, 12, 3, 4, 7), charArrayOf('a', 'd', 'c', 'b', 'c')),
            equalTo("High Card"),
        )
    }
}
