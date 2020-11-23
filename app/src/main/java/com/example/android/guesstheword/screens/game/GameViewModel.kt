package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel(){
    init {
        Log.i("GameViewModel", "ViewModel of game class is called here!!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "Game View Model is destroyed !!!")
    }
}