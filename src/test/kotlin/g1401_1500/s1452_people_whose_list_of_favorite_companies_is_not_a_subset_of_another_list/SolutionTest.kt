package g1401_1500.s1452_people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun peopleIndexes() {
        val input = listOf(
            mutableListOf("leetcode", "google", "facebook"),
            mutableListOf("google", "microsoft"),
            mutableListOf("google", "facebook"),
            listOf("google"),
            listOf("amazon"),
        )
        assertThat(Solution().peopleIndexes(input), equalTo(mutableListOf(0, 1, 4)))
    }

    @Test
    fun peopleIndexes2() {
        val input = listOf(
            mutableListOf("leetcode", "google", "facebook"),
            mutableListOf("leetcode", "amazon"),
            mutableListOf("facebook", "google"),
        )
        assertThat(Solution().peopleIndexes(input), equalTo(mutableListOf(0, 1)))
    }

    @Test
    fun peopleIndexes3() {
        val input = listOf(listOf("leetcode"), listOf("google"), listOf("facebook"), listOf("amazon"))
        assertThat(Solution().peopleIndexes(input), equalTo(mutableListOf(0, 1, 2, 3)))
    }
}
