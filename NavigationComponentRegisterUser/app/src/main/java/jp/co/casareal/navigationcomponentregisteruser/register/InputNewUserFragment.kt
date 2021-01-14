package jp.co.casareal.navigationcomponentregisteruser.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import jp.co.casareal.navigationcomponentregisteruser.R

class InputNewUserFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_new_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        requireActivity().findViewById<Button>(R.id.btn_register).setOnClickListener {

            // 何かしらの入力チェックが行われた上で、確認画面に遷移する

            val action =
                InputNewUserFragmentDirections.actionInputNewUserFragmentToNewUserConfirmationFragment()

            navController.navigate(action)
        }
    }
}