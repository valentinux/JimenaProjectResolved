package com.example.jimenaproject.adapter


import com.example.jimenaproject.CurrentOrderProvider.CurrentOrderList.getCurrentOrder
import com.example.jimenaproject.CurrentOrderProvider.CurrentOrderList.setCurrentOrder
import com.example.jimenaproject.ProductModel

class OrdersHandle(productToHandle: ProductModel){

   private val mProductsToHandle = productToHandle


    private val currentOrderList = getCurrentOrder()


    fun setProductToCurrentOrderList(){

        currentOrderList.add(mProductsToHandle)
        setCurrentOrder(currentOrderList)
        println(currentOrderList)
        println(currentOrderList.size)
    }



}







