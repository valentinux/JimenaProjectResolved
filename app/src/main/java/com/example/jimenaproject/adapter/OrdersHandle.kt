package com.example.jimenaproject.adapter

import com.example.jimenaproject.ProductModel

class OrdersHandle(productToAdd: ProductModel) {

    private val currentOrderList: MutableList<ProductModel> = mutableListOf<ProductModel>()

    fun addProductToCurrentOrder(productToAdd: ProductModel) {
        currentOrderList.add(productToAdd)
        println(currentOrderList)
    }


}
