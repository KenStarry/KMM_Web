import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import stylesheets.AppStylesheets

fun main() {
    var count: Int by mutableStateOf(0)

    //  this is the main node that compose will use to handle its DOM tree
    renderComposable(
        rootElementId = "root"
    ) {

        Style(AppStylesheets)

        Div(
            {
                style {
                    backgroundColor(Color.aquamarine)
                    padding(25.px)
                }
            }
        ) {

            Input(type = InputType.Text) {

            }

            //  specifying a link
            A(
                attrs = {
                    href("https://github.com")
                    target(ATarget.Blank)
                    hreflang("en")

                    style {
                        color(Color.orangered)
                    }
                }
            ) {
                Text("This is a link to a webpage")
            }

        }

        Div({
            style {
                backgroundColor(Color.aliceblue)
                width(500.px)
                height(500.px)
                padding(25.px)
            }
        }) {

            Button(attrs = {
                onClick { count -= 1 }
            }) {
                Text("-")
            }

            Span({ style { padding(15.px) } }) {
                Text("$count")
            }

            Button(attrs = {
                onClick { count += 1 }
            }) {
                Text("+")
            }
        }

        about()

        Section {
            Text("Custom section")
        }
    }
}

//  section using the custom stylesheets
@Composable
fun Section(
    content: @Composable () -> Unit
) {
    Div(
        attrs = {
            classes(AppStylesheets.section)
        }
    ) { content() }
}

