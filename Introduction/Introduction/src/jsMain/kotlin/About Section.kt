import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun about() {

    var title by remember {
        mutableStateOf("ABOUT SECTION")
    }

    Div(
        attrs = {
            style {
                backgroundColor(Color.orangered)
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                flexWrap(FlexWrap.Wrap)
                padding(24.px)
            }
        }
    ) {

        Span(
            attrs = {
                style {
                    color(Color.black)
                    fontSize(24.px)
                }
            }
        ) {
            Text(title)
        }

        Button(
            attrs = {
                style {
                    backgroundColor(Color.navi)
                }
                onClick {
                    //  on click element
                    title = "CLICKED TITLE"
                }
                onDoubleClick {
                    title = "DOUBLE CLICKED TITLE"
                }
            }
        ) {
            Text("Click Me!")
        }
    }
}