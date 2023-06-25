package g2101_2200.s2190_most_frequent_number_following_key_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostFrequent() {
        assertThat(Solution().mostFrequent(intArrayOf(1, 100, 200, 1, 100), 1), equalTo(100))
    }

    @Test
    fun mostFrequent2() {
        assertThat(Solution().mostFrequent(intArrayOf(2, 2, 2, 2, 3), 2), equalTo(2))
    }
}
