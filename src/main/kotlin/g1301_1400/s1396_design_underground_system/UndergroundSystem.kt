package g1301_1400.s1396_design_underground_system

// #Medium #String #Hash_Table #Design #2023_06_06_Time_703_ms_(99.29%)_Space_76.5_MB_(99.29%)

import java.util.LinkedList

class UndergroundSystem {
    private class StationAndTime(var station: String, var time: Int)

    private val averageTimeMap: MutableMap<String, DoubleArray>
    private val travelerMap: MutableMap<Int, LinkedList<StationAndTime>>

    init {
        averageTimeMap = HashMap()
        travelerMap = HashMap()
    }

    fun checkIn(id: Int, stationName: String, t: Int) {
        travelerMap.putIfAbsent(id, LinkedList())
        travelerMap[id]!!.add(StationAndTime(stationName, t))
    }

    fun checkOut(id: Int, stationName: String, t: Int) {
        val list = travelerMap[id]!!
        val stationAndTime = list.last
        val startToEndStation: String = stationAndTime.station + "->" + stationName
        val duration: Int = t - stationAndTime.time
        if (averageTimeMap.containsKey(startToEndStation)) {
            val pair = averageTimeMap[startToEndStation]
            val newAverage = (pair!![0] * pair[1] + duration) / (pair[1] + 1)
            averageTimeMap[startToEndStation] = doubleArrayOf(newAverage, pair[1] + 1)
        } else {
            averageTimeMap[startToEndStation] = doubleArrayOf(duration.toDouble(), 1.0)
        }
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        return averageTimeMap["$startStation->$endStation"]!![0]
    }
}
/*
 * Your UndergroundSystem object will be instantiated and called as such:
 * var obj = UndergroundSystem()
 * obj.checkIn(id,stationName,t)
 * obj.checkOut(id,stationName,t)
 * var param_3 = obj.getAverageTime(startStation,endStation)
 */
