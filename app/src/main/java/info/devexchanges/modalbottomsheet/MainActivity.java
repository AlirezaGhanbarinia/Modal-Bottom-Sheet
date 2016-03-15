package info.devexchanges.modalbottomsheet;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View showModalBottomSheet = findViewById(R.id.as_modal);
        showModalBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Initializing a bottom sheet
                BottomSheetDialogFragment bottomSheetDialogFragment = new CustomBottomSheetDialogFragment();

                //show it
                bottomSheetDialogFragment.show(getSupportFragmentManager(), bottomSheetDialogFragment.getTag());
            }
        });
    }
}
