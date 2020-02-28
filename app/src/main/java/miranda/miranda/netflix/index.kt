package miranda.miranda.netflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_index.*

class index : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        btn_entrar.setOnClickListener{
            //setContentView(R.layout.activity_registro)
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}
