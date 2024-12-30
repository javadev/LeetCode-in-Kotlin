package g3301_3400.s3398_smallest_substring_with_identical_characters_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minLength() {
        assertThat<Int>(Solution().minLength("000001", 1), equalTo<Int>(2))
    }

    @Test
    fun minLength2() {
        assertThat<Int>(Solution().minLength("0000", 2), equalTo<Int>(1))
    }

    @Test
    fun minLength3() {
        assertThat<Int>(Solution().minLength("0101", 0), equalTo<Int>(1))
    }
}
