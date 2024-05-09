fun main() {
    println(soma(1,2))
    println(multiplicacao(5,9))
    println(calculadora(2,3, ::soma))
    println(calculadora(3,5, ::multiplicacao))

    //Exercício 4

    val numeros = (1..99).toList()

    val numerosPares = numeros.filter { it % 2 == 0 }

    println(numerosPares)


    //Exercício 5

    val nomes = listOf("Carlos", "João", "Mariana", "Stella")
    val olaNomes = nomes.map{"Olá $it"}

    olaNomes.forEach{
        println(it)
    }



}

/*1- Crie uma função que receba dois números inteiros de parâmetro e retorne o resultado de soma*/

fun soma(valor1: Int, valor2: Int): Int{
    val resultado = valor1 + valor2
    return resultado
}

/*2- Crie uma função compacta que receba dois números inteiros de parâmetro e retorne
* o resultado da multiplicação entre eles*/

fun multiplicacao(valor1: Int, valor2: Int) = valor1 * valor2

/*3-Crie uma função calculadora que recebe dois inteiros como parâmetro e um terceiro parâmetro
* do tipo função. Esta função de parâmetro deve receber dois inteiro de parâmetro e retornar um inteiro.
* Teste esta função passando dois inteiros e a função soma.
* Teste esta função passando os mesmos inteiros anteriores mas passando a multiplicação.*/

fun calculadora(valor1: Int, valor2: Int, operacao:(Int,Int) -> Int): Int{
    return operacao(valor1,valor2)
}

/*4- Crie uma lista de 1 a 99. Crie um filtro que retorne os números pares.*/

/*5- Crie uma lista de strings com 4 nomes.
* Utilizando map concatene olá a cada nome
* Percorra a lista com forEach e imprima todos os valores*/