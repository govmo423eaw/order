package com.phttproduction.gettable.presentation.restaurant

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.phttproduction.gettable.App
import com.phttproduction.gettable.domain.Restaurant

class RestaurantViewModel : ViewModel() {
    private val database = App.databaseRepository
    val restaurantData = MutableLiveData<Restaurant>()
    val showReserveDialog = MutableLiveData<Boolean>()

    fun start(id: Int) {
        getRestaurantById(id)
    }

    private fun getRestaurantById(id: Int) {
        val restaurant = database.getRestaurantById(id)
        restaurantData.postValue(restaurant)
    }

    fun onReserveClicked() {
        showReserveDialog.postValue(true)
        //TODO: Открываем диалог подтверждения
    }
}