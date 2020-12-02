package CamiloC.MarianaG.finalproject

import CamiloC.MarianaG.finalproject.databinding.DataRowBinding
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CustomViewHolderClass(val view: View, var login: String = "",
                            var user: Users? = null) // a single Users object from ResponseDataClass/Users classes
    : RecyclerView.ViewHolder(view){

    val binding = DataRowBinding.bind(view)

    companion object{
        val titleKey = "ACTIONBAR_TITLE"
        val objectKey = "ITEM_DATA"
    }
}

class MainAdapter(private val responseDataClass: ArrayList<Users>) :
    RecyclerView.Adapter<CustomViewHolderClass>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolderClass {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: CustomViewHolderClass, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int = responseDataClass.size

}