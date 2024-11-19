package g0601_0700.s0638_shopping_offers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shoppingOffers() {
        assertThat(
            Solution()
                .shoppingOffers(
                    listOf(2, 5),
                    listOf(listOf(3, 0, 5), listOf(1, 2, 10)),
                    listOf(3, 2),
                ),
            equalTo(14),
        )
    }

    @Test
    fun shoppingOffers2() {
        assertThat(
            Solution()
                .shoppingOffers(
                    listOf(2, 3, 4),
                    listOf(listOf(1, 1, 0, 4), listOf(2, 2, 1, 9)),
                    listOf(1, 2, 1),
                ),
            equalTo(11),
        )
    }
}
