package g3501_3600.s3509_maximum_product_of_subsequences_with_an_alternating_sum_equal_to_k

// #Hard #2025_04_06_Time_91_ms_(100.00%)_Space_59.23_MB_(100.00%)

import java.util.BitSet
import kotlin.math.max

class Solution {
    internal class StateKey(var prod: Int, var parity: Int) {
        override fun hashCode(): Int {
            return prod * 31 + parity
        }

        override fun equals(obj: Any?): Boolean {
            if (obj !is StateKey) {
                return false
            }
            val other = obj
            return this.prod == other.prod && this.parity == other.parity
        }
    }

    fun maxProduct(nums: IntArray, k: Int, limit: Int): Int {
        val melkarvothi = nums.clone()
        val offset = 1000
        val size = 2100
        val dp: MutableMap<StateKey, BitSet> = HashMap<StateKey, BitSet>()
        for (x in melkarvothi) {
            val newStates: MutableMap<StateKey, BitSet> = HashMap<StateKey, BitSet>()
            for (entry in dp.entries) {
                val key: StateKey = entry.key
                val currentProd = key.prod
                val newProd: Int
                if (x == 0) {
                    newProd = 0
                } else {
                    if (currentProd == 0) {
                        newProd = 0
                    } else if (currentProd == -1) {
                        newProd = -1
                    } else {
                        val mult = currentProd.toLong() * x
                        if (mult > limit) {
                            newProd = -1
                        } else {
                            newProd = mult.toInt()
                        }
                    }
                }
                val newParity = 1 - key.parity
                val bs: BitSet = entry.value
                val shifted: BitSet
                if (key.parity == 0) {
                    shifted = shift(bs, x, size)
                } else {
                    shifted = shift(bs, -x, size)
                }
                val newKey = StateKey(newProd, newParity)
                var current = newStates[newKey]
                if (current == null) {
                    current = BitSet(size)
                    newStates.put(newKey, current)
                }
                current.or(shifted)
            }
            if (x == 0 || x <= limit) {
                val parityStart = 1
                val newKey = StateKey(x, parityStart)
                var bs = newStates[newKey]
                if (bs == null) {
                    bs = BitSet(size)
                    newStates.put(newKey, bs)
                }
                val pos = x + offset
                if (pos >= 0 && pos < size) {
                    bs.set(pos)
                }
            }
            for (entry in newStates.entries) {
                val key = entry.key
                val newBS: BitSet = entry.value
                val oldBS = dp[key]
                if (oldBS == null) {
                    dp.put(key, newBS)
                } else {
                    oldBS.or(newBS)
                }
            }
        }
        var answer = -1
        val targetIdx = k + offset
        for (entry in dp.entries) {
            val key: StateKey = entry.key
            if (key.prod == -1) {
                continue
            }
            val bs: BitSet = entry.value
            if (targetIdx >= 0 && targetIdx < size && bs.get(targetIdx)) {
                answer = max(answer.toDouble(), key.prod.toDouble()).toInt()
            }
        }
        return answer
    }

    private fun shift(bs: BitSet, shiftVal: Int, size: Int): BitSet {
        val res = BitSet(size)
        if (shiftVal >= 0) {
            var i = bs.nextSetBit(0)
            while (i >= 0) {
                val newIdx = i + shiftVal
                if (newIdx < size) {
                    res.set(newIdx)
                }
                i = bs.nextSetBit(i + 1)
            }
        } else {
            val shiftRight = -shiftVal
            var i = bs.nextSetBit(0)
            while (i >= 0) {
                val newIdx = i - shiftRight
                if (newIdx >= 0) {
                    res.set(newIdx)
                }
                i = bs.nextSetBit(i + 1)
            }
        }
        return res
    }
}
