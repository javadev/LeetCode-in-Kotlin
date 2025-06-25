package g3501_3600.s3541_find_most_frequent_vowel_and_consonant

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFreqSum() {
        assertThat<Int>(Solution().maxFreqSum("successes"), equalTo<Int>(6))
    }

    @Test
    fun maxFreqSum2() {
        assertThat<Int>(Solution().maxFreqSum("aeiaeia"), equalTo<Int>(3))
    }
}
