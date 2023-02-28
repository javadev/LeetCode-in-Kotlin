package g0701_0800.s0721_accounts_merge

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun accountsMerge() {
        val input = listOf(
            listOf("John", "johnsmith@mail.com", "john_newyork@mail.com"),
            listOf("John", "johnsmith@mail.com", "john00@mail.com"),
            listOf("Mary", "mary@mail.com"),
            listOf("John", "johnnybravo@mail.com")
        )
        val expected = listOf(
            listOf(
                "John",
                "john00@mail.com",
                "john_newyork@mail.com",
                "johnsmith@mail.com"
            ),
            listOf("Mary", "mary@mail.com"),
            listOf("John", "johnnybravo@mail.com")
        )
        assertThat(Solution().accountsMerge(input).toString(), equalTo(expected.toString()))
    }

    @Test
    fun accountsMerge2() {
        val input = listOf(
            listOf("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
            listOf("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
            listOf("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
            listOf("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
            listOf("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co")
        )
        val expected = listOf(
            listOf("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
            listOf("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"),
            listOf("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"),
            listOf("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
            listOf("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"),
        )
        assertThat(Solution().accountsMerge(input), equalTo(expected))
    }
}
