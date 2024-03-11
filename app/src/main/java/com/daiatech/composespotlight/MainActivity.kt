package com.daiatech.composespotlight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.daiatech.composespotlight.ui.theme.ComposeSpotlightTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlin.math.roundToInt


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSpotlightTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    val viewModel: MainViewModal = viewModel()
                    val animationSequence = listOf("box1","circle1","box2","circle2","box3")
                    var coordinates by remember { mutableStateOf(Pair(IntOffset.Zero,IntSize.Zero)) }
                    var shape by remember { mutableStateOf(RectangleShape) }
                    var currentTargetComposableComponentCoordinates : IntOffset by remember { mutableStateOf(
                        IntOffset.Zero) }
                    var currentTargetComposableComponentSize : IntSize by remember { mutableStateOf(
                        IntSize(0,0)
                    ) }
                    val onTargetComposableCoordinatesChange : (LayoutCoordinates)-> Unit = {
                            layoutCoordinates ->
                        currentTargetComposableComponentCoordinates = if (layoutCoordinates.isAttached){
                            with(layoutCoordinates.positionInRoot()) {
                                IntOffset(x.roundToInt(),y.roundToInt())
                            }
                        }
                        else {
                            IntOffset.Zero
                        }
                        currentTargetComposableComponentSize = layoutCoordinates.size
                    }
                    val coordsMap by viewModel.coordsMap.collectAsState()

                    Column {

                        Box(
                            modifier = Modifier.onGloballyPositioned {
                                onTargetComposableCoordinatesChange(it)
                                viewModel.updateCoords( RectangleShape,"box1", currentTargetComposableComponentCoordinates, currentTargetComposableComponentSize)
                            }
                        ) {
                            Greeting("Android")
                        }
                        Box(
                            modifier = Modifier.onGloballyPositioned {
                                onTargetComposableCoordinatesChange(it)
                                viewModel.updateCoords( RectangleShape,"box2", currentTargetComposableComponentCoordinates, currentTargetComposableComponentSize)
                            }
                        ) {
                            Greeting("hello")
                        }
                        Box(
                            modifier = Modifier.onGloballyPositioned {
                                onTargetComposableCoordinatesChange(it)
                                viewModel.updateCoords( RectangleShape,"box3", currentTargetComposableComponentCoordinates, currentTargetComposableComponentSize)
                            }
                        ) {
                            Greeting("bye")
                        }
                        Image(
                            modifier = Modifier
                                .clip(CircleShape)
                                .onGloballyPositioned {
                                    onTargetComposableCoordinatesChange(it)
                                    viewModel.updateCoords(
                                        CircleShape,
                                        "circle1",
                                        currentTargetComposableComponentCoordinates,
                                        currentTargetComposableComponentSize
                                    )
                                },
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = ""
                        )
                        Image(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .onGloballyPositioned {
                                    onTargetComposableCoordinatesChange(it)
                                    viewModel.updateCoords(
                                        CircleShape,
                                        "circle2",
                                        currentTargetComposableComponentCoordinates,
                                        currentTargetComposableComponentSize
                                    )
                                },
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = ""
                        )
                    }
                    SpotLight(
                        modifier = Modifier,
                        componentSize = coordinates.second,
                        position = coordinates.first,
                        shape = shape,
                        textBlock = true,
                        text = "Hello Buddy! how are you? Hi hello buddy?"
                    )
                    LaunchedEffect(null) {
                        animationSequence.forEach {
                            coordinates = coordsMap[it]!!.second
                            shape = coordsMap[it]!!.first
                            delay(2000)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeSpotlightTheme {
        Greeting("Android")
    }
}

