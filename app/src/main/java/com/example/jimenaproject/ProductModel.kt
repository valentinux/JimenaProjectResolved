package com.example.jimenaproject

data class ProductModel(
    val idproduct: Long,
    val productname: String,
    val productdescription: String,
    val photo: String,
    val quantity: Int = 1
)

