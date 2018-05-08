package com.mposluszny.dp.builder.domain

object DeviceType extends Enumeration {
  type DeviceType = Value
  val SMARTPHONE = Value("Smartphone")
  val TABLET = Value("Tablet")
  val PC = Value("PC")
  val SMARTWATCH = Value("Smartwatch")
}