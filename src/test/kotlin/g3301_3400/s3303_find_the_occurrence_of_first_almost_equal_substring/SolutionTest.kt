package g3301_3400.s3303_find_the_occurrence_of_first_almost_equal_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minStartingIndex() {
        assertThat<Int>(Solution().minStartingIndex("abcdefg", "bcdffg"), equalTo<Int>(1))
    }

    @Test
    fun minStartingIndex2() {
        assertThat<Int>(
            Solution().minStartingIndex("ababbababa", "bacaba"),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minStartingIndex3() {
        assertThat<Int>(Solution().minStartingIndex("abcd", "dba"), equalTo<Int>(-1))
    }

    @Test
    fun minStartingIndex4() {
        assertThat<Int>(Solution().minStartingIndex("dde", "d"), equalTo<Int>(0))
    }
}
