package com.phttproduction.gettable.presentation.mainpage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.phttproduction.gettable.App
import com.phttproduction.gettable.domain.Restaurant

class MainPageViewModel: ViewModel() {
    private val database = App.databaseRepository
    val restaurantsData = MutableLiveData<List<Restaurant>>()

    fun start() {
        getRestaurantsList()
    }

    private fun getRestaurantsList() {
        val restaurants = database.getAllRestaurants()
        restaurantsData.postValue(restaurants)
    }

}