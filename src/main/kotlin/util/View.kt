package therealfarfetchd.knbt.util

interface View<in K, V> {
  operator fun get(key: K): V
  operator fun set(key: K, value: V)
}

fun <K, V> view(read: (key: K) -> V, write: (key: K, value: V) -> Unit): View<K, V> = object : View<K, V> {
  override fun get(key: K): V = read(key)
  override fun set(key: K, value: V) = write(key, value)
}