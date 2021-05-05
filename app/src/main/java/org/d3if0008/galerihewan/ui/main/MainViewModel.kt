package org.d3if0008.galerihewan.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if0008.galerihewan.R
import org.d3if0008.galerihewan.model.Hewan

class MainViewModel: ViewModel(){

    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
    }

    private fun initData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa, "(Unggas)"),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam, "(Unggas)"),
            Hewan("Bebek", "Cairina moschatta", R.drawable.bebek, "(Unggas)"),
            Hewan("Domba", "Ovis ammon", R.drawable.domba, "(Mamalia)"),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun, "(Unggas)"),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing, "(Mamalia)"),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci, "(Mamalia)"),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau, "(Mamalia)"),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda, "(Mamalia)"),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi, "(Mamalia)")
        )
    }

    fun getData(): LiveData<List<Hewan>> = data
}