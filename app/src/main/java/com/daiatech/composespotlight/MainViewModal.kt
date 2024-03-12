package com.daiatech.composespotlight

import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class MainViewModal @Inject constructor() : ViewModel() {
    enum class SpotlightState {
        INITIALIZED , STARTED , SWITCHED, ENDED
    }
    private val _spotlightState : MutableStateFlow<SpotlightState> = MutableStateFlow(SpotlightState.INITIALIZED)
    val spotlightState = _spotlightState.asStateFlow()
    private val _coordsMap: MutableStateFlow<HashMap<String,Pair<Shape, Pair<IntOffset,IntSize>>>> = MutableStateFlow( hashMapOf() )
    val coordsMap = _coordsMap.asStateFlow()
    private val _textMap: MutableStateFlow<HashMap<String,String>> = MutableStateFlow( hashMapOf() )
    val textMap = _textMap.asStateFlow()

    fun updateCoords(shape : Shape ,name: String, coords: IntOffset, componentSize: IntSize){
        val updatedMap = _coordsMap.value // Create a mutable copy of the current map
        updatedMap[name] = Pair(shape,Pair(coords,componentSize)) // Update the map with the new coordinates
        _coordsMap.update { updatedMap }
    }
    fun updateTextMap(id: String, text: String){
        val updatedTextMap = _textMap.value
        updatedTextMap[id] = text
        _textMap.update { updatedTextMap }
    }
    fun startSpotlighting(){
        _spotlightState.update { SpotlightState.STARTED }
    }
    fun switchSpotlighting(){
        _spotlightState.update { SpotlightState.SWITCHED }
    }
    fun endSpotlighting(){
        _spotlightState.update { SpotlightState.ENDED }
    }
}