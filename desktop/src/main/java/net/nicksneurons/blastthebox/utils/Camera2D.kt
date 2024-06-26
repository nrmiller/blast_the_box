package net.nicksneurons.blastthebox.utils

import miller.util.jomlextensions.toVector3f
import net.nicksneurons.blastthebox.client.Engine
import net.nicksneurons.blastthebox.ecs.Transform
import org.joml.Matrix4f
import org.joml.Vector2f
import org.joml.Vector3f
import kotlin.math.cos
import kotlin.math.sin

class Camera2D: Camera {
    var zoom: Float = 1.0f
        set(value) {
            field = if (value < MINIMUM_ZOOM) MINIMUM_ZOOM else value
        }

    var isCentered: Boolean = false
    var invertY: Boolean = false

    var position = Vector2f(0.0f, 0.0f)

    var rotation: Float = 0.0f

//    override val transform: Transform
//        get() {
//            return Transform(
//                position.toVector3f(),
//                Vector3f(0.0f, 0.0f, rotation),
//                Vector3f(zoom, zoom, 0.0f)
//            )
//        }

    override fun createViewMatrix(): Matrix4f {
        return Matrix4f().lookAt(
                position.x, position.y, 50.0f,
                position.x, position.y, 0.0f,
                cos(Math.PI.toFloat() / 2.0f + rotation), sin(Math.PI.toFloat() / 2.0f + rotation), 0.0f)
    }

    override fun createProjectionMatrix(): Matrix4f {
        val width = Engine.instance.width
        val height = Engine.instance.height

        return if (isCentered) {
            val halfWidth = width / 2.0f
            val halfHeight = height / 2.0f

            if (invertY) {
                Matrix4f().ortho(-halfWidth, halfWidth, halfHeight, -halfHeight, 0.0f, 100.0f).scale(zoom, zoom, 1.0f)
            } else {
                Matrix4f().ortho(-halfWidth, halfWidth, -halfHeight, halfHeight, 0.0f, 100.0f).scale(zoom, zoom, 1.0f)
            }
        } else {
            if (invertY) {
                Matrix4f().ortho(0.0f, width.toFloat(), height.toFloat(), 0.0f, 0.0f, 100.0f).scale(zoom, zoom, 1.0f)
            } else {
                Matrix4f().ortho(0.0f, width.toFloat(), 0.0f, height.toFloat(), 0.0f, 100.0f).scale(zoom, zoom, 1.0f)
            }

        }
    }

    companion object {
        const val MINIMUM_ZOOM = 0.125f
    }
}