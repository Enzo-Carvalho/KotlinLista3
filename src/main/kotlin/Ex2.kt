fun main(){
    var par = 0
    var impar = 0
    for(ler in 1..3){
        print("Digite o $ler numero: ")
        val num = readln().toInt()
        if(num%2==0){
            par++
        }
        else{
            impar++
        }
    }
    print("Quantidade par: $par \nQuantidade impar: $impar")
}