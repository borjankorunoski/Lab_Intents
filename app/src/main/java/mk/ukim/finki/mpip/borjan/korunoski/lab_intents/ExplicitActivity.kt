package mk.ukim.finki.mpip.borjan.korunoski.lab_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        val okBtn = findViewById<Button>(R.id.okBtn);
        val cancelBtn = findViewById<Button>(R.id.cancelBtn);
        val input = findViewById<TextView>(R.id.inputTextField);

        input.hint = "Insert text here.";
        val mainActivityIntent = Intent(this, MainActivity::class.java);

        okBtn.setOnClickListener() {
            mainActivityIntent.putExtra("textInput", input.text.toString());
            startActivity(mainActivityIntent);
        }

        cancelBtn.setOnClickListener() {
            mainActivityIntent.putExtra("textInput", "");
            startActivity(mainActivityIntent);
        }
    }
}