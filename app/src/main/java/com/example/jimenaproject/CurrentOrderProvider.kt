package com.example.jimenaproject


class CurrentOrderProvider {
    companion object CurrentOrderList{
        private val currentOrderList =  mutableListOf<ProductModel>()

        fun getCurrentOrder(): MutableList<ProductModel> {
            return currentOrderList
        }

        fun setCurrentOrder(currentOrderList: MutableList<ProductModel>){

        }
    }


}