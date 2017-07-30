package khilman.example.pesonacirebon;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ImagePost extends Fragment {
    TextView postDesc;
    ImageView postImage;
    int[] thumb = {R.drawable.gua_sunyagi, R.drawable.keraton_kanoman, R.drawable.masjid_agung, R.drawable.keraton_kasepuhan, R.drawable.masjid_agung, R.drawable.masjid_agung};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_image_post, container, false);
        postDesc = (TextView) v.findViewById(R.id.postDesc);
        postImage = (ImageView) v.findViewById(R.id.postImage);
        postDesc.setText(getActivity().getIntent().getStringExtra("postDesc"));
        int thumbId = Integer.parseInt(getActivity().getIntent().getStringExtra("postImage"));
        postImage.setImageResource(thumb[thumbId]);
        return v;
    }
}
