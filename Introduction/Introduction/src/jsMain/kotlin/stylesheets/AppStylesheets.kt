package stylesheets

import org.jetbrains.compose.web.css.*

object AppStylesheets : StyleSheet() {

    val section by style {

        display(DisplayStyle.Flex)
        padding(24.px)

        //  custom property
        property(
            propertyName = "font-family",
            value = "Arial, Helvetica, sans-serif"
        )
    }
}