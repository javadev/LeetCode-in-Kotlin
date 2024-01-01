package com_github_leetcode

object CommonUtils {
    fun compareArray(arr1: IntArray, arr2: IntArray): Boolean {
        for (i in arr1) {
            var include = false
            for (j in arr2) {
                if (i == j) {
                    include = true
                    break
                }
            }
            if (!include) {
                return false
            }
        }
        return true
    }

    fun compareArray(arr1: List<Int>, arr2: List<Int>): Boolean {
        for (i in arr1) {
            var include = false
            for (j in arr2) {
                if (i == j) {
                    include = true
                    break
                }
            }
            if (!include) {
                return false
            }
        }
        return true
    }

    fun compareMatrix(mt1: List<List<Int?>>, mt2: List<List<Int?>>): Boolean {
        for (i in mt1) {
            var include = false
            for (j in mt2) {
                if (i.toString() == j.toString()) {
                    include = true
                    break
                }
            }
            if (!include) {
                return false
            }
        }
        return true
    }

    fun convertLeetCodeRegularRectangleArrayInputIntoJavaArray(input: String): Array<IntArray> {
        /*
         * LeetCode 2-d array input usually comes like this: it's a REGULAR rectangle
         * [[448,931],[234,889],[214,962],[576,746]]
         * The expected input for this method is: "[448,931],[234,889],[214,962],[576,746]"
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        val arrays = input.split("],\\[".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val size = arrays[1].split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray().size
        val output = Array(arrays.size) { IntArray(size) }
        for (i in arrays.indices) {
            if (i == 0) {
                val str = arrays[i].substring(1)
                val nums = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                for (j in nums.indices) {
                    output[i][j] = nums[j].toInt()
                }
            } else if (i == arrays.size - 1) {
                val str = arrays[i].substring(0, arrays[i].length - 1)
                val nums = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                for (j in nums.indices) {
                    output[i][j] = nums[j].toInt()
                }
            } else {
                val nums = arrays[i].split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                for (j in nums.indices) {
                    output[i][j] = nums[j].toInt()
                }
            }
        }
        return output
    }

    fun convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(input: String): Array<IntArray> {
        /*
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * [[448,931,123,345],[889],[214,962],[576,746,897]]
         * The expected input for this method is: "[448,931,123,345],[889],[214,962],[576,746,897]"
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        val arrays = input.split("],\\[".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var maxLen = 0
        val sizes = IntArray(arrays.size)
        for (i in arrays.indices) {
            val strs = arrays[i].split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            maxLen = Math.max(maxLen, strs.size)
            sizes[i] = strs.size
        }
        val output = arrayOfNulls<IntArray>(arrays.size)
        if (arrays.size == 1) {
            val str = arrays[0].substring(1, arrays[0].length - 1)
            val nums = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            output[0] = IntArray(sizes[0])
            for (j in 0 until sizes[0]) {
                output[0]!![j] = nums[j].toInt()
            }
        } else {
            for (i in arrays.indices) {
                if (i == 0) {
                    val str = arrays[i].substring(1)
                    val nums = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    output[i] = IntArray(sizes[i])
                    for (j in 0 until sizes[i]) {
                        output[i]!![j] = nums[j].toInt()
                    }
                } else if (i == arrays.size - 1) {
                    val str = arrays[i].substring(0, arrays[i].length - 1)
                    val nums = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    output[i] = IntArray(sizes[i])
                    for (j in 0 until sizes[i]) {
                        output[i]!![j] = nums[j].toInt()
                    }
                } else {
                    val nums = arrays[i].split(",".toRegex()).dropLastWhile { it.isEmpty() }
                        .toTypedArray()
                    output[i] = IntArray(sizes[i])
                    for (j in 0 until sizes[i]) {
                        output[i]!![j] = nums[j].toInt()
                    }
                }
            }
        }
        return output.filterNotNull().toTypedArray()
    }
}
