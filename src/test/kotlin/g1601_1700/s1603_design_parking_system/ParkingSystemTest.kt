package g1601_1700.s1603_design_parking_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class ParkingSystemTest {
    @Test
    fun parkingSystemTest() {
        val parkingSystem = ParkingSystem(1, 1, 0)
        assertThat(parkingSystem.addCar(1), equalTo(true))
        assertThat(parkingSystem.addCar(2), equalTo(true))
        assertThat(parkingSystem.addCar(3), equalTo(false))
        assertThat(parkingSystem.addCar(1), equalTo(false))
    }
}
