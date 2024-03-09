package com.daiatech.composespotlight


import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun MessageBoxWithTail(
    modifier: Modifier = Modifier,
    textBoxColor: Color,
    shape: Shape,
    textBlock : Boolean,
    position: IntOffset,
    componentSize: IntSize,
) {
    Canvas(
        modifier = modifier
            .zIndex(Float.MAX_VALUE),
        onDraw = {

            val buttonWidth = componentSize.width // Width of the KButton
            val buttonHeight = componentSize.height // Height of the KButton
            val buttonX = position.x.toFloat() // X-coordinate of the KButton
            val buttonY = position.y.toFloat() // Y-coordinate of the KButton
            val messageBox = Path().apply {
                when (shape) {
                    RectangleShape -> {
                        if(textBlock){
                            moveTo(
                                buttonX + buttonWidth,
                                buttonY + buttonHeight
                            )
                            lineTo(
                                position.x + componentSize.width + 3.dp.toPx(),
                                position.y + componentSize.height + 11.dp.toPx()
                            )
                            lineTo(
                                position.x + componentSize.width + 11.dp.toPx(),
                                position.y + componentSize.height + 3.dp.toPx()
                            )

                            addRoundRect(
                                RoundRect(
                                    left = position.x.toFloat() + componentSize.width + 3.dp.toPx(),
                                    top = position.y.toFloat() + componentSize.height + 3.dp.toPx(),
                                    right = position.x + componentSize.width + 72.dp.toPx(),
                                    bottom = position.y + componentSize.height + 48.dp.toPx(),
                                    radiusX = 8.dp.toPx(),
                                    radiusY = 8.dp.toPx()
                                )
                            )
                        }
                    }

                    CircleShape -> {
                        if (textBlock){
                            moveTo(
                                position.x + 0.853f * componentSize.width.toFloat() ,
                                position.y + 0.853f * componentSize.height.toFloat()
                            )
                            lineTo(
                                position.x.toFloat() + componentSize.width,// + 3.dp.toPx(),
                                position.y + componentSize.height + 8.dp.toPx()
                            )
                            lineTo(
                                position.x + componentSize.width + 8.dp.toPx(),
                                position.y.toFloat() + componentSize.height // + 3.dp.toPx()
                            )
                            addRoundRect(
                                RoundRect(
                                    left = position.x.toFloat() + componentSize.width,// + 3.dp.toPx(),
                                    top = position.y.toFloat() + componentSize.height,// + 3.dp.toPx(),
                                    right = position.x + componentSize.width + 72.dp.toPx(),
                                    bottom = position.y + componentSize.height + 48.dp.toPx(),
                                    radiusX = 8.dp.toPx(),
                                    radiusY = 8.dp.toPx()
                                )
                            )
                        }
                    }
                }
            }
            drawPath(messageBox, SolidColor(textBoxColor))
        }
    )
}