// #Easy #2023_07_27_Time_55_ms_(96.89%)_Space_45.2_MB_(71.69%)

function chunk(arr: any[], size: number): any[][] {
    if (arr.length === 0) return []
    if (size >= arr.length) return [arr]
    let i: number = 0
    let res: Array<Array<number>> = []
    while (i < arr.length) {
        res.push(arr.slice(i, i + size))
        i += size
    }
    return res
}

export { chunk }
