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

package com.example.android.navigationadvancedsample.listscreen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.navigationadvancedsample.R
import com.example.android.navigationadvancedsample.formscreen.LOG_APP_NAME
import com.example.android.navigationadvancedsample.listscreen.MyAdapter.Companion.USERNAME_KEY


/**
 * Shows a profile screen for a user, taking the name from the arguments.
 */
class UserProfile : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onCreateView: ")
        val view = inflater.inflate(R.layout.fragment_user_profile, container, false)

        val name = arguments?.getString(USERNAME_KEY) ?: "Ali Connors"
        view.findViewById<TextView>(R.id.profile_user_name).text = name
        return view
    }

    override fun onResume() {
        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onStop: ")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(" :$LOG_APP_NAME: ", "UserProfile: :onDetach: ")
        super.onDetach()
    }
}
