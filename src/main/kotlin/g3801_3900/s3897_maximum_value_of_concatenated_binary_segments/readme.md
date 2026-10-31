3897\. Maximum Value of Concatenated Binary Segments

Hard

You are given two integer arrays `nums1` and `nums0`, each of size `n`.

*   `nums1[i]` represents the number of `'1'`s in the <code>i<sup>th</sup></code> segment.
*   `nums0[i]` represents the number of `'0'`s in the <code>i<sup>th</sup></code> segment.

For each index `i`, construct a binary segment consisting of:

*   `nums1[i]` occurrences of `'1'` followed by
*   `nums0[i]` occurrences of `'0'`.

You may **rearrange** the order of these **segments** in any way. After rearranging, **concatenate** all segments to form a single binary string.

Return the **maximum** possible integer value of the concatenated binary string.

Since the result can be very large, return the answer **modulo** <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** nums1 = [1,2], nums0 = [1,0]

**Output:** 14

**Explanation:**

*   At index 0, `nums1[0] = 1` and `nums0[0] = 1`, so the segment formed is `"10"`.
*   At index 1, `nums1[1] = 2` and `nums0[1] = 0`, so the segment formed is `"11"`.
*   Reordering the segments as `"11"` followed by `"10"` produces the binary string `"1110"`.
*   The binary number `"1110"` has value 14 which is the maximum possible value.

**Example 2:**

**Input:** nums1 = [3,1], nums0 = [0,3]

**Output:** 120

**Explanation:**

*   At index 0, `nums1[0] = 3` and `nums0[0] = 0`, so the segment formed is `"111"`.
*   At index 1, `nums1[1] = 1` and `nums0[1] = 3`, so the segment formed is `"1000"`.
*   Reordering the segments as `"111"` followed by `"1000"` produces the binary string `"1111000"`.
*   The binary number `"1111000"` has value 120 which is the maximum possible value.

**Constraints:**

*   <code>1 <= n == nums1.length == nums0.length <= 10<sup>5</sup></code>
*   <code>0 <= nums1[i], nums0[i] <= 10<sup>4</sup></code>
*   `nums1[i] + nums0[i] > 0`
*   The total sum of all elements in `nums1` and `nums0` does not exceed 2 \* 10<sup>5</sup>.