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
package com.example.androiddevchallenge.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.common.SootheTextField
import com.example.androiddevchallenge.ui.common.hGutter
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun LoginScreen(onLoginClick: () -> Unit) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier.height(200.dp)
                ) {
                    Text(
                        text = "LOG IN",
                        style = MaterialTheme.typography.h1,
                        color = MaterialTheme.colors.onBackground
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                SootheTextField(
                    value = "",
                    placeholder = "Email address"
                )

                Spacer(modifier = Modifier.height(8.dp))

                SootheTextField(
                    value = "",
                    placeholder = "Password"
                )

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = onLoginClick,
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                    elevation = ButtonDefaults.elevation(0.dp, 8.dp, 8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(72.dp)
                        .hGutter()
                ) {
                    Text(
                        text = "LOG IN",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onPrimary,
                    )
                }

                Row(verticalAlignment = Alignment.Bottom, modifier = Modifier.height(32.dp)) {
                    Text(
                        text = "Don't have an account? ",
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onBackground
                    )
                    Text(
                        text = "Sign up",
                        style = MaterialTheme.typography.body1.copy(
                            textDecoration = TextDecoration.Underline
                        ),
                        color = MaterialTheme.colors.onBackground
                    )
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreviewLoginScreen() {
    MyTheme {
        LoginScreen {}
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreviewLoginScreen() {
    MyTheme(darkTheme = true) {
        LoginScreen {}
    }
}
