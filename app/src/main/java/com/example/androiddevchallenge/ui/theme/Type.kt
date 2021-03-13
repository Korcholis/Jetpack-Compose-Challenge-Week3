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
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

val Kulim = FontFamily(
    Font(R.font.kulimpark_regular),
    Font(R.font.kulimpark_italic, style = FontStyle.Italic),
    Font(R.font.kulimpark_light, FontWeight.Light),
    Font(R.font.kulimpark_lightitalic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.kulimpark_bold, FontWeight.Bold),
    Font(R.font.kulimpark_bolditalic, FontWeight.Bold, FontStyle.Italic),
)

val Lato = FontFamily(
    Font(R.font.lato_regular),
    Font(R.font.lato_italic, style = FontStyle.Italic),
    Font(R.font.lato_bold, FontWeight.Bold),
    Font(R.font.lato_bolditalic, FontWeight.Bold, FontStyle.Italic),
)

// Set of Material typography styles to start with
val typography = Typography(
    h1 = TextStyle(
        fontFamily = Kulim,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = 1.15f.sp
    ),
    h2 = TextStyle(
        fontFamily = Kulim,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = 1.15f.sp
    ),
    h3 = TextStyle(
        fontFamily = Kulim,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 1.15f.sp
    ),
    caption = TextStyle(
        fontFamily = Kulim,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 1.15f.sp
    )
)
