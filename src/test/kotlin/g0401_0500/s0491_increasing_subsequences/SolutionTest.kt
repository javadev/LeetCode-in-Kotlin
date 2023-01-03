package g0401_0500.s0491_increasing_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays
import java.util.function.Consumer

internal class SolutionTest {
    @Test
    fun findSubsequences() {
        val expected: List<List<Int>> = ArrayList(
            listOf(
                listOf(4, 6),
                listOf(4, 6, 7),
                listOf(4, 6, 7, 7),
                listOf(4, 7),
                listOf(4, 7, 7),
                listOf(6, 7),
                listOf(6, 7, 7),
                listOf(7, 7)
            )
        )
        val result = Solution().findSubsequences(intArrayOf(4, 6, 7, 7))
        result.forEach(
            Consumer { e: List<Int> ->
                assertThat(
                    expected.contains(e),
                    equalTo(true)
                )
            }
        )
    }

    @Test
    fun findSubsequences2() {
        val expected: List<List<Int>> = ArrayList(listOf(listOf(4, 4)))
        assertThat(Solution().findSubsequences(intArrayOf(4, 4, 3, 2, 1)), equalTo(expected))
    }
}
