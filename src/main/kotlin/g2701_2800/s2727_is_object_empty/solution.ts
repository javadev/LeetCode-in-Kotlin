// #Easy #2023_08_03_Time_49_ms_(98.24%)_Space_44.6_MB_(79.35%)

function isEmpty(obj: Record<string, any> | any[]): boolean {
    return Object.keys(obj).length === 0
}

export { isEmpty }
