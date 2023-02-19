package chapter9

/**
 * Both in and out are used. P can be any lower bound, R can be any upper bound.
 */
interface Function1<in P, out R> {
    operator fun invoke(p: P): R
}

