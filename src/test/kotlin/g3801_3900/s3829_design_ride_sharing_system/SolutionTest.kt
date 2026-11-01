package g3801_3900.s3829_design_ride_sharing_system

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rideSharingSystem() {
        val rideSharingSystem = RideSharingSystem()
        rideSharingSystem.addRider(3)
        rideSharingSystem.addDriver(2)
        rideSharingSystem.addRider(1)
        assertThat<IntArray>(
            rideSharingSystem.matchDriverWithRider(),
            equalTo<IntArray>(intArrayOf(2, 3)),
        )
        rideSharingSystem.addDriver(5)
        rideSharingSystem.cancelRider(3)
        assertThat<IntArray>(
            rideSharingSystem.matchDriverWithRider(),
            equalTo<IntArray>(intArrayOf(5, 1)),
        )
        assertThat<IntArray>(
            rideSharingSystem.matchDriverWithRider(),
            equalTo<IntArray>(intArrayOf(-1, -1)),
        )
    }

    @Test
    fun rideSharingSystem2() {
        val rideSharingSystem = RideSharingSystem()
        rideSharingSystem.addRider(8)
        rideSharingSystem.addDriver(8)
        rideSharingSystem.addDriver(6)
        assertThat<IntArray>(
            rideSharingSystem.matchDriverWithRider(),
            equalTo<IntArray>(intArrayOf(8, 8)),
        )
        rideSharingSystem.addRider(2)
        rideSharingSystem.cancelRider(2)
        assertThat<IntArray>(
            rideSharingSystem.matchDriverWithRider(),
            equalTo<IntArray>(intArrayOf(-1, -1)),
        )
    }
}
