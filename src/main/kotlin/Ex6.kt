fun main(){
    var soma = 0.0
    var qnt = 0.0
    do{
        print("Digite um numero do teclado:")
        val num = readln().toInt()
        if(num%3==0 && num!=0){
            soma += num
            qnt++
        }
    }while(num != 0)
    print("Média: ${soma/qnt}")
}