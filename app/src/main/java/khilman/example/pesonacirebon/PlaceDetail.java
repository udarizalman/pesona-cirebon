package khilman.example.pesonacirebon;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detail);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ImagePost ip = new ImagePost();
        fragmentTransaction.replace(R.id.postContainer, ip);
        fragmentTransaction.commit();
        /*

        postDesc.setText(getIntent().getStringExtra("postDesc"));
        int thumbId = Integer.parseInt(getIntent().getStringExtra("postImage"));
        postImage.setImageResource(thumb[thumbId]);*/

    }
}
