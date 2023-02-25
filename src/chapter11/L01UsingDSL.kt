package chapter10

var counter = 0

/**
 * Trying to build this using DSL
 *
 * <div class="dropdown">
    <button class="btn dropdown-toggle">
    Dropdown
    <span class="caret"></span>
    </button>
    <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li role="separator" class="divider"></li>
        <li class="dropdown-header">Header</li>
        <li><a href="#">Separated link</a></li>
    </ul>
    </div>
 */

class HTML {
    fun createHTML(body: HTML.()->Unit) : HTML {
        return apply(body)          // This apply is just the function.apply
    }

    fun div(className : String) {
        print(Div()(className))
    }
}

class Div() {
    operator fun invoke (className:String) : String = "<div class=\"$className\"></div>"
}




fun main() {
    HTML().createHTML {
        div("divclass")
    }
}