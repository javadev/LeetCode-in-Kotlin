// #Easy #2023_08_03_Time_132_ms_(96.70%)_Space_56.9_MB_(73.28%)

function sortBy(arr: any[], fn: Function): any[] {
    let swap: any = (a: any, b: any)=>{return (fn(a) < fn(b))?-1:1;};
    return arr.sort(swap)
}

export { sortBy }
