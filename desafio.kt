import java.sql.DriverManager.println

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun listarInscritos(): MutableList<Usuario> {
        return inscritos
    }
}

fun main() {

    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudos: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Linguagem Kotlin", 40),
        ConteudoEducacional("Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin", 40))

    val formacao = Formacao("Kotlin Experience", conteudos, Nivel.BASICO)

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Usuários: ${usuario1.nome}, ${usuario2.nome}")
    println("Formacao: ${formacao.toString()}")
    println("Inscritos na formação: ${formacao.listarInscritos()}")
}
