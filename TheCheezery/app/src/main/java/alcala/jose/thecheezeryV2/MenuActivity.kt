package alcala.jose.thecheezeryV2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button_cold_drinks: Button = findViewById(R.id.button_cold_drinks)
        var button_hot_drinks:Button=findViewById(R.id.button_hot_drinks)
        var button_salties:Button=findViewById(R.id.button_salties)
        var button_sweets:Button=findViewById(R.id.button_sweets)

        button_cold_drinks.setOnClickListener {
            val intent: Intent= Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        button_hot_drinks.setOnClickListener {
            var intent:Intent=Intent(this, HotDrinks::class.java)
            startActivity(intent)
        }

        button_salties.setOnClickListener {
            var intent:Intent=Intent(this, SaltiesActivity::class.java)
            startActivity(intent)
        }

        button_sweets.setOnClickListener {
            var intent:Intent=Intent(this, SweetsActivity::class.java)
            startActivity(intent)
        }
    }
}