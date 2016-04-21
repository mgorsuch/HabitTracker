package com.example.james.sqlitepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText jamesInput;
    TextView jamesText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jamesInput = (EditText) findViewById(R.id.jamesInput);
        jamesText = (TextView) findViewById(R.id.jamesText);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }
    //Add a product to the database
    public void addButtonClick(View view){
        Products product = new Products(jamesInput.getText().toString());
        dbHandler.addProduct(product);
        printDatabase();
    }

    //Delete items
    public void deleteButtonClicked(View view){
        String inputText = jamesInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        jamesText.setText(dbString);
        jamesInput.setText(""); // clear the input field after add/delete
    }


}
