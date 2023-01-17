package com.himanshu.navcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class HomeDetail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home_detail, container, false)

        val tv1 = view.findViewById<TextView>(R.id.tv1HomeDetail)
        val tv2 = view.findViewById<TextView>(R.id.tv2HomeDetail)



//        val bundle = Bundle()
// from bundle
        val a = arguments?.getString("v1")

//        val bundle = Bundle()
            // from args
//        val b = HomeDetailArgs.fromBundle(arguments)

        val bundle = requireArguments()

//        arguments?.let{
//             val args = HomeDetailArgs.fromBundle(it).id.toString()
//            tv2.text = args
//
//        }

        val args = HomeDetailArgs.fromBundle(bundle)



//        val b = arguments?.getInt("x")

        tv1.text = args.id.toString()
        tv2.text = args.name



        return view
    }
}