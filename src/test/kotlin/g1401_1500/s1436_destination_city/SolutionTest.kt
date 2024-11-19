package g1401_1500.s1436_destination_city

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun destCity() {
        val input = listOf(
            mutableListOf("London", "New York"),
            mutableListOf("New York", "Lima"),
            mutableListOf("Lima", "Sao Paulo"),
        )
        assertThat(Solution().destCity(input), equalTo("Sao Paulo"))
    }

    @Test
    fun destCity2() {
        val input = listOf(mutableListOf("B", "C"), mutableListOf("D", "B"), mutableListOf("C", "A"))
        assertThat(Solution().destCity(input), equalTo("A"))
    }

    @Test
    fun destCity3() {
        val input = listOf(mutableListOf("A", "Z"))
        assertThat(Solution().destCity(input), equalTo("Z"))
    }
}
