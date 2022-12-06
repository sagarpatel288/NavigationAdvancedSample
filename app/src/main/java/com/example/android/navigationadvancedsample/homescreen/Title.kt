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

package com.example.android.navigationadvancedsample.homescreen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.navigationadvancedsample.R
import com.example.android.navigationadvancedsample.formscreen.LOG_APP_NAME

/**
 * Shows the main title screen with a button that navigates to [About].
 */
class Title : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onCreateView: ")
        val view = inflater.inflate(R.layout.fragment_title, container, false)
        view.findViewById<Button>(R.id.about_btn).setOnClickListener {
            findNavController().navigate(R.id.action_title_to_about)
        }
        return view
    }

    override fun onResume() {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(" :$LOG_APP_NAME: ", "Title: :onDetach: ")
        super.onDetach()
    }
}
