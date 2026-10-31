package g3701_3800.s3746_minimum_string_length_after_balanced_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minLengthAfterRemovals() {
        assertThat<Int>(Solution().minLengthAfterRemovals("ab"), equalTo<Int>(0))
    }

    @Test
    fun minLengthAfterRemovals2() {
        assertThat<Int>(Solution().minLengthAfterRemovals("aaab"), equalTo<Int>(2))
    }

    @Test
    fun minLengthAfterRemovals3() {
        assertThat<Int>(Solution().minLengthAfterRemovals("bbbb"), equalTo<Int>(4))
    }
}
