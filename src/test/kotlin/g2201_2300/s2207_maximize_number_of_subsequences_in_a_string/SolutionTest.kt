package g2201_2300.s2207_maximize_number_of_subsequences_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSubsequenceCount() {
        assertThat(Solution().maximumSubsequenceCount("abdcdbc", "ac"), equalTo(4L))
    }

    @Test
    fun maximumSubsequenceCount2() {
        assertThat(Solution().maximumSubsequenceCount("aabb", "ab"), equalTo(6L))
    }

    @Test
    fun maximumSubsequenceCount3() {
        assertThat(Solution().maximumSubsequenceCount("abdcdbc", "aa"), equalTo(1L))
    }
}
