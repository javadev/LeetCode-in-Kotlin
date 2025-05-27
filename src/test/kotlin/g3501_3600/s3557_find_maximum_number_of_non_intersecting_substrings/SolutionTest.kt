package g3501_3600.s3557_find_maximum_number_of_non_intersecting_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubstrings() {
        assertThat<Int>(Solution().maxSubstrings("abcdeafdef"), equalTo<Int>(2))
    }

    @Test
    fun maxSubstrings2() {
        assertThat<Int>(Solution().maxSubstrings("bcdaaaab"), equalTo<Int>(1))
    }
}
