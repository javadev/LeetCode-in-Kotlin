package g1601_1700.s1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alertNames() {
        assertThat(
            Solution()
                .alertNames(
                    arrayOf(
                        "daniel",
                        "daniel",
                        "daniel",
                        "luis",
                        "luis",
                        "luis",
                        "luis",
                    ),
                    arrayOf(
                        "10:00",
                        "10:40",
                        "11:00",
                        "09:00",
                        "11:00",
                        "13:00",
                        "15:00",
                    ),
                ),
            equalTo(listOf("daniel")),
        )
    }

    @Test
    fun alertNames2() {
        assertThat(
            Solution()
                .alertNames(
                    arrayOf(
                        "alice",
                        "alice",
                        "alice",
                        "bob",
                        "bob",
                        "bob",
                        "bob",
                    ),
                    arrayOf(
                        "12:01",
                        "12:00",
                        "18:00",
                        "21:00",
                        "21:20",
                        "21:30",
                        "23:00",
                    ),
                ),
            equalTo(listOf("bob")),
        )
    }
}
