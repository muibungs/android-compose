package com.me.compose.sample.subpack

import SmartDevice

class SubDevice(deviceName: String, deviceCategory: String){

    fun demoFunc() {
        var smartDevice = SmartDevice("123","312")
        smartDevice.deviceStatus // public , internal can call it
    }
}