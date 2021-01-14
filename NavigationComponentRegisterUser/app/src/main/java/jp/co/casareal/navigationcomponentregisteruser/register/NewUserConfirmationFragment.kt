package jp.co.casareal.navigationcomponentregisteruser.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import jp.co.casareal.navigationcomponentregisteruser.R

class NewUserConfirmationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_user_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args by navArgs<NewUserConfirmationFragmentArgs>()

        requireActivity().findViewById<TextView>(R.id.txt_confirmation_user_name).text = args.userName

        val navController = findNavController()

        requireActivity().findViewById<Button>(R.id.btn_configmation).setOnClickListener {

            // 何かしらの登録処理を行って遷移する

            val action =
                NewUserConfirmationFragmentDirections.actionNewUserConfirmationFragmentToCompleteToRegisterUserFragment()
            navController.navigate(action)
        }
    }
}