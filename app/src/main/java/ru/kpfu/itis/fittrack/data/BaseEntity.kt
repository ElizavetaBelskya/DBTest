package ru.kpfu.itis.fittrack.data

abstract class BaseEntity (
    open var id: Int,
    open var title: String,
    open var calories: Int,
)
