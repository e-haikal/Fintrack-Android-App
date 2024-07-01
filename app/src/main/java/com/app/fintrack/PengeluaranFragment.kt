package com.app.fintrack

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class PengeluaranFragment : Fragment(R.layout.fragment_pengeluaran) {

    private var lastClickedItem: LinearLayout? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemMakanan = view.findViewById<LinearLayout>(R.id.itemMakanan)
        val itemMinuman = view.findViewById<LinearLayout>(R.id.itemMinuman)
        val itemPermainan = view.findViewById<LinearLayout>(R.id.itemPermainan)
        val itemHadiah = view.findViewById<LinearLayout>(R.id.itemHadiah)
        val itemBelanja = view.findViewById<LinearLayout>(R.id.itemBelanja)
        val itemTransportasi = view.findViewById<LinearLayout>(R.id.itemTransportasi)
        val itemBiayaListrik = view.findViewById<LinearLayout>(R.id.itemBiayaListrik)
        val itemKategoriBaru = view.findViewById<LinearLayout>(R.id.itemKategoriBaru)

        val items = listOf(itemMakanan, itemMinuman, itemPermainan, itemHadiah, itemBelanja, itemTransportasi, itemBiayaListrik, itemKategoriBaru)

        for (item in items) {
            item.setOnClickListener {
                // Reset the background color of the previously clicked item
                lastClickedItem?.setBackgroundColor(Color.TRANSPARENT)
                // Set the background color of the current clicked item
                item.setBackgroundColor(Color.GRAY)
                // Update the last clicked item
                lastClickedItem = item
            }
        }
    }
}
