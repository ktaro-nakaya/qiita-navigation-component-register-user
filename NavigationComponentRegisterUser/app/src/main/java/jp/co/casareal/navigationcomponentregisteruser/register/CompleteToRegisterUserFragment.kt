package jp.co.casareal.navigationcomponentregisteruser.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import jp.co.casareal.navigationcomponentregisteruser.R

class CompleteToRegisterUserFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 戻るボタンを押下されても、ログイン画面に戻るようにこの画面のライフサイクル中の戻るボタンのコールバックを変更
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            val navController = findNavController()
            val action =
                CompleteToRegisterUserFragmentDirections.actionCompleteToRegisterUserFragmentToLoginFragment()
            navController.navigate(action)
        }

        return inflater.inflate(R.layout.fragment_complete_to_register_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        requireActivity().findViewById<Button>(R.id.btn_finish_create_user).setOnClickListener {
            val action =
                CompleteToRegisterUserFragmentDirections.actionCompleteToRegisterUserFragmentToLoginFragment()
            navController.navigate(action)
        }
    }
}