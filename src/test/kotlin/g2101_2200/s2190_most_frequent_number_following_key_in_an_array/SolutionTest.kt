package g2101_2200.s2190_most_frequent_number_following_key_in_an_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostFrequent() {
        MatcherAssert.assertThat(Solution().mostFrequent(intArrayOf(1, 100, 200, 1, 100), 1), CoreMatchers.equalTo(100))
    }

    @Test
    fun mostFrequent2() {
        MatcherAssert.assertThat(Solution().mostFrequent(intArrayOf(2, 2, 2, 2, 3), 2), CoreMatchers.equalTo(2))
    }
}
