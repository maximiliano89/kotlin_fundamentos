fun main(){
    println("Bem Vindo ao ByteBank!")

    //tipos de variaveis
    //variavel de valor imutavel
    val titular = "Max"
    val numeroConta = 1000
    var saldo = 0.00
    //não se é possivel inferir valor de int direto no double
    saldo = 100 + 2.0
    //mas se vc faz uma operação com ele +2.0 ele se torna double e o kotlin o aceita
    saldo +=200
    //pode ser feito o calculo dessa maneira varivale += valor

    //varivale de valor alteravel
    //var nome = "Marcos"
    //println("Titular " + nome)

    //em kotlin chamar a variavel dentro do print se chama stringtemplate com o $ e o nome da variavel
    println("Titular $titular")
    println("Número da conta $numeroConta")
    println("Saldo da Conta $saldo")

    //Similar ao switch case
    when{
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }


}