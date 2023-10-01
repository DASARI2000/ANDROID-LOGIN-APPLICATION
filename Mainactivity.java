package com.example.login;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
final EditText e1 =(EditText)findViewById(R.id.et1);
final EditText e2 =(EditText)findViewById(R.id.et2);
Button b1=(Button)findViewById(R.id.b1);
b1.setOnClickListener(new View.OnClickListener(){
public void onClick(View v){
if(
(
"admin".equals(e1.getText().toString())
&&"test".equals(e2.getText().toString())
)
||(
"ADMIN".equals(e1.getText().toString()) &&
"TEST".equals(e2.getText().toString())
)
)
{
Toast.makeText(getApplicationContext(),"SUCESSFUL
LOGIN"
,Toast.LENGTH_SHORT).show();
}
else {
Toast.makeText(getApplicationContext(),"INVALID
LOGIN",Toast.LENGTH_SHORT).show();
}
}
});
}
}
