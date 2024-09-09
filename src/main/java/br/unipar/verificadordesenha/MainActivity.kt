package senhavef

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.unipar.verificadordesenha.R

class MainActivity : AppCompatActivity() {

    private val CORRECT_PASSWORD = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências para os elementos da interface
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val buttonCheckPassword: Button = findViewById(R.id.buttonCheckPassword)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        // Configura o listener do botão
        buttonCheckPassword.setOnClickListener {
            // Obtém o texto inserido no EditText
            val enteredPassword = editTextPassword.text.toString()

            // Verifica se a senha está correta
            if (enteredPassword == CORRECT_PASSWORD) {
                textViewResult.text = "Senha correta"
            } else {
                textViewResult.text = "Senha incorreta"
            }
        }
    }
}