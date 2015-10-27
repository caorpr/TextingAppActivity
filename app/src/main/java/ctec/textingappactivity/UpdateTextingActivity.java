package ctec.textingappactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.widget.Sms;

public class UpdateTextingActivity extends Activity
{

    private EditText RecieveField;
    private EditText SendField;
    private EditText NumberField;
    private Button Send;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_texting);

        SendField = (EditText) findViewById(R.id.SendField);
        NumberField = (EditText) findViewById(R.id.NumberField);
        Send = (Button) findViewById(R.id.Send);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_update_texting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        Send.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View currentView)
            {
                try
                {
                    String contact = NumberField.getText().toString();
                    String message = SendField.getText().toString();
                    sendSMS(contact, message);

                    Toast.makeText(currentView.getContext(), "Message Sent", Toast.LENGTH_SHORT).show();
                }
                catch(Exception currentException)
                {
                    Toast.makeText(currentView.getContext(), "Message Failed To Send", Toast.LENGTH_LONG).show();
                    Toast.makeText(currentView.getContext(), currentException.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void sendSMS(String messageAddress, String messageContext)
    {
        SmsManager mySMSManager = SmsManager.getDefault();
        mySMSManager.sendTextMessage(messageAddress, null, messageContent, null, null);
    }


}