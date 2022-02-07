package com.example.keepersecuritycodingtest.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.keepersecuritycodingtest.R
import com.example.keepersecuritycodingtest.databinding.FragmentLoginBinding
import com.example.keepersecuritycodingtest.util.Verification

class LoginFragment: Fragment() {


    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.loginBtn.setOnClickListener { onLoginClick() }
        return binding.root
    }

    fun onLoginClick() {
        verifyInformation()
    }

    fun verifyInformation() {
        val verificationHelper = Verification()
        val email = binding.emailField.editText?.text.toString()
        if (!verificationHelper.emailVerify(email)) {
            binding.emailField.error = getString(R.string.error_email)
        } else {
            binding.emailField.error = null
        }
        val password = binding.masterPasswordField.editText?.text.toString()
        if (!verificationHelper.passwordVerify(password)) {
            binding.masterPasswordField.error = getString(R.string.error_password)
        } else {
            binding.masterPasswordField.error = null
        }
    }

}