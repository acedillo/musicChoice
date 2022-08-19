package com.example.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.model.MSO
import com.example.myapplication.repository.MsoRepository

class HomeViewModel constructor(val repository: MsoRepository): ViewModel() {

    private val _msos = MutableLiveData<List<MSO>> ()
    val msos: LiveData<List<MSO>> = _msos

    fun fetchMsos() {
        val msOs = repository.getMSOs()

    }

    companion object {
        fun getFactory(repository: MsoRepository): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                    return HomeViewModel(repository) as T
                }
            }
        }
    }
}