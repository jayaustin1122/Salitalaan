package com.example.salitalaan.Panitikan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.salitalaan.R
import com.example.salitalaan.databinding.FragmentSanaysayNgTaiwanBinding

class SanaysayNgTaiwanFragment : Fragment() {
    private lateinit var binding : FragmentSanaysayNgTaiwanBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSanaysayNgTaiwanBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}