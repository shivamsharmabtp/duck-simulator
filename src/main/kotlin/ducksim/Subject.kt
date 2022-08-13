package ducksim

abstract class Subject {
    private var observers = ArrayList<Observer>()
    fun registerObserver(o: Observer) {
        observers.add(o)
    }

    fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}