fun main() {
    var animalerie = animalerie()

    animalerie.ajoutAnimal(chats())
    animalerie.ajoutAnimal(chiens())


    for (animals in animalerie.listAnimal) {
        animals.quiSuisJe()
        animals.parle()
    }
}
