fun main(){
    var soma = 0
    do{
        print("Digite um numero do teclado:")
        val num = readln().toInt()
        soma += num
    }while(num != 0)
    print("Soma dos numeros digitados: $soma")
}