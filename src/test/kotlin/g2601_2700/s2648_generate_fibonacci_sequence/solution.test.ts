// tslint:disable:no-magic-numbers
import { fibGenerator } from 'src/main/kotlin/g2601_2700/s2648_generate_fibonacci_sequence/solution'
import { expect, test } from 'vitest'

test('fibGenerator', () => {
    const counter = fibGenerator()
    expect(gen.next().value).toEqual(0)
    expect(gen.next().value).toEqual(1)
    expect(gen.next().value).toEqual(1)
    expect(gen.next().value).toEqual(2)
    expect(gen.next().value).toEqual(3)
})
