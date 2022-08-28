package com.example.jimenaproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jimenaproject.ProductModel
import com.example.jimenaproject.R
import com.example.jimenaproject.databinding.CurrentOrderItemBinding
import com.example.jimenaproject.databinding.ItemProductsBinding

class CurrentOrderAdapter(private var productslist:MutableList<ProductModel>):
    RecyclerView.Adapter<CurrentOrderAdapter.ViewHolder>(){

    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        mContext = parent.context
        val view = LayoutInflater.from(mContext).inflate(R.layout.current_order_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentproducts = productslist.get(position)

        with(holder){
            binding.tvnameProduct.text = currentproducts.productname

        }
    }

    override fun getItemCount(): Int = productslist.size


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = CurrentOrderItemBinding.bind(view)
    }

}