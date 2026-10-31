package g3801_3900.s3884_first_matching_character_from_both_ends

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstMatchingIndex() {
        assertThat<Int>(Solution().firstMatchingIndex("abcacbd"), equalTo<Int>(1))
    }

    @Test
    fun firstMatchingIndex2() {
        assertThat<Int>(Solution().firstMatchingIndex("abc"), equalTo<Int>(1))
    }

    @Test
    fun firstMatchingIndex3() {
        assertThat<Int>(Solution().firstMatchingIndex("abcdab"), equalTo<Int>(-1))
    }
}
