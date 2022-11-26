package com.CawCawStudio.Data.Cards

class Regular_card(
    var name:String,
    var color:String,
    val type:String,
    val priceBase: Int,
    val priceFirst:Int,
    val priceSecond:Int,
    val priceThird:Int,
    val priceFourth:Int,
    val priceLast:Int,
    var fieldCount:Int,
    val buy:Int,
    val build:Int,
){

    fun actualPrice():Int{
        when(fieldCount){
            0->return priceBase
            1->return priceFirst
            2->return priceSecond
            3->return priceThird
            4->return priceFourth
            5->return priceLast
        }
        return 0
    }
}
