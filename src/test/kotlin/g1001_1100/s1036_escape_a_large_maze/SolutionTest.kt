package g1001_1100.s1036_escape_a_large_maze

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isEscapePossible() {
        assertThat(
            Solution()
                .isEscapePossible(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)), intArrayOf(0, 0), intArrayOf(0, 2)),
            equalTo(false),
        )
    }

    @Test
    fun isEscapePossible2() {
        assertThat(
            Solution()
                .isEscapePossible(arrayOf(), intArrayOf(0, 0), intArrayOf(999999, 999999)),
            equalTo(true),
        )
    }

    @Test
    fun isEscapePossible3() {
        val blocked = arrayOf(intArrayOf(1, 1))
        val source = intArrayOf(0, 0)
        val target = intArrayOf(1, 1)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }

    @Test
    fun isEscapePossible4() {
        val blocked = arrayOf(intArrayOf(10, 10))
        val source = intArrayOf(0, 0)
        val target = intArrayOf(0, 1)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }

    @Test
    fun isEscapePossible5() {
        val blocked = arrayOf(
            intArrayOf(0, 2),
            intArrayOf(1, 2),
            intArrayOf(2, 2),
        )
        val source = intArrayOf(0, 0)
        val target = intArrayOf(3, 3)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }

    @Test
    fun isEscapePossible6() {
        val blocked = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 0),
            intArrayOf(2, 0),
        )
        val source = intArrayOf(0, 0)
        val target = intArrayOf(3, 3)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(false))
    }

    @Test
    fun isEscapePossible7() {
        val blocked = arrayOf(
            intArrayOf(999998, 999999),
            intArrayOf(999999, 999998),
        )
        val source = intArrayOf(999999, 999999)
        val target = intArrayOf(0, 0)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(false))
    }

    @Test
    fun isEscapePossible8() {
        val blocked = arrayOf(
            intArrayOf(5, 5),
            intArrayOf(5, 6),
            intArrayOf(6, 5),
        )
        val source = intArrayOf(5, 7)
        val target = intArrayOf(6, 6)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }

    @Test
    fun isEscapePossible9() {
        val blocked = arrayOf(intArrayOf(1, 2))
        val source = intArrayOf(2, 2)
        val target = intArrayOf(2, 2)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }

    @Test
    fun isEscapePossible10() {
        val blocked = arrayOf<IntArray>()
        val source = intArrayOf(0, 0)
        val target = intArrayOf(0, 1)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }

    @Test
    fun isEscapePossible11() {
        val blocked = arrayOf(intArrayOf(2, 2))
        val source = intArrayOf(2, 1)
        val target = intArrayOf(2, 2)
        assertThat(Solution().isEscapePossible(blocked, source, target), equalTo(true))
    }
}
