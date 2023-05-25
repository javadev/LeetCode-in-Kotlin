package g1101_1200.s1178_number_of_valid_words_for_each_puzzle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNumOfValidWords() {
        assertThat(
            Solution()
                .findNumOfValidWords(
                    arrayOf(
                        "aaaa", "asas", "able", "ability", "actt", "actor", "access"
                    ),
                    arrayOf(
                        "aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"
                    )
                ),
            equalTo(mutableListOf(1, 1, 3, 2, 4, 0))
        )
    }

    @Test
    fun findNumOfValidWords2() {
        assertThat(
            Solution()
                .findNumOfValidWords(
                    arrayOf("apple", "pleas", "please"),
                    arrayOf(
                        "aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"
                    )
                ),
            equalTo(mutableListOf(0, 1, 3, 2, 0))
        )
    }
}
