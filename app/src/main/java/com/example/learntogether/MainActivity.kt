package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Compose_tutorial(
                        stringResource(R.string.Titre),
                        stringResource(R.string.bloc1),
                        stringResource(R.string.bloc2)
                    )
                }
            }
        }
    }
}

@Composable
fun Compose_tutorial(libel : String, bloc1 : String, bloc2 : String, modifier: Modifier = Modifier) {


     Column(
         verticalArrangement = Arrangement.Center
     ){

         Image(

             painter = painterResource(R.drawable.bg_compose_background),
             contentDescription = "Image en-tête"
         )

         Text(
            text = libel,
             fontSize = 24.sp,

            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = bloc1,

            modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = bloc2,
            modifier = Modifier.padding( 16.dp),
            textAlign = TextAlign.Justify
        )

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Compose_tutorial(
            stringResource(R.string.Titre),
            stringResource(R.string.bloc1),
            stringResource(R.string.bloc2)
        )
    }
}