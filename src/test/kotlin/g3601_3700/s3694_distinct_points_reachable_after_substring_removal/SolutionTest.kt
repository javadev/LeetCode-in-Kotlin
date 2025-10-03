package g3601_3700.s3694_distinct_points_reachable_after_substring_removal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctPoints() {
        assertThat<Int>(Solution().distinctPoints("LUL", 1), equalTo<Int>(2))
    }

    @Test
    fun distinctPoints2() {
        assertThat<Int>(Solution().distinctPoints("UDLR", 4), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints3() {
        assertThat<Int>(Solution().distinctPoints("UU", 1), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints4() {
        assertThat<Int>(Solution().distinctPoints("", 0), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("", 1), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints5() {
        assertThat<Int>(Solution().distinctPoints("UDLR", 5), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("UD", 3), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints6() {
        assertThat<Int>(Solution().distinctPoints("UDLR", 4), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints7() {
        assertThat<Int>(Solution().distinctPoints("U", 0), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("D", 0), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("L", 0), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("R", 0), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints8() {
        assertThat<Int>(Solution().distinctPoints("UU", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("UUU", 1), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints9() {
        assertThat<Int>(Solution().distinctPoints("DD", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("DDD", 1), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints10() {
        assertThat<Int>(Solution().distinctPoints("LL", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("LLL", 1), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints11() {
        assertThat<Int>(Solution().distinctPoints("RR", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("RRR", 1), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints12() {
        assertThat<Int>(Solution().distinctPoints("XX", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("123", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("ABC", 2), equalTo<Int>(1))
    }

    @Test
    fun distinctPoints13() {
        assertThat<Int>(Solution().distinctPoints("UDLR", 1), equalTo<Int>(4))
        assertThat<Int>(Solution().distinctPoints("UDLR", 2), equalTo<Int>(2))
        assertThat<Int>(Solution().distinctPoints("URDL", 1), equalTo<Int>(4))
    }

    @Test
    fun distinctPoints14() {
        assertThat<Int>(Solution().distinctPoints("UDUD", 2), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("LRLR", 2), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("UDLR", 3), equalTo<Int>(2))
    }

    @Test
    fun distinctPoints15() {
        assertThat<Int>(Solution().distinctPoints("UUDDLLRR", 2), equalTo<Int>(6))
        assertThat<Int>(Solution().distinctPoints("UDUDLRLR", 4), equalTo<Int>(2))
    }

    @Test
    fun distinctPoints16() {
        assertThat<Int>(Solution().distinctPoints("UUUU", 1), equalTo<Int>(1))
        assertThat<Int>(Solution().distinctPoints("UUDD", 2), equalTo<Int>(3))
    }

    @Test
    fun distinctPoints17() {
        val longPath = "UUUUDDDLLLLRRRR"
        assertThat<Int>(Solution().distinctPoints(longPath, 3), equalTo<Int>(10))
        assertThat<Int>(Solution().distinctPoints(longPath, 5), equalTo<Int>(11))
    }

    @Test
    fun distinctPoints18() {
        assertThat<Int>(Solution().distinctPoints("U@D#L\$R%", 2), equalTo<Int>(4))
        assertThat<Int>(Solution().distinctPoints("!@#$", 1), equalTo<Int>(1))
    }
}
