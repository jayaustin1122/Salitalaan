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
import com.example.salitalaan.databinding.FragmentAngAmaBinding


class AngAmaFragment : Fragment() {
    private lateinit var binding : FragmentAngAmaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAngAmaBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.abuloy.setOnClickListener {
            showAbuloy()
        }
        binding.bulalas.setOnClickListener {
            showBulalas()
        }
        binding.gulod.setOnClickListener {
            showGulod()
        }
        binding.halinghing.setOnClickListener {
            showHaling()
        }
        binding.hikbi.setOnClickListener {
            showHikbi()
        }
        binding.katiting.setOnClickListener {
            showKatitinf()
        }
        binding.langib.setOnClickListener {
            showLangib()
        }
        binding.mukmok.setOnClickListener {
            showMukmok()
        }
        binding.nakabubulahaw.setOnClickListener {
            showNaka()
        }
        binding.pahintulot.setOnClickListener {
            showPahintulot()
        }
        binding.pananabik.setOnClickListener {
            showPananabik()
        }
        binding.papel.setOnClickListener {
            showPapel()
        }
        binding.patse.setOnClickListener {
            showpatse()
        }
        binding.pinagsaluhan.setOnClickListener {
            showPinagsaluhan()
        }
        binding.btnBack.setOnClickListener {
            val fragment = PanitikanFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainerView, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

    private fun showPinagsaluhan() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pinagsaluhan))
        customDialog.show()
    }

    private fun showpatse() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.patse))
        customDialog.show()
    }

    private fun showPapel() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.papeldebangko))
        customDialog.show()
    }

    private fun showPananabik() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pananabik))
        customDialog.show()
    }

    private fun showPahintulot() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.pahintulot))
        customDialog.show()
    }

    private fun showNaka() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.nakabubulahaw))
        customDialog.show()
    }

    private fun showMukmok() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.mukmok))
        customDialog.show()
    }

    private fun showLangib() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.langib))
        customDialog.show()
    }

    private fun showKatitinf() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.katiting))
        customDialog.show()
    }

    private fun showHikbi() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.hikbi))
        customDialog.show()
    }

    private fun showHaling() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.halinghing))
        customDialog.show()
    }

    private fun showGulod() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.gulod))
        customDialog.show()
    }

    private fun showBulalas() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.bulalas))
        customDialog.show()
    }

    private fun showAbuloy() {
        //binding the dialog xml
        val customDialog: Dialog = Dialog(requireContext())
        var dialogBinding : DialogBinding = DialogBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        dialogBinding.dialog.setText(getString(R.string.abuloy))
        customDialog.show()
    }

}