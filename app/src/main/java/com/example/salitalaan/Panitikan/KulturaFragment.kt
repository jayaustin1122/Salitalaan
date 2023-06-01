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
import com.example.salitalaan.databinding.FragmentKulturaBinding


class KulturaFragment : Fragment() {
    private lateinit var binding : FragmentKulturaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKulturaBinding.inflate(layoutInflater)
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
        binding.binhingnakatanim.setOnClickListener {
            showBinhi()
        }
        binding.itinudla.setOnClickListener {
            showitinudla()
        }
        binding.kabutihan.setOnClickListener {
            showkabutihan()
        }
        binding.naguumapaw.setOnClickListener {
            shownaguumapaw()
        }
        binding.pagtalunton.setOnClickListener {
            showpagtalunton()
        }
        binding.patutunguhan.setOnClickListener {
            showpatutunguhan()
        }
    }

    private fun showitinudla() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.itinudlangnakaraan))
        customDialog.show()
    }

    private fun showkabutihan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.kabutihan))
        customDialog.show()
    }

    private fun shownaguumapaw() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.naguumapaw))
        customDialog.show()
    }

    private fun showpagtalunton() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pagtalunton))
        customDialog.show()
    }

    private fun showpatutunguhan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.patutunguhan))
        customDialog.show()
    }

    private fun showBinhi() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.binhingnakatanim))
        customDialog.show()
    }
}