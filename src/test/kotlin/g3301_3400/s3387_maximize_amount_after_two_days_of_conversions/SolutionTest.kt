package g3301_3400.s3387_maximize_amount_after_two_days_of_conversions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAmount() {
        assertThat<Double?>(
            Solution()
                .maxAmount(
                    "EUR",
                    listOf<List<String>>(
                        listOf<String>("EUR", "USD"),
                        listOf<String>("USD", "JPY"),
                    ),
                    doubleArrayOf(2.0, 3.0),
                    listOf<List<String>>(
                        listOf<String>("JPY", "USD"),
                        listOf<String>("USD", "CHF"),
                        listOf<String>("CHF", "EUR"),
                    ),
                    doubleArrayOf(4.0, 5.0, 6.0),
                ),
            equalTo<Double>(720.0),
        )
    }

    @Test
    fun maxAmount2() {
        assertThat<Double>(
            Solution()
                .maxAmount(
                    "NGN",
                    listOf<List<String>>(listOf<String>("NGN", "EUR")),
                    doubleArrayOf(9.0),
                    listOf<List<String>>(listOf<String>("NGN", "EUR")),
                    doubleArrayOf(6.0),
                ),
            equalTo<Double>(1.5),
        )
    }

    @Test
    fun maxAmount3() {
        assertThat<Double>(
            Solution()
                .maxAmount(
                    "USD",
                    listOf<List<String>>(listOf<String>("USD", "EUR")),
                    doubleArrayOf(1.0),
                    listOf<List<String>>(listOf<String>("EUR", "JPY")),
                    doubleArrayOf(10.0),
                ),
            equalTo<Double>(1.0),
        )
    }
}
