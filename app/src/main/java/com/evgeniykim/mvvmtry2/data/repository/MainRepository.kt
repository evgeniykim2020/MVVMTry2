package com.evgeniykim.mvvmtry2.data.repository

import com.evgeniykim.mvvmtry2.data.api.ApiHelper
import com.evgeniykim.mvvmtry2.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}