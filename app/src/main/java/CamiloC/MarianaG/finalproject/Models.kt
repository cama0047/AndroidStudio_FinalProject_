package CamiloC.MarianaG.finalproject


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.io.Serializable
import java.util.ArrayList



// region Returned JSON
/*

  "total_count": 1,
  "incomplete_results": false,
  "items": [
    {
      "login": "crazybob1215",
      "id": 45743617,
      "node_id": "MDQ6VXNlcjQ1NzQzNjE3",
      "avatar_url": "https://avatars0.githubusercontent.com/u/45743617?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/crazybob1215",
      "html_url": "https://github.com/crazybob1215",
      "followers_url": "https://api.github.com/users/crazybob1215/followers",
      "following_url": "https://api.github.com/users/crazybob1215/following{/other_user}",
      "gists_url": "https://api.github.com/users/crazybob1215/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/crazybob1215/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/crazybob1215/subscriptions",
      "organizations_url": "https://api.github.com/users/crazybob1215/orgs",
      "repos_url": "https://api.github.com/users/crazybob1215/repos",
      "events_url": "https://api.github.com/users/crazybob1215/events{/privacy}",
      "received_events_url": "https://api.github.com/users/crazybob1215/received_events",
      "type": "User",
      "site_admin": false,
      "score": 1.0
    }
  ]
}
* */
//endregion


// region REST API interface
interface RestApi{
    //llamada en la URL ... /users?
    @GET("users?")
    fun getUserData(@Query("q") searchName: String):
            Call<ResponseDataClass>

}


// endregion

data class ResponseDataClass(
        val incomplete_results: Boolean,
        val items: ArrayList<Users>,
        val total_count: Int
): Serializable

data class Users(
        val avatar_url: String,
        val events_url: String,
        val followers_url: String,
        val following_url: String,
        val gists_url: String,
        val gravatar_id: String,
        val html_url: String,
        val id: Int,
        val login: String,
        val node_id: String,
        val organizations_url: String,
        val received_events_url: String,
        val repos_url: String,
        val score: Double,
        val site_admin: Boolean,
        val starred_url: String,
        val subscriptions_url: String,
        val type: String,
        val url: String
) :Serializable