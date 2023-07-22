package g1801_1900.s1838_frequency_of_the_most_frequent_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFrequency() {
        assertThat(Solution().maxFrequency(intArrayOf(1, 2, 4), 5), equalTo(3))
    }

    @Test
    fun maxFrequency2() {
        assertThat(Solution().maxFrequency(intArrayOf(1, 4, 8, 13), 5), equalTo(2))
    }

    @Test
    fun maxFrequency3() {
        assertThat(Solution().maxFrequency(intArrayOf(3, 9, 6), 2), equalTo(1))
    }
}
