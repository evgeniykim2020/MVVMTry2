package com.evgeniykim.mvvmtry2.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.evgeniykim.mvvmtry2.R
import com.evgeniykim.mvvmtry2.data.model.User
import com.evgeniykim.mvvmtry2.databinding.ItemLayoutBinding

class MainAdapter (private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            var imageUrl: ImageView = itemView.findViewById(R.id.imageViewAvatar)
            var userName: AppCompatTextView = itemView.findViewById(R.id.textViewUserName)
            var userEmail: AppCompatTextView = itemView.findViewById(R.id.textViewUserEmail)

//            var imageUrlStr: String
            var userNameStr: String
            var userEmailStr: String

//            imageUrlStr = imageUrl.toString()
            userNameStr = userName.toString()
            userEmailStr = userEmail.toString()

//            imageUrlStr = user.avatar
            userNameStr = user.name
            userEmailStr = user.email
            Glide.with(imageUrl.context)
                .load(user.avatar)
                .into(imageUrl)




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
    )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(users[position])

    override fun getItemCount(): Int = users.size

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}