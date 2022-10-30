package com.example.data.models

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Restaurant(
    val id: Int,
    val restaurantName: String,
    val rating: Float,
    val restaurantType: String,
    val homeDelivery: Boolean,
    val tableBooking: Boolean
)

object Restaurants : Table() {
    val id = integer("id").autoIncrement()
    val restaurantName = varchar("restaurantName", 124)
    val rating = float("rating")
    val restaurantType = varchar("restaurantType", 124)
    val homeDelivery = bool("homeDelivery")
    val tableBooking = bool("tableBooking")
    override val primaryKey: PrimaryKey = PrimaryKey(id)
}