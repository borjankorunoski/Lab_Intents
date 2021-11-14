package mk.ukim.finki.mpip.borjan.korunoski.lab_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitBtn = findViewById<Button>(R.id.explicitBtn);
        val implicitBtn = findViewById<Button>(R.id.implicitBtn);
        val shareBtn = findViewById<Button>(R.id.shareBtn);
        val photoBtn = findViewById<Button>(R.id.photoBtn);
        val label = findViewById<TextView>(R.id.textView);

        val bundle: Bundle? = intent.extras;
        if (bundle != null) {
            val text = bundle.get("textInput");
            label.text = text.toString();
        }

        explicitBtn.setOnClickListener() {
            val explicitIntent = Intent(this, ExplicitActivity::class.java);
            startActivity(explicitIntent);
        }

        implicitBtn.setOnClickListener() {
            val implicitIntent = Intent("mk.ukim.finki.mpip.IMPLICIT_ACTION");
            startActivity(implicitIntent);
        }
    }
}