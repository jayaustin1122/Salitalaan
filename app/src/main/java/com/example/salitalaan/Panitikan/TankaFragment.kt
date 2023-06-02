package com.example.salitalaan.Panitikan

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.salitalaan.PanitikanFragment
import com.example.salitalaan.R
import com.example.salitalaan.databinding.DialogBinding
import com.example.salitalaan.databinding.FragmentTankaBinding


class TankaFragment : Fragment() {
    private lateinit var binding : FragmentTankaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTankaBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            val fragment = PanitikanFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        binding.araw.setOnClickListener {
            showAraw()
        }
        binding.bituin.setOnClickListener {
            showbituin()
        }
        binding.pusoy.setOnClickListener {
            showpusoy()
        }
        binding.ulila.setOnClickListener {
            showulila()
        }
    }

    private fun showulila() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.ULILANGDAMO))
        customDialog.show()
    }

    private fun showpusoy() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.PUSOYNGUMINGITI))
        customDialog.show()
    }

    private fun showbituin() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.BITUINANGSUMILIP))
        customDialog.show()
    }

    private fun showAraw() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.ARAWDUMUNGAW))
        customDialog.show()
    }
}