package com.ysanjeet535.androidrichtexteditorexploration

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ysanjeet535.androidrichtexteditorexploration.data.Library
import com.ysanjeet535.androidrichtexteditorexploration.data.exploredLibraries
import com.ysanjeet535.androidrichtexteditorexploration.librarydemo.RichEditorOne
import com.ysanjeet535.androidrichtexteditorexploration.ui.theme.AndroidRichTextEditorExplorationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidRichTextEditorExplorationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val context = LocalContext.current
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(32.dp)
                    ) {
                        items(exploredLibraries.size) {
                            LibraryItem(library = exploredLibraries[it]) {
                                startActivity(Intent(context, RichEditorOne::class.java))
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LibraryItem(library: Library = Library.getDummy(), onItemClicked: () -> Unit = {}) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight()
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Cyan.copy(alpha = 0.1f))
            .padding(16.dp)
            .clickable {
                onItemClicked()
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = library.name, style = MaterialTheme.typography.body1)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Star, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = library.stars.toString())
        }
    }
}

@Preview
@Composable
fun LibraryItemPreview() {
    LibraryItem()
}

