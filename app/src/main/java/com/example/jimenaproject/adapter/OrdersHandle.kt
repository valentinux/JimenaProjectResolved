package com.example.jimenaproject.adapter

import com.example.jimenaproject.CurrentOrderProvider
import com.example.jimenaproject.CurrentOrderProvider.CurrentOrderList.setCurrentOrder
import com.example.jimenaproject.ProductModel

class OrdersHandle(productToHandle: ProductModel){

    val mproductToHandle = productToHandle


    private val currentOrderList = CurrentOrderProvider.getCurrentOrder()


    fun setProductToCurrentOrderList(){
        currentOrderList.add(mproductToHandle)
        setCurrentOrder(currentOrderList)
        println(currentOrderList)
        println(currentOrderList.size)
    }

    fun getCurrentOrderList(): MutableList<ProductModel> {
        return currentOrderList
    }

}







