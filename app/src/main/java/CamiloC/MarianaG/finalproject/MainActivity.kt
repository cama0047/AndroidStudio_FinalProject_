package CamiloC.MarianaG.finalproject

// https://brightspace.algonquincollege.com/d2l/le/content/282604/Home

import CamiloC.MarianaG.finalproject.databinding.ActivityMainBinding
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val baseUrl = "https:api.github.com/search/"
    private var searchString = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.searchButton.setOnClickListener{

            fetchData()
        }
    }

    private fun fetchData() {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val restApi = retrofit.create(RestApi::class.java)

        searchString = binding.searchUser.text.toString()

        val call = restApi.getUserData(searchString)
        
        call.enqueue(object: Callback<ResponseDataClass>{


            override fun onResponse(call: Call<ResponseDataClass>, response: Response<ResponseDataClass>) {
                val responseBody = response.body()
                val users = responseBody?.items
                val lenght = users?.size ?:0
                if (lenght>0){//No data available

                    val intent = Intent(TheApp.context, ResultsActivity::class.java)
                    intent.putExtra(getString(R.string.user_data_key), users)
                    startActivity(intent)
                }

            }

            override fun onFailure(call: Call<ResponseDataClass>, t: Throwable) {
                toast(t.message.toString())
            }

        })
    }


    //TOAST
    fun Context.toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}