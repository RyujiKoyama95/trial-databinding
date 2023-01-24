package com.uminari.trialdatabinding.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uminari.trialdatabinding.R
import com.uminari.trialdatabinding.databinding.InputTextFragmentBinding

class InputTextFragment: Fragment() {
private lateinit var binding: InputTextFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InputTextFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}