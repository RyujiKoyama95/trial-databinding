package com.uminari.trialdatabinding.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class InputTextViewModel {
    private val _submittedText: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "ここに出力される"
        }
    private val _isEnabled: MutableLiveData<Boolean> =
        MutableLiveData<Boolean>().also { mutableLiveData ->
            mutableLiveData.value = false
        }
    private val _buttonText: MutableLiveData<String> =
        MutableLiveData<String>().also { mutableLiveData ->
            mutableLiveData.value = "Ready"
        }
    val submittedText: LiveData<String>
        get() = _submittedText
    val isEnabled: LiveData<Boolean>
        get() = _isEnabled
    val buttonText: LiveData<String>
        get() = _buttonText

    fun updateButton(isBlank: Boolean) {
        _isEnabled.value = isBlank

        if (!isBlank) {
            _buttonText.value = "Set!!"
        } else {
            _buttonText.value = "Ready!!"
        }
    }

    fun submitText(text: String) {
        _submittedText.value = text
    }
}