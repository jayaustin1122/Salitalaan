package com.example.salitalaan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.salitalaan.adapter.GlosaryAdapter
import com.example.salitalaan.databinding.FragmentSalitaBinding
import com.example.wika_runungan.data.Glosary
import java.util.*
import kotlin.collections.ArrayList


class SalitaFragment : Fragment() {
    private lateinit var binding : FragmentSalitaBinding
    lateinit var adapter: GlosaryAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSalitaBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var lists = mutableListOf<Glosary>(
            Glosary("Abuloy", getString(R.string.abuloy)),
            Glosary("Bulalas", getString(R.string.bulalas)),
            Glosary("Gulod", getString(R.string.gulod)),
            Glosary("Halinghing", getString(R.string.halinghing)),
            Glosary("Hikbi", getString(R.string.hikbi)),
            Glosary("Katiting", getString(R.string.katiting)),
            Glosary("Langib", getString(R.string.langib)),
            Glosary("Mukmok", getString(R.string.mukmok)),
            Glosary("Nakakabulahaw", getString(R.string.nakabubulahaw)),
            Glosary("Pahintulot", getString(R.string.pahintulot)),
            Glosary("Pananabik", getString(R.string.pananabik)),
            Glosary("Papel de Bangko", getString(R.string.papeldebangko)),
            Glosary("Paste", getString(R.string.patse)),
            Glosary("Pinagsaluhan", getString(R.string.pinagsaluhan)),
            Glosary("Kinnaree", getString(R.string.kinnaree)),
            Glosary("Lawa", getString(R.string.lawa)),
            Glosary("Lubid", getString(R.string.lubid)),
            Glosary("Matiwasay", getString(R.string.matiwasay)),
            Glosary("Nakabibighani", getString(R.string.nakabibighani)),
            Glosary("Namangha", getString(R.string.namangha)),
            Glosary("Panarasi", getString(R.string.panarasi)),
            Glosary("Babaeng Moderno", getString(R.string.babaengmoderno)),
            Glosary("Bagong Panahon", getString(R.string.bagongpanahon)),
            Glosary("Emansipasyon", getString(R.string.emansipasyon)),
            Glosary("Hungkag", getString(R.string.hungkag)),
            Glosary("Ikahon", getString(R.string.ikahon)),
            Glosary("Lumuwag ang Tali", getString(R.string.lumuwagangtali)),
            Glosary("Progresibo", getString(R.string.progresibo)),
            Glosary("Regent", getString(R.string.regent)),
            Glosary("Sibilisasyon", getString(R.string.sibilisasyon)),
            Glosary("Ateista", getString(R.string.ateista)),
            Glosary("Lapastangan", getString(R.string.lapastangan)),
            Glosary("Lukbutan", getString(R.string.lukbutan)),
            Glosary("Naulinigan", getString(R.string.naulinigan)),
            Glosary("Pananalig", getString(R.string.pananalig)),
            Glosary("Pangilin", getString(R.string.pangilin)),
            Glosary("Pomada", getString(R.string.pomada)),
            Glosary("Sumakabilang-Buhay", getString(R.string.sumakabilangbuhay)),
            Glosary("Toniko", getString(R.string.toniko)),
            Glosary("Binhing Nakatanim", getString(R.string.binhingnakatanim)),
            Glosary("Itinudlang Nakaraan", getString(R.string.itinudlangnakaraan)),
            Glosary("Kabutihan", getString(R.string.kabutihan)),
            Glosary("Nag-uumapaw", getString(R.string.naguumapaw)),
            Glosary("Pagtalunton", getString(R.string.pagtalunton)),
            Glosary("Patutunguhan", getString(R.string.patutunguhan)),
            Glosary("Tangis ng Pamamaalam", getString(R.string.tangisngpamamaalam)),
            Glosary("Hatol", getString(R.string.hatol)),
            Glosary("Hapong-hapo", getString(R.string.HAPONGHAPO)),
            Glosary("Inaararo", getString(R.string.INAARARO)),
            Glosary("Lumupasay", getString(R.string.LUMUPASAY)),
            Glosary("Makaahon", getString(R.string.MAKAAHON)),
            Glosary("Malumanay", getString(R.string.MALUMANAY)),
            Glosary("Mapaos", getString(R.string.MAPAOS)),
            Glosary("Nakadungaw", getString(R.string.NAKADUNGAW)),
            Glosary("Nangangamba", getString(R.string.NANGANGAMBA)),
            Glosary("Pagsusumamo", getString(R.string.PAGSUSUMAMO)),
            Glosary("Araw-dumungaw", getString(R.string.ARAWDUMUNGAW)),
            Glosary("Bituin and Sumilip", getString(R.string.BITUINANGSUMILIP)),
            Glosary("Puso'y ngumingitngit", getString(R.string.PUSOYNGUMINGITI)),
            Glosary("Ulilang Damo", getString(R.string.ULILANGDAMO)),

        )

    binding.searchEt2.clearFocus()
    adapter = GlosaryAdapter(lists)
    binding.recycler.adapter = adapter
    binding.recycler.layoutManager = LinearLayoutManager(requireContext())
    lists.sortBy {
        it.title
    }
    adapter.onItemClick = {
        val intent = Intent(requireContext(), DetailActivity::class.java)
        intent.putExtra("title", it.title)
        intent.putExtra("code", it.description)
        Toast.makeText(requireContext(), it.title, Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }

    binding.searchEt2.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            return false
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            val searchList = ArrayList<Glosary>()

            if (newText != null) {
                val searchQuery =
                    newText.toLowerCase(Locale.ROOT) // Convert search query to lowercase

                for (i in lists) {
                    val title =
                        i.title.toLowerCase(Locale.ROOT) // Convert title to lowercase for comparison
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

}