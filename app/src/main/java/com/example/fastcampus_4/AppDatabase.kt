package com.example.fastcampus_4

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fastcampus_4.dao.HistoryDao
import com.example.fastcampus_4.model.History

//버전을 명시해서 migration 코드로 유지를 해야함
@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao() : HistoryDao
}