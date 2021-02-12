package com.bignerdranch.android.geoquiz

//import android.arch.lifecycle.ViewModel
import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"
class QuizViewModel : ViewModel() {

    var currentIndex = 0
    private val questionBank = listOf(
            Question(R.string.question_wonders, true),
            Question(R.string.question_bones, true),
            Question(R.string.question_gold, false),
            Question(R.string.question_mountain, false),
            Question(R.string.question_parks, true),
            Question(R.string.question_india, true)
    )
    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer
    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId
    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }
}
