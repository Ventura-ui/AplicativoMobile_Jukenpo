package br.edu.ifsp.dmo.pedratesourapapel.model

class Player(val nome: String) {

    var points: Int = 0
        private set

    fun recordPoint(){
        points += 1
    }

}