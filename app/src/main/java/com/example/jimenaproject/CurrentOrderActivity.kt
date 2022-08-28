package com.example.jimenaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jimenaproject.adapter.CurrentOrderAdapter
import com.example.jimenaproject.databinding.ActivityCurrentOrderBinding

class CurrentOrderActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityCurrentOrderBinding
    private lateinit var mAdapter: CurrentOrderAdapter
    private lateinit var mLayoutManayer: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {

        mBinding = ActivityCurrentOrderBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mAdapter = CurrentOrderAdapter(CurrentOrderProvider.currentOrderList)
        mLayoutManayer = LinearLayoutManager(this)

        mBinding.recyclerCurrentOrder.apply {
            setHasFixedSize(true)
            layoutManager = mLayoutManayer
            adapter = mAdapter
        }
    }


}