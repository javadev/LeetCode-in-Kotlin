package g4001_4100.s4023_elevator_requests_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun elevatorRequests() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf()),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun elevatorRequests2() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(5, 5)),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun elevatorRequests3() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(2, 4)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun elevatorRequests4() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(7, 9)),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun elevatorRequests5() {
        // One request below start: just go down the distance.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(2)),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun elevatorRequests6() {
        // One request above start: just go up the distance.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(8)),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun elevatorRequests7() {
        // All requests equal to start contribute nothing.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(5, 5, 5, 5)),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun elevatorRequests8() {
        // Requests at 1,2,3 below start 5.
        // Total requests t = 3, distances sorted: 2,3,4 (5-3,5-2,5-1).
        // dl[i][0]: i=1: 2*3=6; i=2: 6+(3-2)*2=8; i=3: 8+(4-3)*1=9.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(3, 2, 1)),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun elevatorRequests9() {
        // Requests at 7,8,9 above start 5.
        // distances sorted: 2,3,4. Same structure -> 9.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(9, 8, 7)),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun elevatorRequests10() {
        // Below: 3 -> dist 2; Above: 7 -> dist 2.
        // Best: handle both, total travel chooses cheaper direction switch.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(3, 7)),
            equalTo<Long>(8L),
        )
    }

    @Test
    fun elevatorRequests11() {
        // Below: 4 (dist 1); Above: 9 (dist 4).
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(4, 9)),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun elevatorRequests12() {
        // start = 0, all requests above.
        // distances: 1,2,3 -> dr[0][j]: j=1:1*3=3; j=2:3+(2-1)*2=5; j=3:5+(3-2)*1=6.
        assertThat<Long>(
            Solution().elevatorRequests(10, 0, intArrayOf(1, 2, 3)),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun elevatorRequests13() {
        // start = 10, all requests below.
        // distances: 10-9=1, 10-8=2, 10-7=3 -> 6.
        assertThat<Long>(
            Solution().elevatorRequests(10, 10, intArrayOf(7, 8, 9)),
            equalTo<Long>(6L),
        )
    }

    @Test
    fun elevatorRequests14() {
        // Duplicate requests on both sides.
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, intArrayOf(3, 3, 7, 7)),
            equalTo<Long>(16L),
        )
    }

    @Test
    fun elevatorRequests15() {
        // Check long arithmetic with larger spread.
        val result = Solution().elevatorRequests(1000000, 500000, intArrayOf(1, 999999))
        // Below dist: 499999; Above dist: 499999; t=2.
        assertThat<Long>(result, equalTo<Long>(1999996L))
    }

    @Test
    fun elevatorRequests16() {
        // Mixed multiple requests both directions.
        assertThat<Long>(
            Solution().elevatorRequests(20, 10, intArrayOf(5, 8, 12, 15)),
            equalTo<Long>(34L),
        )
    }
}
