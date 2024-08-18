mport android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity



class MainActivity :   ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  buttonDownload= findViewById<Button>(R.id.btnDownload)
        val  buttonUpload = findViewById<Button>(R.id.btnUpload)


        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }

        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading...",Toast.LENGTH_SHORT).show()
        }
    }


}
