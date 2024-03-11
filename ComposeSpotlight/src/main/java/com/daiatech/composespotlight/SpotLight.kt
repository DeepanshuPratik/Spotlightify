package com.daiatech.composespotlight

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toOffset

@Composable
fun SpotLight(
    modifier: Modifier,
    shape: Shape,
    position: IntOffset,
    componentSize: IntSize,
    text : String = "",
    textBlock : Boolean,
    textBlockColor: Color = Color.Red,
    minTextBoxWidth: Dp = 114.dp,
    maxTextBoxWidth : Dp = 300.dp
) {

    val textMeasurer = rememberTextMeasurer()
    val textMeasurerResult = textMeasurer.measure(
        text = text,
        style = TextStyle(
            color = Color.Black,
            fontSize = 16.sp,
            fontFamily = FontFamily.Default
        ),
        constraints = Constraints(
            minWidth = minTextBoxWidth.value.toInt(),
            maxWidth = maxTextBoxWidth.value.toInt()
        ),
        softWrap = true,
        overflow = TextOverflow.Ellipsis
    )
    val textBoxHeight = textMeasurerResult.size.height
    val textBoxWidth = textMeasurerResult.size.width
    Box(Modifier.fillMaxSize()) {
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
                                    radiusX = 8.dp.toPx(),
                                    radiusY = 8.dp.toPx()
                                )
                            )
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
                                        right = position.x + componentSize.width + textBoxWidth.toFloat() + 10.dp.toPx(),
                                        bottom = position.y + componentSize.height + textBoxHeight.toFloat() + 10.dp.toPx(),
                                        radiusX = 8.dp.toPx(),
                                        radiusY = 8.dp.toPx()
                                    )
                                )
//                                drawText(
//                                    textMeasurer = textMeasurer,
//                                    text = AnnotatedString(text),
//                                    style = TextStyle(fontSize = 16.sp, color = Color.Black),
//                                    topLeft = Offset(
//                                        x = position.x.toFloat() + componentSize.width + 4.dp.toPx(),
//                                        y = position.y.toFloat() + componentSize.height + 0.3f * 0.56f * textBoxWidth.toPx()
//                                    ),
//                                    overflow = TextOverflow.Ellipsis,
//                                )
                                withTransform({
                                    translate(
                                        position.x.toFloat() + componentSize.width + 12.dp.value,
                                        position.y.toFloat() + componentSize.height + 0.3f * 0.56f * minTextBoxWidth.value)
                                }) {
                                    textMeasurerResult.multiParagraph.paint(
                                        canvas = drawContext.canvas,
                                        blendMode = DrawScope.DefaultBlendMode
                                    )
                                }
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
                                        right = position.x + componentSize.width + minTextBoxWidth.toPx(),
                                        bottom = position.y + componentSize.height + 0.56f*minTextBoxWidth.toPx(),
                                        radiusX = 8.dp.toPx(),
                                        radiusY = 8.dp.toPx()
                                    )
                                )
                                drawText(
                                    textMeasurer = textMeasurer,
                                    text = text,
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        color = Color.Black,
                                    ),
                                    topLeft = Offset(
                                        x = position.x.toFloat() + componentSize.width + 4.dp.toPx(),
                                        y = position.y.toFloat() + componentSize.height + 0.3f*0.56f*minTextBoxWidth.toPx()
                                    ),
                                    overflow = TextOverflow.Ellipsis
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
//    Box(
//        modifier = Modifier
//            .clip(
//                SpeechBubbleShape(
//                    position = position,
//                    componentSize = componentSize,
//                    shape = shape
//                )
//            )
//            .background(Color.Red)
//    ) {
//        Text(
//            text = text,
//            modifier = Modifier
//                .padding(15.dp)
//                .align(Alignment.TopStart),
//            color = Color.Cyan
//        )
//    }
}
