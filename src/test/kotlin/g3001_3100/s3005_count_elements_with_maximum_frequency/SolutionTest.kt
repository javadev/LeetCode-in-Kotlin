package g3001_3100.s3005_count_elements_with_maximum_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFrequencyElements() {
        assertThat(Solution().maxFrequencyElements(intArrayOf(1, 2, 2, 3, 1, 4)), equalTo(4))
    }

    @Test
    fun maxFrequencyElements2() {
        assertThat(Solution().maxFrequencyElements(intArrayOf(1, 2, 3, 4, 5)), equalTo(5))
    }
}
