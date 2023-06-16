package g1701_1800.s1718_construct_the_lexicographically_largest_valid_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructDistancedSequence() {
        assertThat(
            Solution().constructDistancedSequence(3), equalTo(intArrayOf(3, 1, 2, 3, 2))
        )
    }

    @Test
    fun constructDistancedSequence2() {
        assertThat(
            Solution().constructDistancedSequence(5),
            equalTo(intArrayOf(5, 3, 1, 4, 3, 5, 2, 4, 2))
        )
    }
}
