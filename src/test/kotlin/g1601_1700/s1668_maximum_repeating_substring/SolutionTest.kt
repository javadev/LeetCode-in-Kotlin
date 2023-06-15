package g1601_1700.s1668_maximum_repeating_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRepeating() {
        assertThat(Solution().maxRepeating("ababc", "ab"), equalTo(2))
    }

    @Test
    fun maxRepeating2() {
        assertThat(Solution().maxRepeating("ababc", "ba"), equalTo(1))
    }

    @Test
    fun maxRepeating3() {
        assertThat(Solution().maxRepeating("ababc", "ac"), equalTo(0))
    }
}
