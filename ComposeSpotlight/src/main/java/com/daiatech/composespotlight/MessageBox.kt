package com.daiatech.composespotlight


import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

class SpeechBubbleShape(
    private val cornerRadius: Dp = 8.dp,
    private val boxPadding: Dp = 10.dp,
    private val textBoxSize: Pair<Int,Int>,
    private val moveToCoordinates : Offset,
    private val tipSize: Dp = 4.dp,
    private val textBoxDirection: TextMessageDirection

    ): Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val cornerRadius = with(density) { cornerRadius.toPx() }
        val tipSize = with(density) {tipSize.toPx()}
        val textBoxPadding = with(density) {boxPadding.toPx()}
        val textBoxWidth = textBoxSize.first
        val textBoxHeight = textBoxSize.second

        val path = Path().apply {
            when(textBoxDirection){
                TextMessageDirection.LEFT -> {
                    lineTo(
                        moveToCoordinates.x - tipSize - cornerRadius,
                        moveToCoordinates.y + tipSize
                    )
                    lineTo(
                        moveToCoordinates.x - tipSize,
                        moveToCoordinates.y + tipSize + cornerRadius
                    )

                    addRoundRect(
                        RoundRect(
                            left = moveToCoordinates.x - tipSize - textBoxWidth - textBoxPadding,
                            top = moveToCoordinates.y + tipSize,
                            right = moveToCoordinates.x - tipSize,
                            bottom = moveToCoordinates.y + tipSize + textBoxHeight + textBoxPadding,
                            radiusX = cornerRadius,
                            radiusY = cornerRadius
                        )
                    )
                }
                TextMessageDirection.RIGHT -> {
                    moveTo( moveToCoordinates.x, moveToCoordinates.y )
                    lineTo(
                        moveToCoordinates.x + tipSize,
                        moveToCoordinates.y + tipSize + cornerRadius
                    )
                    lineTo(
                        moveToCoordinates.x + tipSize + cornerRadius,
                        moveToCoordinates.y + tipSize
                    )

                    addRoundRect(
                        RoundRect(
                            left = moveToCoordinates.x + tipSize,
                            top = moveToCoordinates.y + tipSize,
                            right = moveToCoordinates.x + tipSize + textBoxWidth + textBoxPadding,
                            bottom = moveToCoordinates.y + tipSize + textBoxHeight + textBoxPadding,
                            radiusX = cornerRadius,
                            radiusY = cornerRadius
                        )
                    )
                }
                TextMessageDirection.MIDDLE -> {

                }
            }
            close()
        }

        return Outline.Generic(path)
    }
}

enum class TextMessageDirection {
    LEFT, MIDDLE, RIGHT
}

