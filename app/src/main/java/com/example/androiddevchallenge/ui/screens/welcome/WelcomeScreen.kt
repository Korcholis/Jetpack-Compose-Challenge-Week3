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
package com.example.androiddevchallenge.ui.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.common.hGutter
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun WelcomeScreen(onSignUpClick: () -> Unit, onLoginClick: () -> Unit) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.welcome),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Image(painterResource(id = R.drawable.logo), contentDescription = "Logo")
                Spacer(modifier = Modifier.height(32.dp))
                Button(
                    onClick = onSignUpClick,
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                    elevation = ButtonDefaults.elevation(0.dp, 8.dp, 8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(72.dp)
                        .hGutter()
                ) {
                    Text(
                        text = "SIGN UP",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onPrimary,
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = onLoginClick,
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
                    elevation = ButtonDefaults.elevation(0.dp, 8.dp, 8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(72.dp)
                        .hGutter(),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(
                        text = "LOG IN",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onSecondary
                    )
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreviewWelcomeScreen() {
    MyTheme {
        WelcomeScreen({}, {})
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreviewWelcomeScreen() {
    MyTheme(darkTheme = true) {
        WelcomeScreen({}, {})
    }
}
