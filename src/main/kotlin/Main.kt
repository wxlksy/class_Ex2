import kotlin.math.sqrt

data class Point(val x: Double, val y: Double)
{

    fun dist(other: Point): Double
    {
        val dx = this.x - other.x
        val dy = this.y - other.y
        return sqrt(dx * dx + dy * dy)
    }
}

fun main()
{
    try
    {
        println("Введите координаты первой точки (x y):")

        val point1 = readP()

        println("Введите координаты второй точки (x y):")

        val point2 = readP()

        val distance = point1.dist(point2)

        println("Расстояние: $distance")
    }

    catch (e: NumberFormatException)
    {
        println("Ошибка ввода")
    }
}

fun readP(): Point
{
    val s = readLine()?.split(" ") ?: throw NumberFormatException()

    if (s.size != 2)
    {
        throw NumberFormatException()
    }

    val x = s[0].toDouble()
    val y = s[1].toDouble()
    return Point(x, y)
}