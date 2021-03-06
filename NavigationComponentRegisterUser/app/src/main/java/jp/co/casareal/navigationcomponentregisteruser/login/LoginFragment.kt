package jp.co.casareal.navigationcomponentregisteruser.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import jp.co.casareal.navigationcomponentregisteruser.R


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        // ログインしたあとのウェルカム画面に遷移
        requireActivity().findViewById<Button>(R.id.btn_login).setOnClickListener {

            // 何かしらのログイン処理を行って画面遷移

            val action =
                LoginFragmentDirections.actionLoginFragmentToWelcomeFragment()

            navController.navigate(action)
        }

        // 新規登録画面に遷移
        requireActivity().findViewById<TextView>(R.id.txt_create_user).setOnClickListener {

            val action =
                LoginFragmentDirections.actionLoginFragmentToInputNewUserFragment()

            navController.navigate(action)
        }

    }
}