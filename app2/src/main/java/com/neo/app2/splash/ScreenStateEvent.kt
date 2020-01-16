package com.neo.app2.splash

import com.netflix.componentizationV1.ComponentEvent

sealed class ScreenStateEvent : ComponentEvent() {
    object Initing : ScreenStateEvent()
    object CheckingDevice : ScreenStateEvent()
    object CheckingNetwork : ScreenStateEvent()
    object FetchingContent : ScreenStateEvent()
    object Loaded : ScreenStateEvent()
    object Error : ScreenStateEvent()
}