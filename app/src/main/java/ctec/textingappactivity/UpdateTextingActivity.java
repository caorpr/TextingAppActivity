package ctec.textingappactivity;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.telephony.SmsManager;
import java.util.ArrayList;




/**
 *  @author Ariana Fairbanks
 *  @author Clayton Anderson
 */


/**
 * Declaration section.
 */


public class UpdateTextingActivity extends Activity
{

<<<<<<< HEAD
    /**
     * Setting up all of the GUI
     */
    private EditText RecieveField;
=======
>>>>>>> origin/master
    private EditText SendField;
    private EditText NumberField;
    private Button Send;
    private Button Thomas;
    private Button Clayton;
    private Button Unknown;
    private ArrayList<String> ContactList;

    /**
     * Instantiates GUI elements and calls the setupListeners() method.
     * @param savedInstanceState Sets the current state as the last saved instance.
     */

    /**
     * Sets up gui, setuplisteners, and onCreate Method.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_texting);

        SendField = (EditText) findViewById(R.id.SendField);
        NumberField = (EditText) findViewById(R.id.NumberField);
        Send = (Button) findViewById(R.id.Send);
        Thomas = (Button) findViewById (R.id.Thomas);
        Clayton = (Button) findViewById (R.id.Clayton);
        Unknown = (Button) findViewById (R.id.unknown);
        ContactList = (new ArrayList());

        ContactList.add("Hello Thomas.");
        ContactList.add("Hello Clayton.");
        ContactList.add("Greetings from CTEC!");



        setupListeners();
    }

    /**
<<<<<<< HEAD
     * Adds items to the action bar...?
     * @param menu
     * @return
     */
=======
     * @param menu Inflates the menu and, if available, adds items to the action bar.
     * @return Returns true.
     */

>>>>>>> origin/master
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_update_texting, menu);
        return true;
    }

    /**
<<<<<<< HEAD
     * Handles the action bar items...?
=======
     *
>>>>>>> origin/master
     * @param item
     * @return
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();


        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
<<<<<<< HEAD
     * Sets up all of the GUI components for when they are "activated"
=======
     * Sets up listeners.
>>>>>>> origin/master
     */

    private void setupListeners()
    {
        Send.setOnClickListener(new View.OnClickListener()
        {

            /**
             *
             * @param currentView
             */

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

        /**
         * Automatically inputs Thomas' contact information and a message for him when the 'Thomas' button is pressed.
         */

        Thomas.setOnClickListener(new View.OnClickListener()
        {

            public void onClick(View currentView)
            {
                NumberField.setText("8018088495");
                SendField.setText(ContactList.get(0).toString());

            }

        });

        /**
         * Automatically inputs Clayton's contact information and a message for him when the 'Clayton' button is pressed.
         */

        Clayton.setOnClickListener(new View.OnClickListener()
        {
        public void onClick(View currentView)
        {
            NumberField.setText("8018088495");
            SendField.setText(ContactList.get(1).toString());

        }

        });

        /**
         * Automatically inputs contact information and a message when the button is pressed.
         */

        Unknown.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View currentView)
            {
                NumberField.setText("8015607545");
                SendField.setText(ContactList.get(2).toString());

            }


        });
    }

    /**
<<<<<<< HEAD
     * Sends a typed in message to an inputed number.
     * @param messageAddress
     * @param messageContent
=======
     * Uses the SMS Manager to send the SMS message.
     * @param messageAddress Where you are sending the message.
     * @param messageContent What is in the message.
>>>>>>> origin/master
     */

    private void sendSMS(String messageAddress, String messageContent)

    {
        SmsManager mySMSManager = SmsManager.getDefault();
        mySMSManager.sendTextMessage(messageAddress, null, messageContent, null, null);
    }


}
