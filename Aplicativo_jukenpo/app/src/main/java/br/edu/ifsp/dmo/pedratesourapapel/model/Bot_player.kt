package br.edu.ifsp.dmo.pedratesourapapel.model

import kotlin.random.Random

class Bot_player(val nome: String){

    var points: Int = 0
        private set

    fun recordPoint(){
        points += 1
    }

    fun chooseWeapon(): Weapon{
        val weapons = listOf(Rock, Paper, Scissors)
        return weapons[Random.nextInt(weapons.size)]
    }
}