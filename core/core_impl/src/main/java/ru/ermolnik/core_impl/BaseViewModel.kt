package ru.ermolnik.core_impl

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

interface UiState
interface UiAction

abstract class BaseViewModel<State, Action>(initialState: State) :
    ViewModel()
        where State : UiState, Action : UiAction {
    private val _state = MutableStateFlow(initialState)
    val state: StateFlow<State>
        get() = _state.asStateFlow()


    abstract fun onAction(actions: Action)

    protected fun setState(state: State) {
        _state.value = state
    }

}
