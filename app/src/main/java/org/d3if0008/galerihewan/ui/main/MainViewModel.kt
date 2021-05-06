package org.d3if0008.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if0008.galerihewan.R
import org.d3if0008.galerihewan.model.Hewan
import org.d3if0008.galerihewan.network.HewanApi

class MainViewModel: ViewModel(){

    private val data = MutableLiveData<List<Hewan>>()

    init {
        retrieveData()
    }

    fun getData(): LiveData<List<Hewan>> = data

    private fun retrieveData(){
        viewModelScope.launch {
            try {
                data.value = HewanApi.service.getHewan()
            }catch (e: Exception){
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
    }
}