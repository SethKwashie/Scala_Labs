object Functions {

def main(args:Array[String]){
   // println(printName("Seth"),anonymousFunction(2,4))
    //println(anotherFunc())
    //param(anonymousFunction(2,7))

    println(recurse(20))
}


def printName(name:String) : String = {
    return  name;
}

val anonymousFunction = (a:Int,b:Int) => a.+(b)

val anotherFunc = () => {printName("Gregory")}

//Function part of parameter list
def param(f:(Int,Int)=>Int){
    
}

def recurse(n:Int):Int ={
    if(n == 1) 1
    else n - recurse(n -1)
}

}
