package com.axcode.reminder.domain.model

import java.util.Date

data class Reminder(
    val subject: String,
    val description: String,
    val makeAt: Date,
    val createdAt: Date
)