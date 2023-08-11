package g1201_1300.s1278_palindrome_partitioning_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun palindromePartition() {
        assertThat(Solution().palindromePartition("abc", 2), equalTo(1))
    }

    @Test
    fun palindromePartition2() {
        assertThat(Solution().palindromePartition("aabbc", 3), equalTo(0))
    }

    @Test
    fun palindromePartition3() {
        assertThat(Solution().palindromePartition("leetcode", 8), equalTo(0))
    }
}
