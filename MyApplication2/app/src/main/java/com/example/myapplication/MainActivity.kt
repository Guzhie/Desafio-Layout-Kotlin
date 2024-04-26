package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cadastro()
                }
            }
        }
    }
}


@Composable
    fun cadastro() {
        var text by remember {mutableStateOf("")
        }

    Column(
        Modifier
            .background(Color.Black)
            .fillMaxWidth()) {

        Row(Modifier.padding(8.dp)) {
        }

    Row(Modifier
        .fillMaxWidth()
        ,Arrangement.Center) {
        Text(text = "App Cadastro")
        }


        Row(Modifier.padding(8.dp)) {
        }
        Row(Modifier.padding(8.dp)) {
        }

        Row(Modifier
            .fillMaxWidth()
            ,Arrangement.Center) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Nome") },
            )
        }
        Row(Modifier.padding(8.dp)) {
        }
        Row(Modifier
            .fillMaxWidth()
            ,Arrangement.Center) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Endereço") },
            )
        }
        Row(Modifier.padding(8.dp)) {
        }
        Row(Modifier
            .fillMaxWidth()
            ,Arrangement.Center) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Bairro") },
            )
        }
        Row(Modifier.padding(8.dp)) {
        }
        Row(Modifier
            .fillMaxWidth()
            ,Arrangement.Center) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("CEP") },
            )
        }
        Row(Modifier.padding(8.dp)) {
        }
        Row(Modifier
            .fillMaxWidth()
            ,Arrangement.Center) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Cidade") },
            )
        }
        Row(Modifier.padding(8.dp)) {
        }
        Row(Modifier
            .fillMaxWidth()
            ,Arrangement.Center) {
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Estado") },
            )
        }
        Row(Modifier.padding(8.dp)) {
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        cadastro()
    }
}