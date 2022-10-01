package com.example.hw63

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw63.databinding.FragmentSecondBinding

class SecondFragment : Fragment() , onClick  {

    private lateinit var binding: FragmentSecondBinding
    private val data = ArrayList<Model>()
    private lateinit var adapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initAdapter()
    }
    private fun loadData() {
        data.add(Model("Jasmine", "DPR LIVE", "3:12", 1))
        data.add(Model("Cheese & Wine", "DPR LIVE", "3:12", 2))
        data.add(Model("Martini Blue", "DPR LIVE", "3:16", 3))
        data.add(Model("Jam & Butterfly", "DPR LIVE", "3:15", 4))
        data.add(Model("Text me", "DPR LIVE", "3:17", 5))
        data.add(Model("To myself", "DPR LIVE", "3:14", 6))
        data.add(Model("thirst", "DPR LIVE", "3:15", 7))
    }


    private fun initAdapter() {
        adapter = MainAdapter(data , this::onCLick )
        binding.recyclerView.adapter = adapter
    }

    override fun onCLick(name: String) {
        Intent(requireContext() ,SecondActivity::class.java).apply {
            putExtra("key" , name)
            startActivity(this)
        }
    }


}