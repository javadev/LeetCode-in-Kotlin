package g1101_1200.s1178_number_of_valid_words_for_each_puzzle

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNumOfValidWords() {
        MatcherAssert.assertThat(
            Solution()
                .findNumOfValidWords(
                    arrayOf(
                        "aaaa", "asas", "able", "ability", "actt", "actor", "access"
                    ),
                    arrayOf(
                        "aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"
                    )
                ),
            CoreMatchers.equalTo(mutableListOf(1, 1, 3, 2, 4, 0))
        )
    }

    @Test
    fun findNumOfValidWords2() {
        MatcherAssert.assertThat(
            Solution()
                .findNumOfValidWords(
                    arrayOf("apple", "pleas", "please"),
                    arrayOf(
                        "aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"
                    )
                ),
            CoreMatchers.equalTo(mutableListOf(0, 1, 3, 2, 0))
        )
    }
}
