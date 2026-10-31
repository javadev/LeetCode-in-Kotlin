3890\. Integers With Multiple Sum of Two Cubes

Medium

You are given an integer `n`.

An integer `x` is considered **good** if there exist **at least** two **distinct** pairs `(a, b)` such that:

*   `a` and `b` are positive integers.
*   `a <= b`
*   <code>x = a<sup>3</sup> + b<sup>3</sup></code>

Return an array containing all good integers **less than or equal to** `n`, sorted in ascending order.

**Example 1:**

**Input:** n = 4104

**Output:** [1729,4104]

**Explanation:**

Among integers less than or equal to 4104, the good integers are:

*   1729: <code>1<sup>3</sup> + 12<sup>3</sup> = 1729</code> and <code>9<sup>3</sup> + 10<sup>3</sup> = 1729</code>.
*   4104: <code>2<sup>3</sup> + 16<sup>3</sup> = 4104</code> and <code>9<sup>3</sup> + 15<sup>3</sup> = 4104</code>.

Thus, the answer is `[1729, 4104]`.

**Example 2:**

**Input:** n = 578

**Output:** []

**Explanation:**

There are no good integers less than or equal to 578, so the answer is an empty array.

**Constraints:**

*   <code>1 <= n <= 10<sup>9</sup></code>