package com.phttproduction.gettable.data.repository

import com.phttproduction.gettable.data.database.GetTableDatabase
import com.phttproduction.gettable.data.model.RestaurantModel
import com.phttproduction.gettable.data.model.toDomainModel

class DatabaseRepository(private val database: GetTableDatabase) {
    fun getAllRestaurants() = database.restaurantDao().getRestaurantAll().map { it.toDomainModel() }
    fun getRestaurantById(id: Int) = database.restaurantDao().getRestaurantById(id).toDomainModel()
    fun insertRestaurants(
        rest1: RestaurantModel,
        rest2: RestaurantModel,
        rest3: RestaurantModel,
        rest4: RestaurantModel,
        rest5: RestaurantModel
    ) = database.restaurantDao().insertAll(rest1, rest2, rest3, rest4, rest5)
    fun deleteAll() = database.restaurantDao().deleteAll()

}