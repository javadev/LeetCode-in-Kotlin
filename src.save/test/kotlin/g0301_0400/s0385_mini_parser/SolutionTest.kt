package g0301_0400.s0385_mini_parser

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deserialize() {
        assertThat(Solution().deserialize("324").getInteger(), equalTo(324))
    }

    @Test
    fun deserialize2() {
        val nestedInteger = Solution().deserialize("[123,[456,[789]]]")
        val result = intArrayOf(
            nestedInteger.getList()!![0].getInteger()!!,
            nestedInteger.getList()!![1].getList()!![0].getInteger()!!,
            nestedInteger.getList()!![1].getList()!![1].getList()!![0].getInteger()!!
        )
        val expected = intArrayOf(123, 456, 789)
        assertThat(result, equalTo(expected))
    }
}
