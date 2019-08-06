package sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_view)

        val searchText: EditText = findViewById(R.id.et_search)
        val button: Button = findViewById(R.id.bt_search)

        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).also {
                it.putExtra(
                    "SEARCH",
                    searchText.text.toString()
                )
            })
        }

    }

}