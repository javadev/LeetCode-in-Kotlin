package g1201_1300.s1268_search_suggestions_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun suggestedProducts() {
        val expected = listOf(
            mutableListOf("mobile", "moneypot", "monitor"),
            mutableListOf("mobile", "moneypot", "monitor"),
            mutableListOf("mouse", "mousepad"), mutableListOf("mouse", "mousepad"),
            mutableListOf("mouse", "mousepad")
        )
        assertThat(
            Solution()
                .suggestedProducts(
                    arrayOf("mobile", "mouse", "moneypot", "monitor", "mousepad"),
                    "mouse"
                ),
            equalTo(expected)
        )
    }

    @Test
    fun suggestedProducts2() {
        val expected = listOf(
            listOf("havana"), listOf("havana"), listOf("havana"),
            listOf("havana"), listOf("havana"), listOf("havana")
        )
        assertThat(
            Solution().suggestedProducts(arrayOf("havana"), "havana"),
            equalTo(expected)
        )
    }

    @Test
    fun suggestedProducts3() {
        val expected = listOf(
            mutableListOf("baggage", "bags", "banner"),
            mutableListOf("baggage", "bags", "banner"), mutableListOf("baggage", "bags"), listOf("bags")
        )
        assertThat(
            Solution()
                .suggestedProducts(
                    arrayOf("bags", "baggage", "banner", "box", "cloths"),
                    "bags"
                ),
            equalTo(expected)
        )
    }
}
