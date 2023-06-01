package com.example.salitalaan

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import com.example.salitalaan.Panitikan.AngAmaFragment
import com.example.salitalaan.databinding.AboutAppBinding
import com.example.salitalaan.databinding.FragmentPanitikanBinding
import com.example.wika_runungan.adapters.NoliAdapter
import com.example.wika_runungan.data.Noli
import java.util.*
import kotlin.collections.ArrayList

class PanitikanFragment : Fragment() {
    private lateinit var binding : FragmentPanitikanBinding
    lateinit var adapter : NoliAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPanitikanBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var kabanataLists = mutableListOf<Noli>(
            Noli("Ang Ama", R.drawable.angama),
            Noli("Ang Alamat ni Prinsesa Manorah", R.drawable.prinsesa),
            Noli("Kay Estela Zeehandelar (Sanaysay)", R.drawable.sanaysay),
            Noli("Tiyo Simon", R.drawable.kapitan),
            Noli("KULTURA: Ang Pamana ng Nakaraan", R.drawable.pamana),
            Noli("Sample", R.drawable.kapitan),
            Noli("KABANATA 7: SUYUAN SA ISANG ASOTEA", R.drawable.seven),
            Noli("KABANATA 8: MGA ALAALA", R.drawable.alaala),
            Noli("KABANATA 9: MGA BAGAY-BAGAY SA PALIGID", R.drawable.nine),
            Noli("KABANATA 10: ANG BAYAN NG SAN DIEGO", R.drawable.ten),
            Noli("KABANATA 11: MGA HARI-HARIAN", R.drawable.eleven),
            Noli("KABANATA 12: TODOS LOS SANTOS (ARAW NG MGA PATAY)", R.drawable.patay),
            Noli("KABANATA 13: MGA BABALA NG BAGYO", R.drawable.terteen),
            Noli("KABANATA 14: SI TASYO: PILOSOPO O BALIW?", R.drawable.loloko2),
            Noli("KABANATA 15: ANG MGA SAKRISTAN", R.drawable.sakristan)

        )
        adapter = NoliAdapter(requireContext(), kabanataLists) { position ->
            if (position == 0) {
                val fragment = AngAmaFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 1) {

            } else if (position == 2) {

            } else if (position == 3) {

            } else if (position == 4) {

            } else if (position == 5) {

            } else if (position == 6) {

            } else if (position == 7) {


            } else if (position == 8) {

            } else if (position == 9) {


            } else if (position == 10) {

            }
        }
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.searchEt2.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val searchList = ArrayList<Noli>()

                if (newText != null) {
                    val searchQuery =
                        newText.lowercase(Locale.ROOT) // Convert search query to lowercase

                    for (i in kabanataLists) {
                        val title =
                            i.title.lowercase(Locale.ROOT) // Convert title to lowercase for comparison
                        if (title.contains(searchQuery)) {
                            searchList.add(i)
                        }
                    }

                    if (searchList.isEmpty()) {
                        // Handle case when search results are empty
                    } else {
                        adapter.onApplySearch(searchList)
                    }
                }

                return true
            }
        })
    }



    private fun openAbout() {
//binding the dialog xml
        val customDialog: Dialog = Dialog(this.requireContext())
        var dialogBinding : AboutAppBinding = AboutAppBinding.inflate(layoutInflater)
        customDialog.setContentView(dialogBinding.root)
        customDialog.show()
    }
}