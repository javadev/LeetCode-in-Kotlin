// tslint:disable:no-magic-numbers
import { chunk } from 'src/main/kotlin/g2601_2700/s2677_chunk_array/solution'
import { expect, test } from 'vitest'

test('chunk', () => {
    expect(chunk([1,2,3,4,5], 1)).toEqual([[1],[2],[3],[4],[5]])
})

test('chunk', () => {
    expect(chunk([1,9,6,3,2], 3)).toEqual([[1,9,6],[3,2]])
})

test('chunk', () => {
    expect(chunk([8,5,3,2,6], 6)).toEqual([[8,5,3,2,6]])
})

test('chunk', () => {
    expect(chunk([], 1)).toEqual([])
})