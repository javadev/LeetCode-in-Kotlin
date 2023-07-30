// #Easy #2023_07_16_Time_49_ms_(97.92%)_Space_42.1_MB_(96.08%)

async function sleep(millis: number): Promise<void> {
    return new Promise<void>((resolve, reject) => {
        setTimeout(resolve, millis)
    })
}

/*
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */

export { sleep }
