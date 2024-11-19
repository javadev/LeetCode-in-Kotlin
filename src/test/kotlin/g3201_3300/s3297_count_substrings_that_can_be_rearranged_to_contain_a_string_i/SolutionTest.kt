package g3201_3300.s3297_count_substrings_that_can_be_rearranged_to_contain_a_string_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validSubstringCount() {
        assertThat<Long>(Solution().validSubstringCount("bcca", "abc"), equalTo<Long>(1L))
    }

    @Test
    fun validSubstringCount2() {
        assertThat<Long>(
            Solution().validSubstringCount("abcabc", "abc"),
            equalTo<Long>(10L),
        )
    }

    @Test
    fun validSubstringCount3() {
        assertThat<Long>(
            Solution().validSubstringCount("abcabc", "aaabc"),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun validSubstringCount4() {
        assertThat<Long>(
            Solution().validSubstringCount("dcbdcdccb", "cdd"),
            equalTo<Long>(18L),
        )
    }
}
