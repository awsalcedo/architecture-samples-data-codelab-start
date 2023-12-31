/*
 * Copyright 2019 The Android Open Source Project
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

package com.example.android.architecture.blueprints.todoapp.data.source.local

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test

class TaskDaoTest {
    private lateinit var database: ToDoDatabase

    /*
    Create database in memory before each test
    A database in memory is much faster than a database on disk
    This makes it a good choice for automated testing where the data does not need persist longer that the test
    */
    @Before
    fun initDb() {
        database = Room.inMemoryDatabaseBuilder(
            getApplicationContext(), ToDoDatabase::class.java
        ).allowMainThreadQueries().build()
    }

    @Test
    fun insertTaskAndGetTasks() = runTest {

    }
}