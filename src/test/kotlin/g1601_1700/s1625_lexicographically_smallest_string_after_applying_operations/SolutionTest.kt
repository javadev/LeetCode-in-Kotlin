package g1601_1700.s1625_lexicographically_smallest_string_after_applying_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLexSmallestString() {
        assertThat(Solution().findLexSmallestString("5525", 9, 2), equalTo("2050"))
    }

    @Test
    fun findLexSmallestString2() {
        assertThat(Solution().findLexSmallestString("74", 5, 1), equalTo("24"))
    }

    @Test
    fun findLexSmallestString3() {
        assertThat(Solution().findLexSmallestString("0011", 4, 2), equalTo("0011"))
    }
}
