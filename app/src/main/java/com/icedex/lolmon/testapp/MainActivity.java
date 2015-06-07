package com.icedex.lolmon.testapp;


import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.icedex.lolmon.testapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setExitTransition(new Slide(Gravity.START).setDuration(300));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(getResources().getColor(R.color.primary_dark));

    }

    private void onAttach() {

        Snackbar
                .make(this.findViewById(android.R.id.content), R.string.toast_notext, Snackbar.LENGTH_LONG)
                .show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        if (editText.getText().toString().isEmpty()) {
            onAttach();
            return;
        }
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, SettingsActivity.class);
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                return true;
        }
        return super.onMenuItemSelected(id, item);
    }
}
