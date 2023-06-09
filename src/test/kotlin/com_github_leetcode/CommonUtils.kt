package com_github_leetcode

import java.util.Collections

object CommonUtils {
    fun printArray(nums: IntArray) {
        for (i in nums) {
            print("$i, ")
        }
        println()
    }

    fun printArray(nums: DoubleArray) {
        for (i in nums) {
            print("$i, ")
        }
        println()
    }

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

    fun convertLeetCodeRegular2DCharArrayInputIntoJavaArray(input: String): Array<CharArray>? {
        /*
         * LeetCode 2-d char array usually comes in like this:
         * ["#"," ","#"],[" "," ","#"],["#","c"," "] which is wrapped in double quotes instead
         * of single quotes which makes it not usable in Java code.
         * This method helps with the conversion.
         */
        val arrays = input.split("],\\[".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val m = arrays.size
        val n = arrays[1].split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray().size
        val ans = Array(m) { CharArray(n) }
        for (i in 0 until m) {
            if (i == 0) {
                val str = arrays[i].substring(1)
                val strs = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                for (j in strs.indices) {
                    ans[i][j] = strs[j][1]
                }
            } else if (i == m - 1) {
                val str = arrays[i].substring(0, arrays[i].length - 1)
                val strs = str.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                for (j in strs.indices) {
                    ans[i][j] = strs[j][1]
                }
            } else {
                val strs = arrays[i].split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                for (j in strs.indices) {
                    ans[i][j] = strs[j][1]
                }
            }
        }
        return ans
    }

    fun convertLeetCodeRegularRectangleArrayInputIntoJavaArray(input: String): Array<IntArray>? {
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

    fun convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(input: String): Array<IntArray?>? {
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
        return output
    }

    fun convertLeetCode2DStringArrayInputIntoJavaArray(input: String): MutableList<MutableList<String?>> {
        /*
         * How to copy LeetCode 2-d String array into this method:
         * 1. remove the beginning and ending quotes;
         * 2. put double quotes into this method parameter;
         * 3. copy the input into the double quotes.
         *
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * [["A","B"],["C"],["B","C"],["D"]]
         * The expected input for this method is: "[\"A\",\"B\"],[\"C\"],[\"B\",\"C\"],[\"D\"]"
         * just copy the LeetCode input: ["A","B"],["C"],["B","C"],["D"] into double quotes in Java,
         * it'll auto escape the double quotes.
         * i.e. strip off the beginning and ending square brackets, that's it.
         * The output of this method will be a standard Java 2-d array.
         * */
        val arrays = input.split("],\\[".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val result: MutableList<MutableList<String?>> = ArrayList()
        for (i in arrays.indices) {
            val level: MutableList<String?> = ArrayList()
            val strings: Array<String?> = if (i == 0) {
                arrays[i].substring(1).split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            } else if (i == arrays.size - 1) {
                arrays[i].substring(0, arrays[i].length - 1).split(",".toRegex()).dropLastWhile { it.isEmpty() }
                    .toTypedArray()
            } else {
                arrays[i].split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            }
            Collections.addAll(level, *strings)
            result.add(level)
        }
        return result
    }

    fun convertLeetCode1DStringArrayInputIntoJavaArray(input: String): List<String>? {
        /*
         * LeetCode 2-d array input usually comes like this: each row could have different length
         * ["A","B","C"]
         * The expected input for this method is: "[\"A\",\"B\",\"C\"]"
         * just copy the LeetCode input: ["A","B","C"] into double quotes in Java,
         * it'll auto escape the double quotes.
         * The output of this method will be a standard Java 1-d array.
         * */
        val arrays = input.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val result: MutableList<String> = ArrayList()
        for (i in arrays.indices) {
            val word: String = if (i == 0) {
                arrays[i].substring(1)
            } else if (i == arrays.size - 1) {
                arrays[i].substring(0, arrays[i].length - 1)
            } else {
                arrays[i]
            }
            result.add(word)
        }
        return result
    }
}
