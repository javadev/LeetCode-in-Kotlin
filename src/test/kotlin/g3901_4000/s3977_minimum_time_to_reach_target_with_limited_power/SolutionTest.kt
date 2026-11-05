package g3901_4000.s3977_minimum_time_to_reach_target_with_limited_power

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTimeMaxPower() {
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 4, 1),
                        intArrayOf(0, 2, 1),
                        intArrayOf(2, 3, 1),
                        intArrayOf(3, 4, 1),
                    ),
                    4,
                    intArrayOf(2, 3, 1, 1, 1),
                    0,
                    4,
                ),
            equalTo<LongArray>(longArrayOf(3, 0)),
        )
    }

    @Test
    fun minTimeMaxPower2() {
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(1, 2, 2), intArrayOf(2, 0, 2)),
                    3,
                    intArrayOf(1, 1, 1),
                    1,
                    1,
                ),
            equalTo<LongArray>(longArrayOf(0, 3)),
        )
    }

    @Test
    fun minTimeMaxPower3() {
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    4,
                    arrayOf<IntArray>(intArrayOf(0, 1, 3), intArrayOf(2, 3, 4)),
                    3,
                    intArrayOf(1, 1, 1, 1),
                    0,
                    3,
                ),
            equalTo<LongArray>(longArrayOf(-1, -1)),
        )
    }

    @Test
    fun minTimeMaxPower4() {
        // Single node, source == target, cost of source is never paid
        assertThat<LongArray>(
            Solution().minTimeMaxPower(1, arrayOf<IntArray>(), 5, intArrayOf(10), 0, 0),
            equalTo<LongArray>(longArrayOf(0, 5)),
        )
    }

    @Test
    fun minTimeMaxPower5() {
        // Simple chain 0 -> 1 -> 2, costs paid at 0 and 1
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(1, 2, 3)),
                    10,
                    intArrayOf(3, 4, 100),
                    0,
                    2,
                ),
            equalTo<LongArray>(longArrayOf(5, 3)),
        )
    }

    @Test
    fun minTimeMaxPower6() {
        // Not enough power to leave the source
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(2, arrayOf<IntArray>(intArrayOf(0, 1, 1)), 1, intArrayOf(2, 0), 0, 1),
            equalTo<LongArray>(longArrayOf(-1, -1)),
        )
    }

    @Test
    fun minTimeMaxPower7() {
        // Two paths with equal time, the one with more remaining power wins
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    4,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(0, 2, 1),
                        intArrayOf(1, 3, 1),
                        intArrayOf(2, 3, 1),
                    ),
                    10,
                    intArrayOf(1, 5, 2, 0),
                    0,
                    3,
                ),
            equalTo<LongArray>(longArrayOf(2, 7)),
        )
    }

    @Test
    fun minTimeMaxPower8() {
        // Faster path is blocked by a high cost node, slower path is used
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    4,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 3, 1),
                        intArrayOf(0, 2, 2),
                        intArrayOf(2, 3, 2),
                    ),
                    5,
                    intArrayOf(1, 10, 1, 0),
                    0,
                    3,
                ),
            equalTo<LongArray>(longArrayOf(4, 3)),
        )
    }

    @Test
    fun minTimeMaxPower9() {
        // Minimum time takes priority over maximum power
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    4,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 3, 1),
                        intArrayOf(0, 2, 5),
                        intArrayOf(2, 3, 5),
                    ),
                    10,
                    intArrayOf(0, 9, 0, 0),
                    0,
                    3,
                ),
            equalTo<LongArray>(longArrayOf(2, 1)),
        )
    }

    @Test
    fun minTimeMaxPower10() {
        // Edges are directed: reverse edge does not make target reachable
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(2, arrayOf<IntArray>(intArrayOf(1, 0, 1)), 5, intArrayOf(0, 0), 0, 1),
            equalTo<LongArray>(longArrayOf(-1, -1)),
        )
    }

    @Test
    fun minTimeMaxPower11() {
        // Zero power and zero costs: travel still possible
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 4), intArrayOf(1, 2, 6)),
                    0,
                    intArrayOf(0, 0, 0),
                    0,
                    2,
                ),
            equalTo<LongArray>(longArrayOf(10, 0)),
        )
    }

    @Test
    fun minTimeMaxPower12() {
        // Node 1 is first reached early with too little power,
        // then revisited later with more power, which allows reaching the target
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(0, 2, 1),
                        intArrayOf(2, 1, 1),
                        intArrayOf(0, 3, 1),
                        intArrayOf(3, 1, 2),
                        intArrayOf(1, 4, 1),
                    ),
                    6,
                    intArrayOf(0, 3, 5, 0, 0),
                    0,
                    4,
                ),
            equalTo<LongArray>(longArrayOf(4, 3)),
        )
    }

    @Test
    fun minTimeMaxPower13() {
        assertThat<LongArray>(
            Solution()
                .minTimeMaxPower(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(4, 4, 9),
                        intArrayOf(0, 2, 2),
                        intArrayOf(4, 1, 1),
                        intArrayOf(0, 2, 9),
                        intArrayOf(0, 4, 1),
                        intArrayOf(3, 4, 5),
                        intArrayOf(2, 1, 5),
                        intArrayOf(0, 0, 6),
                        intArrayOf(2, 4, 10),
                        intArrayOf(3, 4, 8),
                        intArrayOf(2, 3, 3),
                        intArrayOf(0, 1, 1),
                        intArrayOf(4, 0, 5),
                        intArrayOf(0, 3, 4),
                        intArrayOf(0, 1, 10),
                        intArrayOf(0, 0, 1),
                        intArrayOf(0, 2, 7),
                        intArrayOf(2, 0, 10),
                        intArrayOf(2, 0, 10),
                        intArrayOf(0, 3, 9),
                    ),
                    5,
                    intArrayOf(4, 2, 1, 4, 2),
                    0,
                    4,
                ),
            equalTo<LongArray>(longArrayOf(1, 1)),
        )
    }
}
