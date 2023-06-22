package g1801_1900.s1845_seat_reservation_manager

// #Medium #Design #Heap_Priority_Queue #Programming_Skills_II_Day_17
// #2023_06_22_Time_834_ms_(100.00%)_Space_94.6_MB_(91.67%)

import java.util.PriorityQueue
import java.util.Queue

class SeatManager(n: Int) {
    private val seats: Queue<Int>
    private var smallest: Int

    init {
        seats = PriorityQueue()
        smallest = 0
    }

    fun reserve(): Int {
        return if (seats.isEmpty()) ++smallest else seats.poll()
    }

    fun unreserve(seatNumber: Int) {
        seats.offer(seatNumber)
    }
}
