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
import com.example.salitalaan.Panitikan.*
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
            Noli("ANG HATOL NG KUNEHO", R.drawable.koneho),
            Noli("TANKA AT HAIKU tula mula sa JAPAN", R.drawable.japan),
            Noli("SANAYSAY NG TAIWAN", R.drawable.taiwan),
            Noli("Niyebeng-itim Maikling Kuwento", R.drawable.niyene),
            Noli("Munting Pagsinta (DULA)", R.drawable.pagsinta)

        )
        adapter = NoliAdapter(requireContext(), kabanataLists) { position ->
            if (position == 0) {
                val fragment = AngAmaFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 1) {
                val fragment = ManorahFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 2) {
                val fragment = EstelaFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 3) {
                val fragment = TiyoSimonFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 4) {
                val fragment = KulturaFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 5) {
                val fragment = HatolFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 6) {
                val fragment = TankaFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            } else if (position == 7) {

                val fragment = SanaysayNgTaiwanFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
            else if (position == 8) {

                val fragment = NiyebengFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
            else if (position == 9) {

                val fragment = MuntingFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmentContainerView, fragment)
                transaction.addToBackStack(null)
                transaction.commit()
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