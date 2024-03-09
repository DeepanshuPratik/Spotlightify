package com.daiatech.composespotlight

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toOffset
import androidx.compose.ui.zIndex

@Composable
fun SpotLight(
    modifier: Modifier,
    shape: Shape,
    position: IntOffset,
    componentSize: IntSize,
    text : String = "",
    textBlock : Boolean,
    textBlockColor: Color = Color.Red
) {

    Box(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .clip(
                    SpeechBubbleShape(
                        position = position,
                        componentSize = componentSize
                    )
                )
                .background(Color.Red)
        ) {
            Text(
                text = "Hello world!",
                modifier = Modifier
                    .padding(15.dp)
                    .align(Alignment.TopStart),
                color = Color.Cyan
            )
        }
        Canvas(
            modifier = modifier
                .fillMaxSize(),
            onDraw = {

                val buttonWidth = componentSize.width // Width of the KButton
                val buttonHeight = componentSize.height // Height of the KButton
                val buttonX = position.x.toFloat() // X-coordinate of the KButton
                val buttonY = position.y.toFloat() // Y-coordinate of the KButton
                val spotlightPath = Path().apply {
                    when (shape) {
                        RectangleShape -> {
                            addRoundRect(
                                roundRect = RoundRect(
                                    left = buttonX,
                                    top = buttonY,
                                    right = buttonX + buttonWidth,
                                    bottom = buttonY + buttonHeight,
                                    topLeftCornerRadius = CornerRadius(20f, 20f),
                                    topRightCornerRadius = CornerRadius(20f, 20f),
                                    bottomLeftCornerRadius = CornerRadius(20f, 20f),
                                    bottomRightCornerRadius = CornerRadius(20f, 20f)
                                )
                            )
                            if(!textBlock){
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
                            addOval(
                                oval = Rect(
                                    center = position.toOffset()
                                        .copy(
                                            x = position.x + componentSize.width.toFloat() / 2,
                                            y = position.y + componentSize.height.toFloat() / 2
                                        ),
                                    radius = (componentSize.width.toFloat() / 2)
                                )
                            )
                            if (!textBlock){
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
                clipPath(
                    path = spotlightPath,
                    clipOp = ClipOp.Difference
                ) {
                    drawRect(SolidColor(Color.Black.copy(alpha = 0.5f)))
                }
            }
        )
    }
}
