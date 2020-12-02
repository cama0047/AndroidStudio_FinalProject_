package CamiloC.MarianaG.finalproject

import CamiloC.MarianaG.finalproject.databinding.ActivityMainBinding
import CamiloC.MarianaG.finalproject.databinding.ActivityResultsBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList


class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)


        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Connect data app
        @Suppress("UNCHECKED_CAST")
        val data = intent.getSerializableExtra(getString(R.string.user_data_key)) as ArrayList<Users>

        supportActionBar?.title = "${data.size} Results"


    }

}