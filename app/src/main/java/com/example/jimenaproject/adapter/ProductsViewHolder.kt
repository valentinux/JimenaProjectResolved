package com.example.jimenaproject.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jimenaproject.ProductModel
import com.example.jimenaproject.databinding.ItemProductsBinding

class ProductsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemProductsBinding.bind(view)


    fun render(productsModel: ProductModel, onClickListener:(ProductModel)->Unit) {
        binding.tvnameProduct.text = productsModel.productname
        binding.tvProductDescription.text = productsModel.productdescription
        Glide.with(binding.ivProduct.context).load(productsModel.photo).into(binding.ivProduct)
        binding.IconAdd.setOnClickListener {onClickListener(productsModel) }
    }
}