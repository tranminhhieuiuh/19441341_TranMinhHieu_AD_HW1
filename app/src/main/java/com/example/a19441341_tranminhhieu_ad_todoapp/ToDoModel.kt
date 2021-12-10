package com.example.a19441341_tranminhhieu_ad_todoapp

package iuh.doanminhtruong.ms19519011.a19519011_doanminhtruong_ad_todoapp

class ToDoModel {
    companion object Factory{
        fun createList(): ToDoModel = ToDoModel()
    }
    var UID : String? = null
    var itemDataText : String? = null
    var done : Boolean? = false
}