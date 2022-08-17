fun main(){
    var idade = 0
    var qntJovem = 0
    var qntVelho = 0
        while(idade != -99){
            print("Digite sua idade: ")
            idade = readln().toInt()
                if(idade in 0..21){
                    qntJovem++
                 }
                if(idade > 50){
                    qntVelho++
                }
        }
    println("Total de pessoas com menos de 21: $qntJovem")
    println("Total de pessoas com mais de 50: $qntVelho")
    }
