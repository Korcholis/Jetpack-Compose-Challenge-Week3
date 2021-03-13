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
package com.example.androiddevchallenge.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.domain.repository.FavoriteCollection
import com.example.androiddevchallenge.domain.repository.MindCollection
import com.example.androiddevchallenge.domain.repository.YogaCollection
import com.example.androiddevchallenge.ui.common.BottomBar
import com.example.androiddevchallenge.ui.common.SootheTextField

@Composable
fun HomeScreen(selectedTab: Int, setSelectedTab: (Int) -> Unit) {
    val favScrollState = rememberLazyListState()
    val bodyScrollState = rememberLazyListState()
    val mindScrollState = rememberLazyListState()

    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Spacer(modifier = Modifier.height(56.dp))
                SootheTextField(
                    value = "",
                    leadingIcon = Icons.Default.Search,
                    placeholder = "Search"
                )
                HomeHeader("Favorite collections")
                LazyRow(state = favScrollState) {
                    items(FavoriteCollection.chunked(2)) { sublist ->
                        Column {
                            sublist.forEach {
                                FavoriteCell(fav = it)
                                Spacer(modifier = Modifier.height(8.dp))
                            }
                        }
                    }
                }
                HomeHeader("Align your body")
                LazyRow(state = bodyScrollState) {
                    items(YogaCollection) {
                        ExerciseCell(it)
                    }
                }
                HomeHeader("Align your mind")
                LazyRow(state = mindScrollState) {
                    items(MindCollection) {
                        ExerciseCell(it)
                    }
                }
            }
        },
        bottomBar = { BottomBar(selectedTab, setSelectedTab) },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary,
                onClick = {}
            ) {
                Icon(Icons.Default.PlayArrow, contentDescription = "Play")
            }
        }
    )
}
