fun main(){
    var sexo = 0
    var temperamento = 0
    var pessoas = 0
    var calma = 0
    var jovemCalmo = 0
    var mulherNervosa = 0
    var velhoNervoso = 0
    var homemAgressivo = 0
    var outrosCalmo = 0
    while(pessoas <= 5){
        print("Digite sua idade: ")
        val idade = readln().toInt()
        println()
        do{
        print("Sendo: \n(1)feminino \n(2)masculino \n(3)outros \nDigite seu sexo: ")
        sexo = readln().toInt()}
        while(sexo !in 1..3)
        println()
        do{
            print("Sendo: \n(1)calma; \n(2)nervosa \n(3)agressiva \nQual perfil você se enquadra: ")
            temperamento = readln().toInt()}
        while(temperamento !in 1..3)
            if(temperamento ==1){
                calma++
                if(idade<18){
                    jovemCalmo++
                }
            }
            if(sexo ==2 && temperamento ==2){
                mulherNervosa++
            }
            if(temperamento == 2 && idade>40){
                velhoNervoso++
            }
            if(sexo ==1 && temperamento == 3){
                homemAgressivo++
            }
            if (sexo ==3 && temperamento ==1){
                outrosCalmo++
            }
        pessoas++
    }
    println()
    println("O número de pessoas calmas: $calma ")
    println("o número de mulheres nervosas: $mulherNervosa")
    println("o número de homens agressivos: $homemAgressivo")
    println("o número de outros calmos: $outrosCalmo")
    println("o número de pessoas nervosas com mais de 40 anos: $velhoNervoso")
    println("o número de pessoas calmas com menos de 18 anos: $jovemCalmo")

}