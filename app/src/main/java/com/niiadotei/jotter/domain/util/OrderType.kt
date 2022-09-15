package com.niiadotei.jotter.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
