package g3601_3700.s3629_minimum_jumps_to_reach_end_via_prime_teleportation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minJumps() {
        assertThat<Int>(Solution().minJumps(intArrayOf(1, 2, 4, 6)), equalTo<Int>(2))
    }

    @Test
    fun minJumps2() {
        assertThat<Int>(Solution().minJumps(intArrayOf(2, 3, 4, 7, 9)), equalTo<Int>(2))
    }

    @Test
    fun minJumps3() {
        assertThat<Int>(Solution().minJumps(intArrayOf(4, 6, 5, 8)), equalTo<Int>(3))
    }

    @Test
    fun minJumps4() {
        assertThat<Int>(
            Solution()
                .minJumps(
                    intArrayOf(
                        893, 786, 607, 137, 69, 381, 790, 233, 15, 42, 7, 764, 890, 269,
                        84, 262, 870, 514, 514, 650, 269, 485, 760, 181, 489, 107, 585,
                        428, 862, 563,
                    ),
                ),
            equalTo<Int>(21),
        )
    }

    @Test
    fun minJumps5() {
        assertThat<Int>(Solution().minJumps(intArrayOf(4)), equalTo<Int>(0))
    }
}
