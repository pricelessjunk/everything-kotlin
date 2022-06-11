package chapter4

/**
 * internal is only visible within a module. No idea what that means.
 *
 * protected doesn't apply to package visibility. It is truely only for the same or children classes
 */
internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")

    protected fun whisper() = println("Let's talk!")
}

// ERROR: 'public' member exposes its 'internal' receiver type TalkativeButton
//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}