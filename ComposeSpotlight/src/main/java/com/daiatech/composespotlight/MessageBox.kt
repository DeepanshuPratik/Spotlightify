package com.daiatech.composespotlight


import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.shape.CircleShape
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
    private val shape: Shape,
    private val position: IntOffset,
    private val componentSize: IntSize,

    ): Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val cornerRadius = with(density) { cornerRadius.toPx() }
        val path = Path().apply {
            when (shape) {
                RectangleShape -> {
                    moveTo(
                        position.x.toFloat() + componentSize.width,
                        position.y.toFloat() + componentSize.height
                    )
                    lineTo(
                        position.x + componentSize.width + with(density) {3.dp.toPx()},
                        position.y + componentSize.height + with(density) {11.dp.toPx()}
                    )
                    lineTo(
                        position.x + componentSize.width + with(density) {11.dp.toPx()},
                        position.y + componentSize.height + with(density) {3.dp.toPx()}
                    )

                    addRoundRect(
                        RoundRect(
                            left = position.x.toFloat() + componentSize.width + with(density) {3.dp.toPx()},
                            top = position.y.toFloat() + componentSize.height + with(density) {3.dp.toPx()},
                            right = position.x + componentSize.width + textBoxSize.first + with(density) {boxPadding.toPx()},
                            bottom = position.y + componentSize.height + textBoxSize.second + with(density) {boxPadding.toPx()},
                            radiusX = cornerRadius,
                            radiusY = cornerRadius
                        )
                    )
                }

                CircleShape -> {
                    moveTo(
                        1.7071f * (position.x + componentSize.width.toFloat() / 2) ,
                        position.y + componentSize.height.toFloat() / 2 + 0.7071f * (position.x + componentSize.width.toFloat() / 2)
                    )
                    lineTo(
                        position.x.toFloat() + componentSize.width,// + 3.dp.toPx(),
                        position.y + componentSize.height + with(density) {8.dp.toPx()}
                    )
                    lineTo(
                        position.x + componentSize.width + with(density) {8.dp.toPx()},
                        position.y.toFloat() + componentSize.height // + 3.dp.toPx()
                    )
                    addRoundRect(
                        RoundRect(
                            left = position.x.toFloat() + componentSize.width,// + 3.dp.toPx(),
                            top = position.y.toFloat() + componentSize.height,// + 3.dp.toPx(),
                            right = position.x + componentSize.width + textBoxSize.first + with(density) {boxPadding.toPx()},
                            bottom = position.y + componentSize.height + textBoxSize.second + with(density) {boxPadding.toPx()},
                            radiusX = cornerRadius,
                            radiusY = cornerRadius
                        )
                    )
                }
            }

            close()
        }

        return Outline.Generic(path)
    }
}

