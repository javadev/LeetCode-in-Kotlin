package g3701_3800.s3760_maximum_substrings_with_distinct_start

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistinct() {
        assertThat<Int>(Solution().maxDistinct("abca"), equalTo<Int>(3))
    }

    @Test
    fun maxDistinct2() {
        assertThat<Int>(Solution().maxDistinct("aaaa"), equalTo<Int>(1))
    }

    @Test
    fun maxDistinct3() {
        assertThat<Int>(
            Solution().maxDistinct("abcdefghijklmnopqrstuvwxyz"),
            equalTo<Int>(26),
        )
    }
}
