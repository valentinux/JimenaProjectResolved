package com.example.jimenaproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jimenaproject.adapter.OrdersHandle
import com.example.jimenaproject.adapter.ProductsAdapter
import com.example.jimenaproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1000)
        setTheme(R.style.Theme_JimenaProject)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {

        binding.recyclerProducts.layoutManager = LinearLayoutManager(this)
        binding.recyclerProducts.adapter =
            ProductsAdapter(ProductsProvider.productsList) { onClickIconAdd(it) }
    }

    private fun onClickIconAdd(productToAdd: ProductModel) {
        val ordersHandle = OrdersHandle(productToAdd)
        ordersHandle.setProductToCurrentOrderList()
        val messageToToast = "Se ha añadido " + productToAdd.productname + " al desayuno"
        Toast.makeText(this, messageToToast, Toast.LENGTH_SHORT).show()

    }


}