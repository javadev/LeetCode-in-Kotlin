package g1501_1600.s1595_minimum_cost_to_connect_two_groups_of_points

// #Hard #Array #Dynamic_Programming #Matrix #Bit_Manipulation #Bitmask
class Solution {
    fun connectTwoGroups(cost: List<List<Int>>): Int {
        // size of set 1
        val m = cost.size
        // size of set 2
        val n = cost[0].size
        val mask = 1 shl m
        // min cost to connect nodes in set 1 (of different states);
        var record = IntArray(mask)
        record.fill(Int.MAX_VALUE)
        // since we use record to get the min cost of connecting nodes in set 1
        // we shall go through nodes in set 2 one by one, to make sure they are connected
        // base case:
        record[0] = 0
        for (col in 0 until n) {
            val tmpRecord = IntArray(mask)
            tmpRecord.fill(Int.MAX_VALUE)
            // try connection with each of the node in set 1
            for (row in 0 until m) {
                for (msk in 0 until mask) {
                    // the new min cost should be based on the cost record of connecting previous
                    // node in set 2;
                    val newMask = msk or (1 shl row)
                    if (record[msk] != Int.MAX_VALUE) {
                        tmpRecord[newMask] = Math.min(tmpRecord[newMask], record[msk] + cost[row][col])
                    }
                    // if row nodes in this state has not been connected yet, and the msk is
                    // achievable by connecting the current node
                    // then check whether connect the current node multiple times will benefit the
                    // cost
                    if (msk and (1 shl row) == 0 && tmpRecord[msk] != Int.MAX_VALUE) {
                        tmpRecord[newMask] = Math.min(
                            tmpRecord[newMask],
                            tmpRecord[msk] + cost[row][col]
                        )
                    }
                }
            }
            // use tmpRecord to update record
            record = tmpRecord
        }
        return record[(1 shl m) - 1]
    }
}
