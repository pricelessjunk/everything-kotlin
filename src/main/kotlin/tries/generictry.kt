package tries

class Wrapper<T> {

}

open class Deserializer<T> {
    open fun deserialize(topic: String, data: ByteArray?): T? {
        // do nothing
        return null
    }
}

class JsonDeserializer<T> : Deserializer<Wrapper<T>?>() {
    override fun deserialize(topic: String, data: ByteArray?): Wrapper<T>? = data?.let {
        // Json.decodeFromString<Wrapper<T>>(String(it))
        return null
    }
}

fun main(){
    val myDeserializer = JsonDeserializer<String>()
}