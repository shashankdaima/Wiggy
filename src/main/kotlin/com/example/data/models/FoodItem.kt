package com.example.data.models

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class FoodItem(
    val itemId: Int,
    val restId: Int,
    val name: String,
    val typeOfCusine: String,
    val categorization: String,
    val cost: Int,
    val quota: Int,
    val available: Boolean
)

object FoodItems : Table() {
    val itemId = integer("itemId")
    val restId = integer("restId")
    val name = varchar("name", 124)
    val typeOfCusine = varchar("typeOfCusine", 512)
    val categorization = varchar("categorization", 512)
    val cost = integer("cost")
    val quota = integer("quota")
    val available = bool("available")
    override val primaryKey = PrimaryKey(itemId)

}