package g3801_3900.s3829_design_ride_sharing_system

import java.util.LinkedList
import java.util.Queue

// #Medium #Hash_Table #Design #Queue #Data_Stream #Staff #Weekly_Contest_487
// #2026_07_20_Time_42_ms_(100.00%)_Space_48.36_MB_(31.76%)

class RideSharingSystem {
    var rider: Queue<Int> = LinkedList<Int>()
    var driver: Queue<Int> = LinkedList<Int>()
    var cancel: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()

    fun addRider(riderId: Int) {
        if (cancel.containsKey(riderId)) {
            cancel.remove(riderId)
        }
        rider.add(riderId)
    }

    fun addDriver(driverId: Int) {
        driver.add(driverId)
    }

    fun matchDriverWithRider(): IntArray? {
        while (!rider.isEmpty() && cancel.containsKey(rider.peek())) {
            rider.poll()
        }
        if (!rider.isEmpty() && !driver.isEmpty()) {
            val ans = intArrayOf(driver.peek()!!, rider.peek()!!)
            rider.poll()
            driver.poll()
            return ans
        }
        return intArrayOf(-1, -1)
    }

    fun cancelRider(riderId: Int) {
        cancel.put(riderId, 1)
    }
}

/*
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
