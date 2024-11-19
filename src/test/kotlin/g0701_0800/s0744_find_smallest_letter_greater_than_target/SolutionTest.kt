package g0701_0800.s0744_find_smallest_letter_greater_than_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextGreatestLetter() {
        assertThat(
            Solution().nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'a'),
            equalTo('c'),
        )
    }

    @Test
    fun nextGreatestLetter2() {
        assertThat(
            Solution().nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'c'),
            equalTo('f'),
        )
    }

    @Test
    fun nextGreatestLetter3() {
        assertThat(
            Solution().nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'd'),
            equalTo('f'),
        )
    }

    @Test
    fun nextGreatestLetter4() {
        assertThat(
            Solution().nextGreatestLetter(charArrayOf('c', 'f', 'j'), 'k'),
            equalTo('c'),
        )
    }
}
