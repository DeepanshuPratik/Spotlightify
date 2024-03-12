package com.daiatech.composespotlight

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toOffset

@Composable
fun SpotLight(
    modifier: Modifier,
    highlightShape: Shape,
    position: IntOffset,
    componentSize: IntSize,
    textBlock: Boolean,
    minTextBoxWidth: Dp = 80.dp,
    maxTextBoxWidth: Dp = 240.dp,
    text: String = "",
    textFont: FontFamily = FontFamily.Default,
    textSize: TextUnit = 16.sp,
    textBoxCornerRadius: Dp = 8.dp,
    textColor: Color = Color.Black,
    textBlockColor: Color = Color.Green.copy(alpha = 0.7f),
    textBoxDirection: TextMessageDirection = TextMessageDirection.RIGHT
) {

    /** Text Specifications **/
    val textMeasurer = rememberTextMeasurer()
    val textMeasurerResult = textMeasurer.measure(
        text = text,
        style = TextStyle(
            color = textColor,
            fontSize = textSize,
            fontFamily = textFont
        ),
        constraints = Constraints(
            minWidth = minTextBoxWidth.value.toInt(),
            maxWidth = maxTextBoxWidth.value.toInt()
        ),
        softWrap = true,
        overflow = TextOverflow.Ellipsis
    )

    /** TextBox Specs **/
    val textBoxHeight = textMeasurerResult.size.height
    val textBoxWidth = textMeasurerResult.size.width
    val tipSize = remember { 8.dp }
    val textBoxPadding = remember { 10.dp }

    /** Highlighted Object Spec **/
    val objectHighlightWidth = componentSize.width // Width of the target component
    val objectHighlightHeight = componentSize.height // Height of the target component
    val highlightXCoordinate = position.x.toFloat() // X-coordinate of the target component
    val highlightYCoordinate = position.y.toFloat() // Y-coordinate of the target component

    Box(Modifier.fillMaxSize()) {

        /** Highlighting component **/
        Canvas(
            modifier = modifier
                .fillMaxSize(),
            onDraw = {
                val spotlightPath = Path().apply {
                    when (highlightShape) {
                        RectangleShape -> {
                            addRoundRect(
                                roundRect = RoundRect(
                                    left = highlightXCoordinate,
                                    top = highlightYCoordinate,
                                    right = highlightXCoordinate + objectHighlightWidth,
                                    bottom = highlightYCoordinate + objectHighlightHeight,
                                    radiusX = textBoxCornerRadius.toPx(),
                                    radiusY = textBoxCornerRadius.toPx()
                                )
                            )
                        }

                        CircleShape -> {
                            addOval(
                                oval = Rect(
                                    center = position.toOffset()
                                        .copy(
                                            x = highlightXCoordinate + objectHighlightWidth / 2,
                                            y = highlightYCoordinate + objectHighlightHeight / 2
                                        ),
                                    radius = (componentSize.width.toFloat() / 2)
                                )
                            )
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
        /** TextBox ColorFill and Text Holder **/
        if (textBlock) {
            val moveToCoordinates: Offset = remember(position, componentSize, highlightShape, textBoxDirection) {
                findTextMessageStartCoordinates(
                    position = position,
                    componentSize = componentSize,
                    highlightShape = highlightShape,
                    textBoxDirection = textBoxDirection
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(
                        SpeechBubbleShape(
                            textBoxSize = Pair(textBoxWidth, textBoxHeight),
                            tipSize = tipSize,
                            boxPadding = textBoxPadding,
                            moveToCoordinates = moveToCoordinates,
                            textBoxDirection = textBoxDirection
                        )
                    )
                    .background(textBlockColor)
            ) {
                /** Text Positioning **/
                Canvas(
                    modifier = modifier
                        .fillMaxSize(),
                    onDraw = {
                        val textBoxPaddingWithDensity = textBoxPadding.toPx()
                        val tipSizeWithDensity = tipSize.toPx()
                        var xTranslation = moveToCoordinates.x
                        withTransform({
                            xTranslation += when(textBoxDirection){
                                TextMessageDirection.RIGHT -> {
                                    tipSizeWithDensity + textBoxPaddingWithDensity /2
                                }

                                TextMessageDirection.LEFT -> {
                                    (-1)*tipSizeWithDensity - textBoxWidth
                                }

                                TextMessageDirection.MIDDLE -> {
                                    (-1)*textBoxWidth / 2 + textBoxPaddingWithDensity /2
                                }
                            }
                            translate(
                                xTranslation,
                                moveToCoordinates.y + tipSizeWithDensity + textBoxPaddingWithDensity / 2
                            )
                        }) {
                            textMeasurerResult.multiParagraph.paint(
                                canvas = drawContext.canvas,
                                blendMode = DrawScope.DefaultBlendMode
                            )
                        }
                    }
                )
            }
        }
    }
}

fun findTextMessageStartCoordinates(
    position: IntOffset,
    componentSize: IntSize,
    highlightShape: Shape,
    textBoxDirection: TextMessageDirection
): Offset {
    var moveToCoordinates = Offset.Zero
    val objectHighlightWidth = componentSize.width // Width of the target component
    val objectHighlightHeight = componentSize.height // Height of the target component
    val highlightXCoordinate = position.x.toFloat() // X-coordinate of the target component
    val highlightYCoordinate = position.y.toFloat() // Y-coordinate of the target component
    when (highlightShape) {
        RectangleShape -> {
            when (textBoxDirection) {
                TextMessageDirection.LEFT -> {
                    moveToCoordinates = Offset(
                        x = highlightXCoordinate,
                        y = highlightYCoordinate + objectHighlightHeight
                    )
                }

                TextMessageDirection.RIGHT -> {
                    moveToCoordinates = Offset(
                        x = highlightXCoordinate + objectHighlightWidth,
                        y = highlightYCoordinate + objectHighlightHeight
                    )
                }

                TextMessageDirection.MIDDLE -> {
                    moveToCoordinates = Offset(
                        x = highlightXCoordinate + objectHighlightWidth / 2,
                        y = highlightYCoordinate + objectHighlightHeight
                    )
                }
            }
        }

        CircleShape -> {
            when (textBoxDirection) {
                TextMessageDirection.LEFT -> {

                }

                TextMessageDirection.RIGHT -> {
                    moveToCoordinates = Offset(
                        x = 1.7071f * (highlightXCoordinate + objectHighlightWidth / 2),
                        y = highlightYCoordinate + objectHighlightHeight / 2 + 0.7071f * (highlightXCoordinate + objectHighlightWidth / 2)
                    )
                }

                TextMessageDirection.MIDDLE -> {

                }
            }
        }
    }
    return moveToCoordinates
}