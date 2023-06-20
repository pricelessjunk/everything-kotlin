package chapter4

interface State : java.io.Serializable

interface View {

    fun getCurrentState(): State

    fun restoreState(state: State) {}
}


class Button2 : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) { /*...*/ }

    // This is the same as a static nested class in java. So it cannot access variables of outer class
    class ButtonState : State {
        // ERROR
        // fun getOuterReference(): Button2 = this@Button2
    }

    // This is a proper inner class. So it can access variables from outer class
    inner class ButtonState2 : State {
        fun getOuterReference(): Button2 = this@Button2
    }
}

///* Java */
//public class Button2 implements View {
//    @Override
//    public State getCurrentState() {
//        return new ButtonState();
//    }
//    @Override
//    public void restoreState(State state) { /*...*/ }
//
//    public class ButtonState implements State { /*...*/ }
//}

fun main() {
    Button2()
}
