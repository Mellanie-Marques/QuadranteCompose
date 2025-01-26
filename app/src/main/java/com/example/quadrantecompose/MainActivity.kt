package com.example.quadrantecompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantecompose.ui.theme.QuadranteComposeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadranteComposeTheme {
                Scaffold( modifier = Modifier.fillMaxSize(),
                    contentColor =  MaterialTheme.colorScheme.background,){
                    QuadranteComposeApp()
                }
            }
        }
    }
}

@Composable
fun QuadranteComposeApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CardInformaçaoCompose(
                title = stringResource(R.string.primeiro_titulo),
                description = stringResource(R.string.primera_descricao),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f),
                
            )
            CardInformaçaoCompose(
                title = stringResource(R.string.segundo_titulo),
                description = stringResource(R.string.segunda_descricao),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            CardInformaçaoCompose(
                title = stringResource(R.string.terceiro_titulo),
                description = stringResource(R.string.terceira_descricao),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            CardInformaçaoCompose(
                title = stringResource(R.string.quarto_titulo),
                description = stringResource(R.string.quarta_descricao),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun CardInformaçaoCompose(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun QuadranteComposeAppPreview() {
    QuadranteComposeTheme  {
        QuadranteComposeApp()
    }
}