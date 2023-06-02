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
import com.example.salitalaan.databinding.FragmentHatolBinding


class HatolFragment : Fragment() {
    private lateinit var binding : FragmentHatolBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHatolBinding.inflate(layoutInflater)
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
        binding.hatol.setOnClickListener {
            showHatol()
        }
        binding.hapong.setOnClickListener {
            showhapong()
        }
        binding.Inaararo.setOnClickListener {
            showInaararo()
        }
        binding.lumupasay.setOnClickListener {
            showlumupasay()
        }
        binding.makaahon.setOnClickListener {
            showmakaahon()
        }
        binding.Malumanay.setOnClickListener {
            showMalumanay()
        }
        binding.mapaos.setOnClickListener {
            showmapaos()
        }
        binding.nakadungaw.setOnClickListener {
            shownakadungaw()
        }
        binding.nangangamba.setOnClickListener {
            shownangangamba()
        }


    }

    private fun showInaararo() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.INAARARO))
        customDialog.show()
    }

    private fun showlumupasay() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.LUMUPASAY))
        customDialog.show()
    }

    private fun showmakaahon() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.MAKAAHON))
        customDialog.show()
    }

    private fun shownakadungaw() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.NAKADUNGAW))
        customDialog.show()
    }

    private fun showmapaos() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.MAPAOS))
        customDialog.show()
    }

    private fun shownangangamba() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.NANGANGAMBA))
        customDialog.show()
    }

    private fun showMalumanay() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.MALUMANAY))
        customDialog.show()
    }

    private fun showhapong() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.HAPONGHAPO))
        customDialog.show()
    }

    private fun showHatol() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hatol))
        customDialog.show()
    }

}