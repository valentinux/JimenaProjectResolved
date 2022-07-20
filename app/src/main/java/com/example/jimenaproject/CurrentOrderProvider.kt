package com.example.jimenaproject

import android.util.Log

class CurrentOrderProvider {
    companion object CurrentOrderList{
        private val currentOrderList =  mutableListOf<ProductModel>()

        fun getCurrentOrder(): MutableList<ProductModel> {
            return CurrentOrderList.currentOrderList
        }

        fun setCurrentOrder(ListToReturn: MutableList<ProductModel>){
            Log.i("Lista", CurrentOrderList.currentOrderList.size.toString() )
        }
    }


}