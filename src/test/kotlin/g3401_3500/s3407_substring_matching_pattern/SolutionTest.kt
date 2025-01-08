package g3401_3500.s3407_substring_matching_pattern

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasMatch() {
        assertThat<Boolean>(
            Solution().hasMatch("leetcode", "ee*e"),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun hasMatch2() {
        assertThat<Boolean>(Solution().hasMatch("car", "c*v"), equalTo<Boolean>(false))
    }

    @Test
    fun hasMatch3() {
        assertThat<Boolean>(Solution().hasMatch("luck", "u*"), equalTo<Boolean>(true))
    }
}
