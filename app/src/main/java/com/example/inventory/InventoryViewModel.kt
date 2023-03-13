package com.example.inventory

import android.content.ClipData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.inventory.data.ItemDao
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope


class InventoryViewModel(private val itemDao: ItemDao) : ViewModel() {
}

class InventoryViewModelFactory(private val itemDao: ItemDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        TODO("Not yet implemented")
    }
}
