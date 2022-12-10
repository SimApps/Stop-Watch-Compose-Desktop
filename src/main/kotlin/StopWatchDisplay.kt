import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StopWatchDisplay(
    formattedTime : String,
    onStartClick : ()->Unit,
    onPauseClick : ()->Unit,
    onResetClick : ()->Unit,
    modifier : Modifier = Modifier
){
Column(modifier = modifier,
       verticalArrangement =  Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally
    ){
Text(
    text = formattedTime,
    fontWeight = FontWeight.Bold,
    fontSize = 30.sp,
    color = Color.Black
)
    Spacer(modifier.height(16.dp))

}
}