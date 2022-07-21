package com.example.jimenaproject.adapter

import com.example.jimenaproject.CurrentOrderProvider
import com.example.jimenaproject.CurrentOrderProvider.CurrentOrderList.setCurrentOrder
import com.example.jimenaproject.ProductModel

class OrdersHandle



private val currentOrderList = CurrentOrderProvider.getCurrentOrder()


fun setProductToCurrentOrderList(mProductToAdd: ProductModel){
    currentOrderList.add(mProductToAdd)
    setCurrentOrder(currentOrderList)
}

fun getCurrentOrderList(): MutableList<ProductModel> {
    return currentOrderList
}



