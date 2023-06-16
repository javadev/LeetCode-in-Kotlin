package g1301_1400.s1386_cinema_seat_allocation

// #Medium #Array #Hash_Table #Greedy #Bit_Manipulation
// #2023_06_06_Time_397_ms_(100.00%)_Space_51.2_MB_(66.67%)

class Solution {
    fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int {
        val occupiedFamilySeats: MutableMap<Int, IntArray> = HashMap()
        for (reservedSeat in reservedSeats) {
            val row = reservedSeat[0]
            val col = reservedSeat[1]
            if (col == 1 || col == 10) {
                continue
            }
            val rowFamilySeats = occupiedFamilySeats.getOrDefault(row, IntArray(3))
            if (col == 2 || col == 3) {
                // mark left family seating as occupied
                rowFamilySeats[0] = 1
                occupiedFamilySeats[row] = rowFamilySeats
            }
            if (col == 8 || col == 9) {
                // mark right family seating as occupied
                rowFamilySeats[2] = 1
                occupiedFamilySeats[row] = rowFamilySeats
            }
            if (col == 4 || col == 5) {
                // mark left family seating as occupied
                rowFamilySeats[0] = 1
                // mark min family seating as occupied
                rowFamilySeats[1] = 1
                occupiedFamilySeats[row] = rowFamilySeats
            }
            if (col == 6 || col == 7) {
                // mark min family seating as occupied
                rowFamilySeats[1] = 1
                // mark right family seating as occupied
                rowFamilySeats[2] = 1
                occupiedFamilySeats[row] = rowFamilySeats
            }
        }
        // max number of family seats per row is 2, so we start that minus the rows for which we
        // have reservations
        var count = n * 2 - 2 * occupiedFamilySeats.size
        // for each row with reservations, count remaining family seatings
        for (familySeats in occupiedFamilySeats.values) {
            if (familySeats[0] == 0) {
                count++
            }
            if (familySeats[2] == 0) {
                count++
            }
            if (familySeats[0] != 0 && familySeats[2] != 0 && familySeats[1] == 0) {
                count++
            }
        }
        return count
    }
}
