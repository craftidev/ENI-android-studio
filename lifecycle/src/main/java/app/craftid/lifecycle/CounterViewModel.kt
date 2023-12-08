package app.craftid.lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    var counter = MutableLiveData<Int>()
    init {
        counter.value = 0
    }
    fun increment() {
        counter.value = counter.value?.inc()
    }
}