package one.digitalinnovation.collections

class Repositorio <T> {
    private val mapa = mutableMapOf<String,  T>()

    fun create(id :String, value :T){
        mapa[id] = value
    }

    fun remove(id: String) = mapa.remove(id)

    fun findById(id: String) = mapa.get(id)

    fun findAll() = mapa.values
}