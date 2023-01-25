package com.uminari.trialdatabinding.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class InputTextViewModel {
    private val _buttonText: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "Ready"
        }
    val buttonText: LiveData<String>
        get() = _buttonText
}