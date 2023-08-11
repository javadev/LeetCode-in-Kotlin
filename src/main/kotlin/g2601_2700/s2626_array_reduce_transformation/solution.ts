// #Easy #2023_07_17_Time_54_ms_(95.99%)_Space_44.8_MB_(40.89%)

type Fn = (accum: number, curr: number) => number

function reduce(nums: number[], fn: Fn, init: number): number {
    let accumulator = init
    nums.forEach((num) => {
        accumulator = fn(accumulator, num)
    })

    return accumulator
}

export { reduce }
