package com.me.compose.sample

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.me.compose.sample.ui.theme.AndroidcomposeTheme

class MainActivityCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidcomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        Modifier
                            .fillMaxSize()
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(4f)
                                .wrapContentHeight(Alignment.CenterVertically)
                        ) {
                            CardHeader()
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            CardDescription(iconRes = R.drawable.ic_info_black_24dp, "info")
                            CardDescription(
                                iconRes = R.drawable.ic_check_circle_black_24dp,
                                "check"
                            )
                            CardDescription(iconRes = R.drawable.ic_delete_black_24dp, "delete")
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String) {

    Box(content = {
        Column(
            modifier = Modifier.fillMaxHeight(),
            content = {
                Text(
                    text = "Hello $name",
                    fontSize = 32.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(10.dp)
                )
                Text(
                    text = "From $from", modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .padding(10.dp)
                )
            })
    })
}

@Composable
fun CardDescription(iconRes: Int, message: String) {
    val iconPainter = painterResource(id = iconRes)
    Column {
        Spacer(modifier = Modifier.height(14.dp))
        Row {
            Spacer(modifier = Modifier.width(50.dp))
            Icon(painter = iconPainter, contentDescription = null, tint = Color.White)
            Spacer(modifier = Modifier.width(50.dp))
            Text(
                text = message,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .wrapContentHeight(Alignment.CenterVertically),
                fontSize = 18.sp,
                style = TextStyle(color = Color.White)
            )
        }
    }
}

@Composable
fun CardHeader() {
    val image = painterResource(R.drawable.ic_launcher_foreground)
    Column(
    ) {
        Image(
            painter = image, contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
        )
        Text(
            text = "Att Mui",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
            fontSize = 38.sp
        )
        Text(
            text = "Att Mui",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
            fontSize = 12.sp,
            style = TextStyle(color = Color.Green, fontWeight = FontWeight.Bold)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AndroidcomposeTheme {
        Column(
            Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .weight(4f)
                    .wrapContentHeight(Alignment.CenterVertically)
            ) {
                CardHeader()
            }
            Column(modifier = Modifier.weight(1f)) {
                CardDescription(iconRes = R.drawable.ic_info_black_24dp, "info")
                CardDescription(iconRes = R.drawable.ic_check_circle_black_24dp, "check")
                CardDescription(iconRes = R.drawable.ic_delete_black_24dp, "delete")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardHeaderPreview() {
    CardHeader()
}

@Preview(showBackground = true)
@Composable
fun CardDescriptionPreview() {
    CardDescription(iconRes = R.drawable.ic_info_black_24dp, "demo")
}

