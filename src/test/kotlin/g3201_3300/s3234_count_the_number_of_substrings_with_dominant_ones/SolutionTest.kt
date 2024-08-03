package g3201_3300.s3234_count_the_number_of_substrings_with_dominant_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubstrings() {
        assertThat(Solution().numberOfSubstrings("00011"), equalTo(5))
    }

    @Test
    fun numberOfSubstrings2() {
        assertThat(Solution().numberOfSubstrings("101101"), equalTo(16))
    }
}
