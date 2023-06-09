/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.runtimepermissions

import android.Manifest
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.util.Log
import androidx.annotation.RequiresPermission
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.getSystemService
import kotlin.coroutines.suspendCoroutine


/**
 * To keep the sample simple, we are only displaying the number of sensors. You could do
 * something much more complicated.
 */

//@RequiresPermission(Manifest.permission.BODY_SENSORS)
//fun Context.sensorSummary(): String {
//    var heartRateValue : Float?=null
//
//    val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
//    val heartRateSensor = sensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE)
//
//    val sensorListener = object : SensorEventListener {
//        override fun onSensorChanged(event: SensorEvent) {
//            Log.d("Sensor availability","Sensor Available(Yes or No): $event.sensor.type")
//            if (event.sensor.type == Sensor.TYPE_HEART_RATE) {
//                 heartRateValue = event.values[0]
//                Log.d("SensorData", "Heart Rate Value: $heartRateValue")
//            }
//        }
//
//        override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {
//            // Handle accuracy change if needed
//        }
//    }
//
//    sensorManager.registerListener(sensorListener, heartRateSensor, SensorManager.SENSOR_DELAY_NORMAL)
//
//    // Wait for some time to allow the sensor data to be received
//    Thread.sleep(2000) // Adjust the delay as needed
//
//    sensorManager.unregisterListener(sensorListener)
//    return getString(R.string.sensor_summary, heartRateValue)
//}

@RequiresPermission(Manifest.permission.BODY_SENSORS)
 suspend fun Context.sensorSummary(): String = suspendCoroutine { continuation ->
    val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
    val sensorListener = HeartRateEventListener { heartRate ->
        sensorManager.unregisterListener(this@HeartRateEventListener)
        continuation.resumeWith(Result.success(heartRate.toString()))
    }
    val sensorHeartRate: Sensor = sensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE)
    val isSuccessiveHeartRate = sensorManager.registerListener(
        sensorListener,
        sensorHeartRate,
        SensorManager.SENSOR_DELAY_NORMAL
    )

    if (!isSuccessiveHeartRate) {
        Log.d("SENSOR_TAG", "failed to register a listener")
        sensorManager.unregisterListener(sensorListener)
        continuation.resumeWith(Result.success("Not registered"))
    }
}
class HeartRateEventListener(
    private val onHeartRateReceived: SensorEventListener.(Int) -> Unit
) : SensorEventListener {

    override fun onSensorChanged(event: SensorEvent?) {
        if (event?.sensor?.type == Sensor.TYPE_HEART_RATE) {
            val heartRate = event.values.getOrNull(0)?.toInt()
            if (heartRate != null && heartRate != 0) {
                onHeartRateReceived.invoke(this, heartRate)
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}
