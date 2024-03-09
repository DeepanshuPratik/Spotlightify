package com.daiatech.composespotlight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J3\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\n\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001eRc\u0010\u0003\u001aT\u0012P\u0012N\u0012\u0004\u0012\u00020\u0006\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u00070\u0005j&\u0012\u0004\u0012\u00020\u0006\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u0007`\u000b0\u0004X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u000e\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0006\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u00070\u00050\u000f\u00f8\u0001\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006 "}, d2 = {"Lcom/daiatech/composespotlight/MainViewModal;", "Landroidx/lifecycle/ViewModel;", "()V", "_coordsMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/HashMap;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/collections/HashMap;", "_spotlightState", "Lcom/daiatech/composespotlight/MainViewModal$SpotlightState;", "coordsMap", "Lkotlinx/coroutines/flow/StateFlow;", "getCoordsMap", "()Lkotlinx/coroutines/flow/StateFlow;", "spotlightState", "getSpotlightState", "endSpotlighting", "", "startSpotlighting", "switchSpotlighting", "updateCoords", "shape", "name", "coords", "componentSize", "updateCoords-VFferGY", "(Landroidx/compose/ui/graphics/Shape;Ljava/lang/String;JJ)V", "SpotlightState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModal extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.daiatech.composespotlight.MainViewModal.SpotlightState> _spotlightState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.daiatech.composespotlight.MainViewModal.SpotlightState> spotlightState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.HashMap<java.lang.String, kotlin.Pair<androidx.compose.ui.graphics.Shape, kotlin.Pair<androidx.compose.ui.unit.IntOffset, androidx.compose.ui.unit.IntSize>>>> _coordsMap = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.HashMap<java.lang.String, kotlin.Pair<androidx.compose.ui.graphics.Shape, kotlin.Pair<androidx.compose.ui.unit.IntOffset, androidx.compose.ui.unit.IntSize>>>> coordsMap = null;
    
    @javax.inject.Inject
    public MainViewModal() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.daiatech.composespotlight.MainViewModal.SpotlightState> getSpotlightState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.HashMap<java.lang.String, kotlin.Pair<androidx.compose.ui.graphics.Shape, kotlin.Pair<androidx.compose.ui.unit.IntOffset, androidx.compose.ui.unit.IntSize>>>> getCoordsMap() {
        return null;
    }
    
    public final void startSpotlighting() {
    }
    
    public final void switchSpotlighting() {
    }
    
    public final void endSpotlighting() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/daiatech/composespotlight/MainViewModal$SpotlightState;", "", "(Ljava/lang/String;I)V", "INITIALIZED", "STARTED", "SWITCHED", "ENDED", "app_debug"})
    public static enum SpotlightState {
        /*public static final*/ INITIALIZED /* = new INITIALIZED() */,
        /*public static final*/ STARTED /* = new STARTED() */,
        /*public static final*/ SWITCHED /* = new SWITCHED() */,
        /*public static final*/ ENDED /* = new ENDED() */;
        
        SpotlightState() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.daiatech.composespotlight.MainViewModal.SpotlightState> getEntries() {
            return null;
        }
    }
}