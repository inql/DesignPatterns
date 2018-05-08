package com.mposluszny.dp.builder.fluent;

import com.mposluszny.dp.builder.domain.Device
import com.mposluszny.dp.builder.domain.Laptop
import com.mposluszny.dp.builder.domain.Connectivity
import com.mposluszny.dp.builder.domain.OperatingSystem

class LaptopBuilder(device: Device = new Laptop()) extends DeviceBuilderFluent {

  def connectivity(): DeviceBuilderFluent = {
    device.connectivity = device.connectivity + (Connectivity.BLUETOOTH, Connectivity.WIFI)
    this
  }
  
  def operatingSystem(operatingSystems: Set[OperatingSystem.Value]): DeviceBuilderFluent = {
    device.operatingSystems = device.operatingSystems ++ (operatingSystems)
    this
  }
  
  def screen(): DeviceBuilderFluent = {
    device.screen = "13' built-in display"
    this
  }
  
  def build(): Device = {
    device
  }
}
