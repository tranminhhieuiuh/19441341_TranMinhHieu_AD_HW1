package com.example.a19441341_tranminhhieu_ad_todoapp

interface UpdateAndDelete{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)
}