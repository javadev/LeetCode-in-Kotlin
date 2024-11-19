package g1901_2000.s1996_the_number_of_weak_characters_in_the_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWeakCharacters() {
        assertThat(
            Solution().numberOfWeakCharacters(arrayOf(intArrayOf(5, 5), intArrayOf(6, 3), intArrayOf(3, 6))),
            equalTo(0),
        )
    }

    @Test
    fun numberOfWeakCharacters2() {
        assertThat(
            Solution().numberOfWeakCharacters(arrayOf(intArrayOf(2, 2), intArrayOf(3, 3))),
            equalTo(1),
        )
    }

    @Test
    fun numberOfWeakCharacters3() {
        assertThat(
            Solution().numberOfWeakCharacters(arrayOf(intArrayOf(1, 5), intArrayOf(10, 4), intArrayOf(4, 3))),
            equalTo(1),
        )
    }
}
