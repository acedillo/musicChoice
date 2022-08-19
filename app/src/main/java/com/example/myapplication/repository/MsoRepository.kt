package com.example.myapplication.repository

import com.example.myapplication.model.MSO

interface MsoRepository {
    fun getMSOs(): List<MSO>
}