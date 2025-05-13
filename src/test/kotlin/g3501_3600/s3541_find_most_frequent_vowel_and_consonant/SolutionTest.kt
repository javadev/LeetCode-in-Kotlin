package g3501_3600.s3541_find_most_frequent_vowel_and_consonant

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFreqSum() {
        MatcherAssert.assertThat<Int?>(Solution().maxFreqSum("successes"), CoreMatchers.equalTo<Int?>(6))
    }

    @Test
    fun maxFreqSum2() {
        MatcherAssert.assertThat<Int?>(Solution().maxFreqSum("aeiaeia"), CoreMatchers.equalTo<Int?>(3))
    }
}
