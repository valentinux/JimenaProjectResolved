package com.example.jimenaproject.adapter

import android.content.DialogInterface
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jimenaproject.ProductsModel
import com.example.jimenaproject.databinding.ItemProductsBinding

class ProductsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemProductsBinding.bind(view)


    fun render(productsModel: ProductsModel, onClickListener:(ProductsModel)->Unit) {
        binding.tvnameProduct.text = productsModel.productname
        binding.tvProductDescription.text = productsModel.productdescription
        Glide.with(binding.ivProduct.context).load(productsModel.photo).into(binding.ivProduct)
        binding.IconAdd.setOnClickListener {onClickListener(productsModel) }
    }
}