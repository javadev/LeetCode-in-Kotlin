package g1801_1900.s1898_maximum_number_of_removable_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumRemovals() {
        assertThat(
            Solution().maximumRemovals("abcacb", "ab", intArrayOf(3, 1, 0)),
            equalTo(2)
        )
    }

    @Test
    fun maximumRemovals2() {
        assertThat(
            Solution().maximumRemovals("abcbddddd", "abcd", intArrayOf(3, 2, 1, 4, 5, 6)),
            equalTo(1)
        )
    }
}
