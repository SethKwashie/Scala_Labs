
class Trade(val name:String,val id:String,val qty:Double,var price:Double){
    override def toString(): String = {
        return s"This is a Trade class with $name $id $qty $price"
    }
}

