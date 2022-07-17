package com.example.jimenaproject.adapter

import com.example.jimenaproject.CurrentOrderProvider
import com.example.jimenaproject.ProductModel

class OrdersHandle(productToAdd: ProductModel)



private val currentOrderList = CurrentOrderProvider.getCurrentOrder()


fun setProductToCurrentOrderList(productToAdd: ProductModel){
    currentOrderList.add(productToAdd)
}

fun getCurrentOrderList(): MutableList<ProductModel> {
    return currentOrderList
}