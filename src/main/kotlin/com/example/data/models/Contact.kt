package com.example.data.models

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Table

@Serializable
data class Contact(
    val restId: Int,
    val phoneNumber: String,
    val address: String,
    val city: String
)

object Contacts : Table() {
    val restId = integer("restId").autoIncrement()
    val phoneNumber = varchar("phoneNumber", 128)
    val address = varchar("address", 1024)
    val city = varchar("city", 128)

    override val primaryKey = PrimaryKey(restId)
}