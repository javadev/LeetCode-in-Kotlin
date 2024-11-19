package g1601_1700.s1601_maximum_number_of_achievable_transfer_requests

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumRequests() {
        assertThat(
            Solution()
                .maximumRequests(
                    5,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 0),
                        intArrayOf(3, 4),
                    ),
                ),
            equalTo(5),
        )
    }

    @Test
    fun maximumRequests2() {
        assertThat(
            Solution().maximumRequests(3, arrayOf(intArrayOf(0, 0), intArrayOf(1, 2), intArrayOf(2, 1))),
            equalTo(3),
        )
    }

    @Test
    fun maximumRequests3() {
        assertThat(
            Solution().maximumRequests(
                4,
                arrayOf(intArrayOf(0, 3), intArrayOf(3, 1), intArrayOf(1, 2), intArrayOf(2, 0)),
            ),
            equalTo(4),
        )
    }
}
