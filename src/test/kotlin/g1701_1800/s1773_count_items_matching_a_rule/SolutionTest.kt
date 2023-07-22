package g1701_1800.s1773_count_items_matching_a_rule

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMatches() {
        assertThat(
            Solution()
                .countMatches(
                    listOf(
                        mutableListOf("phone", "blue", "pixel"),
                        mutableListOf("computer", "silver", "lenovo"), mutableListOf("phone", "gold", "iphone")
                    ),
                    "color",
                    "silver"
                ),
            equalTo(1)
        )
    }

    @Test
    fun countMatches2() {
        assertThat(
            Solution()
                .countMatches(
                    listOf(
                        mutableListOf("phone", "blue", "pixel"),
                        mutableListOf("computer", "silver", "phone"),
                        mutableListOf("phone", "gold", "iphone")
                    ),
                    "type",
                    "phone"
                ),
            equalTo(2)
        )
    }
}
