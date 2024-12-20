package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                           BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.LightGray)
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(
            text = stringResource(R.string.name),
            fontSize = 24.sp,
        )
        Text(
            text = stringResource(R.string.title),
           fontSize = 16.sp,
        )
    }
    Box(
        modifier = Modifier
            .padding(bottom = 60.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.padding(bottom = 8.dp),
                ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_phone_24),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                        .padding(end = 8.dp)
                )
                Text(
                    text = stringResource(R.string.phone_number),
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_share_24),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                        .padding(end = 8.dp)
                )
                Text(
                    text = stringResource(R.string.share),
                    fontSize = 16.sp
                )
            }
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.baseline_email_24),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .padding(end = 8.dp)
                )
                Text(
                    text = stringResource(R.string.email),
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}