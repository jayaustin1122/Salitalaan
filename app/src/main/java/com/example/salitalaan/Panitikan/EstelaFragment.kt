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
import com.example.salitalaan.databinding.FragmentEstelaBinding


class EstelaFragment : Fragment() {
    private lateinit var binding : FragmentEstelaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEstelaBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.babaeng.setOnClickListener {
            showBabaeng()
        }
        binding.bagong.setOnClickListener {
            showBagong()
        }
        binding.emansipasyon.setOnClickListener {
            showEman()
        }
        binding.hungkag.setOnClickListener {
            showHugnkag()
        }
        binding.ikahon.setOnClickListener {
            showIkahun()
        }
        binding.lumuwag.setOnClickListener {
            showLumuwag()
        }
        binding.regent.setOnClickListener {
            showRegent()
        }
        binding.sibilisasyong.setOnClickListener {
            showSibil()
        }
        binding.btnBack.setOnClickListener {
            val fragment = PanitikanFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

    }

    private fun showSibil() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.sibilisasyon))
        customDialog.show()
    }

    private fun showRegent() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.regent))
        customDialog.show()
    }

    private fun showLumuwag() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.lumuwagangtali))
        customDialog.show()
    }

    private fun showIkahun() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.ikahon))
        customDialog.show()
    }

    private fun showHugnkag() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hungkag))
        customDialog.show()
    }

    private fun showEman() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.emansipasyon))
        customDialog.show()
    }

    private fun showBagong() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.bagongpanahon))
        customDialog.show()
    }

    private fun showBabaeng() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.babaengmoderno))
        customDialog.show()
    }


}