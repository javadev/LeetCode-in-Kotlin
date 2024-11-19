package g2901_3000.s2933_high_access_employees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findHighAccessEmployees() {
        assertThat(
            Solution()
                .findHighAccessEmployees(
                    listOf<List<String>>(
                        mutableListOf("a", "0549"),
                        mutableListOf("b", "0457"),
                        mutableListOf("a", "0532"),
                        mutableListOf("a", "0621"),
                        mutableListOf("b", "0540"),
                    ),
                ),
            equalTo(listOf("a")),
        )
    }

    @Test
    fun findHighAccessEmployees2() {
        assertThat(
            Solution()
                .findHighAccessEmployees(
                    listOf<List<String>>(
                        mutableListOf("d", "0002"),
                        mutableListOf("c", "0808"),
                        mutableListOf("c", "0829"),
                        mutableListOf("e", "0215"),
                        mutableListOf("d", "1508"),
                        mutableListOf("d", "1444"),
                        mutableListOf("d", "1410"),
                        mutableListOf("c", "0809"),
                    ),
                ),
            equalTo(listOf("c", "d")),
        )
    }

    @Test
    fun findHighAccessEmployees3() {
        assertThat(
            Solution()
                .findHighAccessEmployees(
                    listOf<List<String>>(
                        mutableListOf("cd", "1025"),
                        mutableListOf("ab", "1025"),
                        mutableListOf("cd", "1046"),
                        mutableListOf("cd", "1055"),
                        mutableListOf("ab", "1124"),
                        mutableListOf("ab", "1120"),
                    ),
                ),
            equalTo(listOf("cd", "ab")),
        )
    }
}
