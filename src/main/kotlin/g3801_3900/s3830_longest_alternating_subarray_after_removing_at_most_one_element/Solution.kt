package g3801_3900.s3830_longest_alternating_subarray_after_removing_at_most_one_element

// #Hard #Array #Dynamic_Programming #Enumeration #Senior_Staff #Weekly_Contest_487
// #2026_07_20_Time_13_ms_(100.00%)_Space_176.55_MB_(93.88%)

import kotlin.math.max

class Solution {
    fun longestAlternating(nums: IntArray?): Int {
        if (nums == null || nums.size < 2) {
            return 0
        }
        val state = State()
        while (state.right < nums.size) {
            val direction = nums[state.right].compareTo(nums[state.right - 1])
            processDirection(state, direction)
        }
        return state.maxLength
    }

    private fun processDirection(state: State, direction: Int) {
        if (direction == 0) {
            processEqualValues(state)
            return
        }
        val currentUp = direction > 0
        if (isRepeatedDirection(state, currentUp)) {
            processRepeatedDirection(state)
        } else {
            processAlternatingDirection(state)
        }
        state.up = currentUp
    }

    private fun isRepeatedDirection(state: State, currentUp: Boolean): Boolean =
        state.up != null && state.up == currentUp

    private fun processRepeatedDirection(state: State) {
        if (state.used) {
            resetToUsedIndex(state)
            return
        }
        state.used = true
        state.usedIndex = state.right - 1
        updateMax(state, state.right - state.left)
        state.right++
    }

    private fun processAlternatingDirection(state: State) {
        var length = state.right - state.left
        if (!state.used) {
            length++
        }
        updateMax(state, length)
        state.right++
    }

    private fun processEqualValues(state: State) {
        if (state.used) {
            resetToUsedIndex(state)
            return
        }
        state.used = true
        state.usedIndex = state.right
        updateMax(state, state.right - state.left)
        state.right++
    }

    private fun resetToUsedIndex(state: State) {
        state.used = false
        state.left = state.usedIndex
    }

    private fun updateMax(state: State, length: Int) {
        state.maxLength = max(state.maxLength, length)
    }

    private class State {
        var left = 0
        var right = 1
        var up: Boolean? = null
        var used = false
        var usedIndex = 0
        var maxLength = 0
    }
}
