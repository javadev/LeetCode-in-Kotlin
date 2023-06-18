package g1601_1700.s1603_design_parking_system

// #Easy #Design #Simulation #Counting #Programming_Skills_I_Day_12_Class_and_Object
// #2023_06_13_Time_376_ms_(31.83%)_Space_48_MB_(96.70%)

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private val slots = IntArray(3)

    init {
        slots[0] = big
        slots[1] = medium
        slots[2] = small
    }

    fun addCar(carType: Int): Boolean {
        return if (carType == 1) {
            if (slots[0] > 0) {
                slots[0]--
                true
            } else {
                false
            }
        } else if (carType == 2) {
            if (slots[1] > 0) {
                slots[1]--
                true
            } else {
                false
            }
        } else {
            if (slots[2] > 0) {
                slots[2]--
                true
            } else {
                false
            }
        }
    }
}
/*
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */
