package miller.util.jomlextensions

import org.joml.*

fun Vector2i.toVector2f(): Vector2f = Vector2f(x.toFloat(), y.toFloat())
fun Vector2i.toVector2d(): Vector2d = Vector2d(x.toDouble(), y.toDouble())
fun Vector2f.toVector2i(): Vector2i = Vector2i(x.toInt(), y.toInt())
fun Vector2f.toVector2d(): Vector2d = Vector2d(x.toDouble(), y.toDouble())
fun Vector2d.toVector2i(): Vector2i = Vector2i(x.toInt(), y.toInt())
fun Vector2d.toVector2f(): Vector2f = Vector2f(x.toFloat(), y.toFloat())
fun Vector3i.toVector3f(): Vector3f = Vector3f(x.toFloat(), y.toFloat(), z.toFloat())
fun Vector3i.toVector3d(): Vector3d = Vector3d(x.toDouble(), y.toDouble(), z.toDouble())
fun Vector3f.toVector3i(): Vector3i = Vector3i(x.toInt(), y.toInt(), z.toInt())
fun Vector3f.toVector3d(): Vector3d = Vector3d(x.toDouble(), y.toDouble(), z.toDouble())
fun Vector3d.toVector3i(): Vector3i = Vector3i(x.toInt(), y.toInt(), z.toInt())
fun Vector3d.toVector3f(): Vector3f = Vector3f(x.toFloat(), y.toFloat(), z.toFloat())
fun Vector4i.toVector4f(): Vector4f = Vector4f(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())
fun Vector4i.toVector4d(): Vector4d = Vector4d(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
fun Vector4f.toVector4i(): Vector4i = Vector4i(x.toInt(), y.toInt(), z.toInt(), w.toInt())
fun Vector4f.toVector4d(): Vector4d = Vector4d(x.toDouble(), y.toDouble(), z.toDouble(), w.toDouble())
fun Vector4d.toVector4i(): Vector4i = Vector4i(x.toInt(), y.toInt(), z.toInt(), w.toInt())
fun Vector4d.toVector4f(): Vector4f = Vector4f(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())

fun Vector2i.toVector3i(z: Int = 0): Vector3i = Vector3i(x, y, z)
fun Vector2i.toVector3f(z: Float = 0f): Vector3f = Vector3f(x.toFloat(), y.toFloat(), z)
fun Vector2i.toVector3d(z: Double = 0.0): Vector3d = Vector3d(x.toDouble(), y.toDouble(), z)
fun Vector2f.toVector3i(z: Int = 0): Vector3i = Vector3i(x.toInt(), y.toInt(), z)
fun Vector2f.toVector3f(z: Float = 0f): Vector3f = Vector3f(x, y, z)
fun Vector2f.toVector3d(z: Double = 0.0): Vector3d = Vector3d(x.toDouble(), y.toDouble(), z)
fun Vector2d.toVector3i(z: Int = 0): Vector3i = Vector3i(x.toInt(), y.toInt(), z)
fun Vector2d.toVector3f(z: Float = 0f): Vector3f = Vector3f(x.toFloat(), y.toFloat(), z)
fun Vector2d.toVector3d(z: Double = 0.0): Vector3d = Vector3d(x, y, z)
fun Vector2i.toVector4i(z: Int = 1, w: Int = 0): Vector4i = Vector4i(x, y, z, w)
fun Vector2i.toVector4f(z: Float = 1f, w: Float = 0f): Vector4f = Vector4f(x.toFloat(), y.toFloat(), z, w)
fun Vector2i.toVector4d(z: Double = 1.0, w: Double = 0.0): Vector4d = Vector4d(x.toDouble(), y.toDouble(), z, w)
fun Vector2f.toVector4i(z: Int = 1, w: Int = 0): Vector4i = Vector4i(x.toInt(), y.toInt(), z, w)
fun Vector2f.toVector4f(z: Float = 1f, w: Float = 0f): Vector4f = Vector4f(x, y, z, w)
fun Vector2f.toVector4d(z: Double = 1.0, w: Double = 0.0): Vector4d = Vector4d(x.toDouble(), y.toDouble(), z, w)
fun Vector2d.toVector4i(z: Int = 1, w: Int = 0): Vector4i = Vector4i(x.toInt(), y.toInt(), z, w)
fun Vector2d.toVector4f(z: Float = 1f, w: Float = 0f): Vector4f = Vector4f(x.toFloat(), y.toFloat(), z, w)
fun Vector2d.toVector4d(z: Double = 1.0, w: Double = 0.0): Vector4d = Vector4d(x, y, z, w)

fun Vector3i.toVector2i(): Vector2i = Vector2i(x, y)
fun Vector3i.toVector2f(): Vector2f = Vector2f(x.toFloat(), y.toFloat())
fun Vector3i.toVector2d(): Vector2d = Vector2d(x.toDouble(), y.toDouble())
fun Vector3f.toVector2i(): Vector2i = Vector2i(x.toInt(), y.toInt())
fun Vector3f.toVector2f(): Vector2f = Vector2f(x, y)
fun Vector3f.toVector2d(): Vector2d = Vector2d(x.toDouble(), y.toDouble())
fun Vector3d.toVector2i(): Vector2i = Vector2i(x.toInt(), y.toInt())
fun Vector3d.toVector2f(): Vector2f = Vector2f(x.toFloat(), y.toFloat())
fun Vector3d.toVector2d(): Vector2d = Vector2d(x, y)
fun Vector3i.toVector4i(w: Int = 1): Vector4i = Vector4i(x, y, z, w)
fun Vector3i.toVector4f(w: Float = 1f): Vector4f = Vector4f(x.toFloat(), y.toFloat(), z.toFloat(), w)
fun Vector3i.toVector4d(w: Double = 1.0): Vector4d = Vector4d(x.toDouble(), y.toDouble(), z.toDouble(), w)
fun Vector3f.toVector4i(w: Int = 1): Vector4i = Vector4i(x.toInt(), y.toInt(), z.toInt(), w)
fun Vector3f.toVector4f(w: Float = 1f): Vector4f = Vector4f(x, y, z, w)
fun Vector3f.toVector4d(w: Double = 1.0): Vector4d = Vector4d(x.toDouble(), y.toDouble(), z.toDouble(), w)
fun Vector3d.toVector4i(w: Int = 1): Vector4i = Vector4i(x.toInt(), y.toInt(), z.toInt(), w)
fun Vector3d.toVector4f(w: Float = 1f): Vector4f = Vector4f(x.toFloat(), y.toFloat(), z.toFloat(), w)
fun Vector3d.toVector4d(w: Double = 1.0): Vector4d = Vector4d(x, y, z, w)

fun Vector4i.toVector2i(): Vector2i = Vector2i(x, y)
fun Vector4i.toVector2f(): Vector2f = Vector2f(x.toFloat(), y.toFloat())
fun Vector4i.toVector2d(): Vector2d = Vector2d(x.toDouble(), y.toDouble())
fun Vector4f.toVector2i(): Vector2i = Vector2i(x.toInt(), y.toInt())
fun Vector4f.toVector2f(): Vector2f = Vector2f(x, y)
fun Vector4f.toVector2d(): Vector2d = Vector2d(x.toDouble(), y.toDouble())
fun Vector4d.toVector2i(): Vector2i = Vector2i(x.toInt(), y.toInt())
fun Vector4d.toVector2f(): Vector2f = Vector2f(x.toFloat(), y.toFloat())
fun Vector4d.toVector2d(): Vector2d = Vector2d(x, y)
fun Vector4i.toVector3i(): Vector3i = Vector3i(x, y, z)
fun Vector4i.toVector3f(): Vector3f = Vector3f(x.toFloat(), y.toFloat(), z.toFloat())
fun Vector4i.toVector3d(): Vector3d = Vector3d(x.toDouble(), y.toDouble(), z.toDouble())
fun Vector4f.toVector3i(): Vector3i = Vector3i(x.toInt(), y.toInt(), z.toInt())
fun Vector4f.toVector3f(): Vector3f = Vector3f(x, y, z)
fun Vector4f.toVector3d(): Vector3d = Vector3d(x.toDouble(), y.toDouble(), z.toDouble())
fun Vector4d.toVector3i(): Vector3i = Vector3i(x.toInt(), y.toInt(), z.toInt())
fun Vector4d.toVector3f(): Vector3f = Vector3f(x.toFloat(), y.toFloat(), z.toFloat())
fun Vector4d.toVector3d(): Vector3d = Vector3d(x, y, z)


fun Vector2f.format(digits: Int = 2) = "(${"%.${digits}f".format(x)}, ${"%.${digits}f".format(y)})"
fun Vector2d.format(digits: Int = 2) = "(${"%.${digits}f".format(x)}, ${"%.${digits}f".format(y)})"
fun Vector2i.format() = "($x, $y)"
fun Vector3f.format(digits: Int = 2) = "(${"%.${digits}f".format(x)}, ${"%.${digits}f".format(y)}, ${"%.${digits}f".format(z)})"
fun Vector3d.format(digits: Int = 2) = "(${"%.${digits}f".format(x)}, ${"%.${digits}f".format(y)}, ${"%.${digits}f".format(z)})"
fun Vector3i.format() = "($x, $y, $z)"
fun Vector4f.format(digits: Int = 2) = "(${"%.${digits}f".format(x)}, ${"%.${digits}f".format(y)}, ${"%.${digits}f".format(z)}, ${"%.${digits}f".format(w)})"
fun Vector4d.format(digits: Int = 2) = "(${"%.${digits}f".format(x)}, ${"%.${digits}f".format(y)}, ${"%.${digits}f".format(z)}, ${"%.${digits}f".format(w)})"
fun Vector4i.format() = "($x, $y, $z, $w)"