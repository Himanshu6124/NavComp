package com.himanshu.navcomp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class homeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        activity?.title = "gs"

//        (activity as MainActivity).actionTitle("ghgh")
       val view =  inflater.inflate(R.layout.fragment_home, container, false)

        val name = "Himanshu"
        val branch = "CS"
        var x :Int = 4

        val bundle = Bundle()
        bundle.putString("v1",name)


        val tv = view.findViewById<TextView>(R.id.homeTV)

//        val action = homeFragmentDirections.actionHomeFragmentToHomeDetail(4)

        val action = homeFragmentDirections.actionHomeFragmentToHomeDetail(x,name)



        tv.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putString("v1",name)
//            bundle.putString("v2",branch)
            Navigation.findNavController(it).navigate(action)
        }




            return view

    }

    fun showMessage()
    {
        Log.i("hp" ,"show")
        Toast.makeText(activity  ,"from activity",Toast.LENGTH_SHORT).show()
    }




}