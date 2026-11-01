3878\. Count Good Subarrays

Hard

You are given an integer array `nums`.

A **non-empty subarrays** is called **good** if the **bitwise OR** of all its elements is equal to **at least one** element present in that subarray.

Return the number of good subarrays in `nums`.

Here, the bitwise OR of two integers `a` and `b` is denoted by `a | b`.

**Example 1:**

**Input:** nums = [4,2,3]

**Output:** 4

**Explanation:**

The subarrays of `nums` are:

| Subarray    | Bitwise OR        | Present in Subarray |
| ----------- | ----------------- | ------------------- |
| `[4]`       | `4 = 4`           | Yes                 |
| `[2]`       | `2 = 2`           | Yes                 |
| `[3]`       | `3 = 3`           | Yes                 |
| `[4, 2]`    | `4 \| 2 = 6`      | No                  |
| `[2, 3]`    | `2 \| 3 = 3`      | Yes                 |
| `[4, 2, 3]` | `4 \| 2 \| 3 = 7` | No                  |

Thus, the good subarrays of `nums` are `[4]`, `[2]`, `[3]` and `[2, 3]`. Thus, the answer is 4.

**Example 2:**

**Input:** nums = [1,3,1]

**Output:** 6

**Explanation:**

Any subarray of `nums` containing 3 has bitwise OR equal to 3, and subarrays containing only 1 have bitwise OR equal to 1.

In both cases, the result is present in the subarray, so all subarrays are good, and the answer is 6.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>9</sup></code>