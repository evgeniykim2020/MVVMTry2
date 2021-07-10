package com.evgeniykim.mvvmtry2.data.api

import com.evgeniykim.mvvmtry2.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}