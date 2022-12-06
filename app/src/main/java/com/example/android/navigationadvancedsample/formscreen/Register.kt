/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigationadvancedsample.formscreen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.navigationadvancedsample.R

const val LOG_APP_NAME = " :NavDemo: "
/**
 * Shows a register form to showcase UI state persistence. It has a button that goes to [Registered]
 */
class Register : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onCreateView: ")
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        view.findViewById<Button>(R.id.signup_btn).setOnClickListener {
            findNavController().navigate(R.id.action_register_to_registered)
        }
        return view
    }

    override fun onResume() {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(" :$LOG_APP_NAME: ", "Register: :onDetach: ")
        super.onDetach()
    }
}
