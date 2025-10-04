package g3601_3700.s3692_majority_frequency_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun majorityFrequencyGroup() {
        assertThat<String>(
            Solution().majorityFrequencyGroup("aaabbbccdddde"),
            equalTo<String>("ab"),
        )
    }

    @Test
    fun majorityFrequencyGroup2() {
        assertThat<String>(
            Solution().majorityFrequencyGroup("abcd"),
            equalTo<String>("abcd"),
        )
    }

    @Test
    fun majorityFrequencyGroup3() {
        assertThat<String>(
            Solution().majorityFrequencyGroup("pfpfgi"),
            equalTo<String>("fp"),
        )
    }
}
