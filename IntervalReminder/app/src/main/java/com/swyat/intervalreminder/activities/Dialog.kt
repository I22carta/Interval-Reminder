// Подключение необходимых библиотек и классов
package com.swyat.intervalreminder.activities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.swyat.intervalreminder.R

// Создание класса "dialog", который наследуется от класса "DialogFragment"
class dialog : DialogFragment() {

    // Переопределение метода "onCreateView" для создания пользовательского интерфейса фрагмента
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Создание корневого представления фрагмента
        val rootView: View = inflater.inflate(R.layout.fragment_dialog, container, false)

        // Найти кнопку по идентификатору
        val bCancel: Button = rootView.findViewById(R.id.bCancel)
        val bOk: Button = rootView.findViewById(R.id.bOk)
        val eT: EditText = rootView.findViewById(R.id.editText)

        // Добавить обработчик нажатия на кнопку
        bCancel.setOnClickListener {
            // Закрыть фрагмент
            dismiss()
        }

        bOk.setOnClickListener{
            if (eT.text.isEmpty()) {
                Toast.makeText(requireContext(), "Заполните поле", Toast.LENGTH_LONG).show()
            }
        }
        return rootView
    }
}